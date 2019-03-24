package com.projects.builders;

import com.projects.scaffolding.ScaffoldingType;
import com.projects.utilities.ApplicationStore;
import org.apache.log4j.Logger;

public class AbstractClassFactory {
   static Logger logger = Logger.getLogger(AbstractClassFactory.class);

   public static AbstractClass build(ScaffoldingType type) {
      AbstractClass clazz = null;
      switch (type) {
         case ALL: {
            clazz = (All) ApplicationStore.get(All.class);
            break;
         }
         case CONTROLLER: {
            clazz = (Controller) ApplicationStore.get(Controller.class);
            break;
         }
         case SERVICE: {
            clazz = (Service) ApplicationStore.get(Service.class);
            break;
         }
         case REPOSITORY: {
            clazz = (Repository) ApplicationStore.get(Repository.class);
            break;
         }
      }
      return clazz;
   }
}
