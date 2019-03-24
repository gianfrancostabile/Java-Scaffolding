package com.projects.builders;

import com.projects.annotations.Scaffolding;
import org.apache.log4j.Logger;

public class AbstractClassFactory {
   static Logger logger = Logger.getLogger(AbstractClassFactory.class);

   public static AbstractClass build(Scaffolding.Type type) {
      AbstractClass clazz = null;
      switch (type) {
         case ALL: {
            clazz = new All();
            break;
         }
         case CONTROLLER: {
            clazz = new Controller();
            break;
         }
         case SERVICE: {
            clazz = new Service();
            break;
         }
         case REPOSITORY: {
            clazz = new Repository();
            break;
         }
      }
      return clazz;
   }
}
