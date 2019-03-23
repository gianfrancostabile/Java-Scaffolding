package com.projects.pojo;

import com.projects.annotations.Scaffolding;

import java.util.Date;

@Scaffolding(type = Scaffolding.Type.SERVICE)
public class Person {
   private long ID;
   private String firstname;
   private String lastname;
   private Date birthdate;
}
