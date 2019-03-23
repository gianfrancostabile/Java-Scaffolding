package com.projects.annotations;

import org.apache.log4j.Logger;

public class Repository implements AbstractClass {

   static Logger logger = Logger.getLogger(Repository.class);

   public Repository() {
   }

   /**
    * Create the repository file and class
    *
    * TODO
    *
    */
   @Override
   public void build() {
      logger.debug("REPOSITORY");
   }
}
