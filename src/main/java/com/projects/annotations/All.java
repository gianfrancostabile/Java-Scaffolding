package com.projects.annotations;

import org.apache.log4j.Logger;

public class All implements IAbstractClass {

   static Logger logger = Logger.getLogger(All.class);

   public All() { }

   /**
    * Create all the files and their classes
    *
    * TODO
    *
    */
   @Override
   public void build() {
      logger.debug("ALL");
   }
}
