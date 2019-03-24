package com.projects.annotations;

import com.projects.builders.AbstractClassFactory;
import com.projects.builders.AbstractClass;
import com.projects.utilities.Utils;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Processor {
   static Logger logger = Logger.getLogger(Processor.class);

   public Processor() {
   }

   /**
    * Scaffolding processor
    *
    * TODO
    */
   public void process() {
      try {
         List<Class<?>> clazzList = this.getClassFromPath("src/main/java/com/projects/pojo");
         for (Class clazz : clazzList) {
            logger.debug(clazz.getName());
            generate((Scaffolding) clazz.getAnnotation(Scaffolding.class));
         }
      } catch (Exception e) {
         logger.error(e.getStackTrace(), e);
      }
   }

   /**
    * Search all classes that match with Scaffolding Annotation into the folder path
    *
    * @param path Folder path to analyze
    * @return List of classes that match with Scaffolding Annotation
    * @throws NullPointerException  path null
    * @throws ClassNotFoundException
    */
   private List<Class<?>> getClassFromPath(String path) throws NullPointerException, ClassNotFoundException {
      List<Class<?>> clazzList = new ArrayList<>();
      if (path != null) {
         File folder = new File(path);
         if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (File file : files) {
               String pathName = file.getPath();
               pathName = Utils.parsePath(pathName);
               Class clazz = Class.forName(pathName);
               Scaffolding annotation = (Scaffolding) clazz.getAnnotation(Scaffolding.class);
               if (annotation != null) {
                  clazzList.add(clazz);
               }
            }
         }
      } else {
         throw new NullPointerException("PATH can't be null");
      }
      return clazzList;
   }

   /**
    * Generates a class
    * <p>
    * TODO
    *
    * @param scaffolding
    */
   private void generate(Scaffolding scaffolding) {
      AbstractClass IAbstractClass = AbstractClassFactory.build(scaffolding.type());
      IAbstractClass.build();
   }
}