package com.projects.builders;

import com.projects.scaffolding.ScaffoldingType;
import org.apache.log4j.Logger;

import java.io.IOException;

public class Service extends AbstractClass {

   static Logger logger = Logger.getLogger(Controller.class);

   public Service() {
      sufix = ScaffoldingType.SERVICE.getValue();
   }

   /**
    * Builds a complete class
    *
    * @param clazz The class that will be builded
    */
   @Override
   public void build(Class<?> clazz) throws IOException {
      super.build(clazz);
   }

   /**
    * Builds all class's methods
    */
   @Override
   public void buildMethods() {

   }

   /**
    * Builds all class's attributes
    */
   @Override
   public void buildAttributes() {

   }
}
