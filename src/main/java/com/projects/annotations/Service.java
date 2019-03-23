package com.projects.annotations;

import org.apache.log4j.Logger;

public class Service implements IAbstractClass {

   static Logger logger = Logger.getLogger(Controller.class);

   public Service() { }

   /**
    * Create the service file and class
    *
    * TODO
    *
    */
   @Override
   public void build() {
      logger.debug("SERVICE");
   }
}
