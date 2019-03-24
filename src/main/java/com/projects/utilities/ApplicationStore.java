package com.projects.utilities;

import java.util.HashMap;

public class ApplicationStore {
   private static HashMap<Class, Object> classes = new HashMap<>();

   public static void attach(Object objectValue) {
      Class objectKey = objectValue.getClass();
      classes.put(objectKey, objectValue);
   }

   public static Object get(Class clazz) {
      return classes.get(clazz);
   }
}
