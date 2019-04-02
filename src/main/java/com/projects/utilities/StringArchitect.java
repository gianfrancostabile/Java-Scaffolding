package com.projects.utilities;

/**
 * I create this class because I use a lot StringBuilder and StringBuffer,
 * is a solution to write less line to clean the StringBuilder or StringBuffer.
 */
public class StringArchitect {
   private StringBuilder stringBuilder;
   private StringBuffer stringBuffer;

   public StringArchitect(Object architect) {
      if (architect instanceof StringBuilder) {
         setStringBuilder((StringBuilder) architect);
      } else if (architect instanceof  StringBuffer) {
         setStringBuffer((StringBuffer) architect);
      }
   }

   /**
    * Like {@link #append(Object)} method, but at the beginning the builder is cleaned with {@link #setLength(int)}.
    * <br>
    * Use it when you want to start a new sequence.
    *
    * @param sequence Sequence of any type
    * @return StringArchitect instance
    *
    * @see #append(Object)
    * @see #setLength(int)
    */
   public StringArchitect beginSequence(Object sequence) {
      setLength(0);
      return append(sequence);
   }

   /**
    * Add the new sequence to the appropriate builder character sequence
    *
    * @param sequence Sequence of any type
    * @return StringArchitect instance
    *
    * @see StringBuilder#append(Object)
    * @see StringBuffer#append(Object)
    */
   public StringArchitect append(Object sequence) {
      if (getStringBuilder() != null) {
         getStringBuilder().append(sequence.toString());
      } else if (getStringBuffer() != null) {
         getStringBuffer().append(sequence.toString());
      }
      return this;
   }

   /**
    * Returns the character sequence and clean the appropriate builder with {@link #setLength(int)}.
    *
    * @return the character sequence builded
    *
    * @see #setLength(int)
    * @see StringBuilder#toString()
    * @see StringBuffer#toString()
    */
   public String toString() {
      String str = "";
      if (getStringBuilder() != null) {
         str = getStringBuilder().toString();
         setLength(0);
      } else if (getStringBuffer() != null) {
         str = getStringBuffer().toString();
         setLength(0);
      }
      return str;
   }

   /**
    * Set the length of the character sequence
    *
    * @param length the new length
    *
    * @see StringBuilder#setLength(int)
    * @see StringBuffer#setLength(int)
    */
   public void setLength(int length) {
      if (getStringBuilder() != null) {
         getStringBuilder().setLength(length);
      } else if (getStringBuffer() != null) {
         getStringBuffer().setLength(length);
      }
   }

   private StringBuilder getStringBuilder() {
      return stringBuilder;
   }

   private void setStringBuilder(StringBuilder stringBuilder) {
      this.stringBuilder = stringBuilder;
      this.stringBuffer = null;
   }

   private StringBuffer getStringBuffer() {
      return stringBuffer;
   }

   private void setStringBuffer(StringBuffer stringBuffer) {
      this.stringBuffer = stringBuffer;
      this.stringBuilder = null;
   }
}
