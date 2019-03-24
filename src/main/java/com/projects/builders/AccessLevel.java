package com.projects.builders;

public enum AccessLevel {
   PUBLIC("public"),
   PROTECTED("protected"),
   PRIVATE("private");

   private final String value;

   AccessLevel(String value) {
      this.value = value;
   }

   public String getValue() {
      return this.value;
   }
}
