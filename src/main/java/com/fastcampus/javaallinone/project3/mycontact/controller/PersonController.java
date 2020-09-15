package com.fastcampus.javaallinone.project3.mycontact.controller;

import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import com.fastcampus.javaallinone.project3.mycontact.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mileNote on 2020-09-15
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@RequestMapping(value = "/api/person")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    @RequestMapping(value = "{id}")
    public Person getPerson(@PathVariable Long id){
        return personService.getPerson(id);
    }
}
