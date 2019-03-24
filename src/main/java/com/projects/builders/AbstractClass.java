package com.projects.builders;

public abstract class AbstractClass implements IBuildClass{
   protected String sufix = "";

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
    * Builds method declaration
    *
    * @param definitionDTO
    */
   @Override
   public void buildMethod(DefinitionDTO definitionDTO) {

   }

   /**
    * Builds attribute definition
    *
    * @param definitionDTO
    */
   @Override
   public void buildAttribute(DefinitionDTO definitionDTO) {

   }
}
