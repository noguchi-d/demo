package com.example.demo.resource.impl;

import com.example.demo.entity.Person;
import com.example.demo.resource.HelloResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.NotFoundException;

/**
 * Created by noguchi on 17/05/28.
 */
@Component
public class HelloResourceImpl implements HelloResource {

    private static Person[] persons = {
        createPerson(1, "hoge", "Tokyo"),
        createPerson(2, "fuge", "Osaka"),
        createPerson(3, "piyo", "Nagoya")
    };

    private static Person createPerson(Integer id, String name, String address) {
        Person p = new Person(id, name, address);
        return p;
    }

    public String asText() {
        return "This is first msg.";
    }

    public Person getPerson(Integer id) {
        if (id > persons.length) {
            throw new NotFoundException("No such person.");
        }
        return persons[id - 1];
    }
}
