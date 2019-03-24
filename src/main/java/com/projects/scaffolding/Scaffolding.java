package com.projects.scaffolding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Scaffolding {
   /**
    * Prefix of class name
    */
   String name();

   /**
    * Type of file to create
    */
   ScaffoldingType type() default ScaffoldingType.ALL;
}