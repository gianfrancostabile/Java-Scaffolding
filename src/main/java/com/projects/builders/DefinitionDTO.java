package com.projects.builders;

public class DefinitionDTO {
   private AccessLevel accessLevel;
   private boolean isStatic;
   private boolean isFinal;
   private boolean isAbstract;
   private String name;

   public DefinitionDTO(String name) {
      this.clear();
      this.setName(name);
   }

   public void clear() {
      this.setAccessLevel(AccessLevel.PUBLIC);
      this.setStatic(false);
      this.setFinal(false);
      this.setAbstract(false);
      this.setName("");
   }

   public AccessLevel getAccessLevel() {
      return this.accessLevel;
   }

   public DefinitionDTO setAccessLevel(AccessLevel accessLevel) {
      this.accessLevel = accessLevel;
      return this;
   }

   public boolean isStatic() {
      return this.isStatic;
   }

   public DefinitionDTO setStatic(boolean isStatic) {
      this.isStatic = isStatic;
      return this;
   }

   public boolean isFinal() {
      return this.isFinal;
   }

   public DefinitionDTO setFinal(boolean isFinal) {
      this.isFinal = isFinal;
      return this;
   }

   public boolean isAbstract() {
      return this.isAbstract;
   }

   public DefinitionDTO setAbstract(boolean isAbstract) {
      this.isAbstract = isAbstract;
      return this;
   }

   public String getName() {
      return this.name;
   }

   public DefinitionDTO setName(String name) {
      this.name = name;
      return this;
   }
}
