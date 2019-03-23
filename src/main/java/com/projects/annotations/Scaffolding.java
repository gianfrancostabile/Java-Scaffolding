package com.projects.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Scaffolding {
  enum Type {
    CONTROLLER, SERVICE, REPOSITORY, ALL
  }

  /**
   * Prefix of class name
   */
  String name();

  /**
   * Type of file to create
   */
  Type type() default Type.ALL;
}