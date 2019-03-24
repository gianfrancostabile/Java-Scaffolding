package com.projects.builders;

import com.projects.utilities.ApplicationStore;
import org.apache.log4j.Logger;

public class All extends AbstractClass {

   static Logger logger = Logger.getLogger(All.class);

   private Repository repository = (Repository) ApplicationStore.get(Repository.class);
   private Service service = (Service) ApplicationStore.get(Service.class);
   private Controller controller = (Controller) ApplicationStore.get(Controller.class);

   public All() {
   }

   /**
    * Build controller, service and repository to the class
    *
    * @param clazz The class that will be builded
    */
   @Override
   public void build(Class<?> clazz) {
      repository.build(clazz);
      service.build(clazz);
      controller.build(clazz);
   }
}
