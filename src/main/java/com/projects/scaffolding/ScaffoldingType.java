package com.projects.scaffolding;

public enum ScaffoldingType {
   CONTROLLER("Controller"),
   SERVICE("Service"),
   REPOSITORY("Repository"),
   ALL("");

   private String value;

   ScaffoldingType(String value) {
      this.value = value;
   }

   public String getValue() {
      return this.value;
   }
}
