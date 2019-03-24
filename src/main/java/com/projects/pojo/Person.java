package com.projects.pojo;

import com.projects.scaffolding.Scaffolding;
import com.projects.scaffolding.ScaffoldingType;

import java.util.Date;

@Scaffolding(name = "Person", type = ScaffoldingType.SERVICE)
public class Person {
   private long ID;
   private String firstname;
   private String lastname;
   private Date birthdate;
   private Country country;
}
