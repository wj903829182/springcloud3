package com.jack.ui.controller;

import com.jack.ui.entity.Person;
import com.jack.ui.service.PersonHystrixService;
import com.jack.ui.service.SomeHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create by jack 2017/11/12
 */
@RestController
public class PersonController {
    @Autowired
    PersonHystrixService personHystrixService;

    @Autowired
    SomeHystrixService someHystrixService;

    @RequestMapping(value = "/save")
    public List<Person> save(String name){
        return personHystrixService.save(name);
    }

    @RequestMapping(value = "/getsome")
    public String getSome(){
        return someHystrixService.getSome();
    }
}
