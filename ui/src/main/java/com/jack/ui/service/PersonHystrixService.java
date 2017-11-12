package com.jack.ui.service;

import com.jack.ui.entity.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * create by jack 2017/11/11
 */
@Service
public class PersonHystrixService {

    @Autowired
    PersonService personService;

    /**
     * 使用@HystrixCommand的fallbackMethod参数指定，当本地方法调用失败时，调用后备方法fallbackMethod
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallbackSave")
    public List<Person> save(String name){
        return personService.save(name);
    }

    /**
     * 下面的fallbackSave方法需要参数，参数的个数和类型需要和save方法一样
     * @param name
     * @return
     */
    public List<Person> fallbackSave(String name){
        List<Person> list = new ArrayList<>();
        Person p = new Person("Person Service故障");
        list.add(p);
        return list;
    }

}
