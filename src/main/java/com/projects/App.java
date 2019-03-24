package com.projects;

import com.projects.builders.All;
import com.projects.builders.Controller;
import com.projects.builders.Repository;
import com.projects.builders.Service;
import com.projects.scaffolding.Processor;
import com.projects.utilities.ApplicationStore;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class App {

   static Logger logger = Logger.getLogger(App.class);

   public static void main(String[] args) {
      BasicConfigurator.configure();

      loadStore();

      Processor processor = new Processor();
      processor.process();
   }

   private static void loadStore() {
      ApplicationStore.attach(new Repository());
      ApplicationStore.attach(new Service());
      ApplicationStore.attach(new Controller());
      ApplicationStore.attach(new All());
   }
}
