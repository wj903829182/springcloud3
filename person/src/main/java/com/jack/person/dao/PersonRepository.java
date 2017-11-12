package com.jack.person.dao;


import com.jack.person.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * create by jack 2017/10/3
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {


}
