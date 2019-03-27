package com.projects.utilities;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Utils {
   static Logger logger = Logger.getLogger(Utils.class);

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

   /**
    * @param folderPath
    * @param fileName
    * @return generated File instance
    */
   public static File createFile(String folderPath, String fileName) {
      String extension = ".xml";
      StringBuilder stringBuilder = new StringBuilder();

      String fileSeparator = System.getProperty("file.separator");
      String filePath = stringBuilder.append(folderPath).append(fileSeparator).append(fileName).append(extension).toString();
      stringBuilder.setLength(0);

      File folder = new File(folderPath);
      if (!folder.exists() || !folder.isDirectory()) {
         folder.mkdirs();
      }
      File newFile = new File(filePath);
      try {
         if (newFile.createNewFile()) {
            logger.debug(stringBuilder.append(filePath).append(" file created."));
            stringBuilder.setLength(0);
         } else {
            logger.debug(stringBuilder.append(filePath).append(" class already exists."));
            stringBuilder.setLength(0);
            newFile = null;
         }
      } catch (IOException ioe) {
         logger.error(ioe.getMessage(), ioe);
         newFile = null;
      }
      return newFile;
   }
}
