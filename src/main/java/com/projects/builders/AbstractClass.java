package com.projects.builders;

import com.projects.scaffolding.ScaffoldingType;
import com.projects.utilities.Utils;
import org.apache.log4j.Logger;

import java.io.File;

public abstract class AbstractClass implements IBuildClass {
   static Logger logger = Logger.getLogger(AbstractClassFactory.class);
   protected String sufix = ScaffoldingType.ALL.getValue();
   protected StringBuilder stringBuilder = new StringBuilder();

   private String filePath = "";
   private String fileName = "";
   private String pathToFile = "";

   @Override
   public void build(Class<?> clazz) {
      this.setPathToFile("src/main/java/com/projects/");
      this.setFileName(clazz.getSimpleName());

      File newFile = Utils.createFile(this.getPathToFile(), this.getFileName());
      if (newFile != null) {
         this.setFilePath(newFile.getPath());
         logger.debug(this.getFilePath());
      }
   }

   /**
    * Builds class declaration and constructors
    *
    * @param definitionDTO
    * @param extensionClass
    * @param implementationClasses
    */
   @Override
   public void buildClass(DefinitionDTO definitionDTO, Class<?> extensionClass, Class<?>[] implementationClasses) {

   }

   /**
    * Builds all class's methods
    */
   @Override
   public void buildMethods() {
   }

   /**
    * Builds method declaration
    *
    * @param definitionDTO
    */
   @Override
   public void buildMethod(DefinitionDTO definitionDTO) {

   }

   /**
    * Builds all class's attributes
    */
   @Override
   public void buildAttributes() {
   }

   /**
    * Builds attribute definition
    *
    * @param definitionDTO
    */
   @Override
   public void buildAttribute(DefinitionDTO definitionDTO) {

   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof AbstractClass)) return false;

      AbstractClass that = (AbstractClass) o;

      if (sufix != null ? !sufix.equals(that.sufix) : that.sufix != null) return false;
      if (stringBuilder != null ? !stringBuilder.equals(that.stringBuilder) : that.stringBuilder != null) return false;
      if (getFilePath() != null ? !getFilePath().equals(that.getFilePath()) : that.getFilePath() != null) return false;
      if (getFileName() != null ? !getFileName().equals(that.getFileName()) : that.getFileName() != null) return false;
      return getPathToFile() != null ? getPathToFile().equals(that.getPathToFile()) : that.getPathToFile() == null;
   }

   @Override
   public int hashCode() {
      int result = sufix != null ? sufix.hashCode() : 0;
      result = 31 * result + (stringBuilder != null ? stringBuilder.hashCode() : 0);
      result = 31 * result + (getFilePath() != null ? getFilePath().hashCode() : 0);
      result = 31 * result + (getFileName() != null ? getFileName().hashCode() : 0);
      result = 31 * result + (getPathToFile() != null ? getPathToFile().hashCode() : 0);
      return result;
   }

   public String getFileName() {
      return this.fileName;
   }

   public void setFileName(String name) {
      this.stringBuilder.setLength(0);
      this.fileName = this.stringBuilder.append(name).append(sufix).toString();
      this.stringBuilder.setLength(0);
   }

   public String getPathToFile() {
      return this.pathToFile;
   }

   public void setPathToFile(String parent) {
      this.stringBuilder.setLength(0);
      this.pathToFile = this.stringBuilder.append(parent).append(sufix.toLowerCase()).toString();
      this.stringBuilder.setLength(0);
   }

   public String getFilePath() {
      return this.filePath;
   }

   public void setFilePath(String path) {
      this.filePath = path;
   }
}
