package com.projects.annotations;

import org.apache.log4j.Logger;

public class Controller implements AbstractClass {

   static Logger logger = Logger.getLogger(Controller.class);

   public Controller() {
   }

   /**
    * Create the controller file and class
    *
    * TODO
    *
    */
   @Override
   public void build() {
      logger.debug("CONTROLLER");
   }
}
