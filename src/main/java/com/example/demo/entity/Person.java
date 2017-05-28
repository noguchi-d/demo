package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by noguchi on 17/05/28.
 */
//@XmlRootElement
public class Person {
    public Integer id;
    public String name;
    public String address;

    public Person(Integer id, String name, String address) {
        this.id      = id;
        this.name    = name;
        this.address = address;
    }
}
