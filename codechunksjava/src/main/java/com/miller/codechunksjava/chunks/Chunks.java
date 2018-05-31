/*
 * The MIT License
 *
 * Copyright 2018 mille.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.miller.codechunksjava.chunks;

import java.util.Calendar;

/**
 *
 * @author mille
 */
public class Chunks {
   /*+---------------------------------------------------------------+
     +                                                               +
     +                            Fields                             +
     +                                                               +
     +---------------------------------------------------------------+*/

   /*+---------------------------------------------------------------+
     +                                                               +
     +                          Properties                           +
     +                                                               +
     +---------------------------------------------------------------+*/

   /*+---------------------------------------------------------------+
     +                                                               +
     +                  Constructors/Builders                        +
     +                                                               +
     +---------------------------------------------------------------+*/
   private Chunks() {
      
   }

   /*+---------------------------------------------------------------+
     +                                                               +
     +                         Methods                               +
     +                                                               +
     +---------------------------------------------------------------+*/
   /**
    * Capitalizes the first letter in the given string.
    * 
    * @param string The string to capitalize.
    * 
    * @return The capitalized string.
    */
   public static String capitalize(String string) {
      StringBuilder sBuilder = new StringBuilder(string);
      sBuilder.setCharAt(0, Character.toUpperCase(string.charAt(0)));
      return sBuilder.toString();
   }
   
   /**
    * Returns a simplified string representation of the Calendar object, 
    * in the form "yyyy/mm/dd".
    * 
    * @param calendar The Calendar to convert.
    * 
    * @return A string representing the Calendar.
    */
   public static String calendarString(Calendar calendar) {
      StringBuilder s = new StringBuilder();
      s.append(calendar.get(Calendar.YEAR)).append("/");
      s.append(calendar.get(Calendar.MONTH)).append("/");
      s.append(calendar.get(Calendar.DAY_OF_MONTH));
      return s.toString();
   }

   /*+---------------------------------------------------------------+
     +                                                               +
     +                        Inner Classes                          +
     +                                                               +
     +---------------------------------------------------------------+*/
}