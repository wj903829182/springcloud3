package com.jack.person.controller;

import com.jack.person.dao.PersonRepository;
import com.jack.person.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create by jack 2017/11/11
 */
@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String personName){
        Person p = new Person(personName);
        //需要设置id
        p.setId(2);
        personRepository.save(p);
        List<Person> people = personRepository.findAll(new PageRequest(0,10)).getContent();
        return people;
    }

}
