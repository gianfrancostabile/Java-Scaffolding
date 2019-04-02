package com.projects.utilities;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Utils {
   private static Logger logger = Logger.getLogger(Utils.class);
   private static StringArchitect stringArchitect = new StringArchitect(new StringBuilder());

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

      String fileSeparator = System.getProperty("file.separator");
      String filePath = stringArchitect.beginSequence(folderPath).append(fileSeparator).append(fileName).append(extension).toString();

      File folder = new File(folderPath);
      if (!folder.exists() || !folder.isDirectory()) {
         folder.mkdirs();
      }
      File newFile = new File(filePath);
      try {
         if (newFile.createNewFile()) {
            logger.debug(stringArchitect.beginSequence(filePath).append(" file created.").toString());
         } else {
            logger.debug(stringArchitect.beginSequence(filePath).append(" file already exists.").toString());
            newFile = null;
         }
      } catch (IOException ioe) {
         logger.error(ioe.getMessage(), ioe);
         newFile = null;
      }
      return newFile;
   }
}
