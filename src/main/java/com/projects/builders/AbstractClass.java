package com.projects.builders;

import com.projects.scaffolding.ScaffoldingType;

public abstract class AbstractClass implements IBuildClass {
   protected String sufix = ScaffoldingType.ALL.getValue();

   /**
    * Builds a complete class
    *
    * @param clazz The class that will be builded
    */
   @Override
   public void build(Class<?> clazz) {

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
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + sufix.hashCode();
      return result;
   }

   @Override
   public boolean equals(Object o) {
      boolean isEquals = false;
      if (this == o) {
         isEquals = true;
      } else if (o == null || getClass() != o.getClass()) {
         isEquals = true;
      } else {
         AbstractClass that = (AbstractClass) o;
         isEquals = sufix.equals(that.sufix);
      }
      return isEquals;
   }
}
