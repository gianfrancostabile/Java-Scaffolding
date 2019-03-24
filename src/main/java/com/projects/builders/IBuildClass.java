package com.projects.builders;

public interface IBuildClass {

   /**
    * Builds a complete class
    *
    * @param clazz The class that will be builded
    */
   void build(Class<?> clazz);

   /**
    * Builds class declaration and constructors
    *
    * @param definitionDTO
    * @param extensionClass
    * @param implementationClasses
    */
   void buildClass(DefinitionDTO definitionDTO, Class<?> extensionClass, Class<?>[] implementationClasses);

   /**
    * Builds all class's methods
    */
   void buildMethods();

   /**
    * Builds method declaration
    *
    * @param definitionDTO
    */
   void buildMethod(DefinitionDTO definitionDTO);

   /**
    * Builds all class's attributes
    */
   void buildAttributes();

   /**
    * Builds attribute definition
    *
    * @param definitionDTO
    */
   void buildAttribute(DefinitionDTO definitionDTO);
}
