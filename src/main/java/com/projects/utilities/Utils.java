package com.projects.utilities;

public class Utils {
   /**
    * Parses url format from File to Class.forName() format requirement
    * <p>
    * TODO search a better solution
    *
    * @param path : Path to parse
    * @return Path parsed
    */
   public static String parsePath(String path) {
      // Parse '\' to '.'
      path = path.replace("\\", ".");
      // Remove everything behind 'com'
      int index = path.indexOf(".com.");
      path = path.substring(index + 1);
      // Remove the .class or .java extension
      path = path.replaceAll("((\\.java)|(\\.class))$", "");
      return path;
   }
}
