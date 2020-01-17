package com.jsmile.java8.inheritance.util;

public class MyDate
{
   // Member/instance variables( or fields/properties/attributes )
   public int day;
   public int month;
   public int year;

   // Constructors
   public MyDate() { }

   public MyDate( int _day, int _month, int _year )
   {
      setDate( _day, _month, _year );
   }

   public void setDate( int _day, int _month, int _year )
   {
      this.day = _day;
      this.month = _month;
      this.year = _year;
   }

   public static void leapYears()
   {
      for( int i = 1752; i <= 2020; i = i + 4 )
      {
         if( ( i % 100 != 0 ) || ( i % 400 == 0) )
         {
            System.out.println( "The year " + i + " is a leap year." );
         }
      }
   }

   // 년/월/일 형식으로 출력하도록 overried
   @Override
   public String toString()
   {
      StringBuilder sb = new StringBuilder();
      sb.append( this.year ).append( "/" ).append( month ).append( "/" ).append( day );
      return sb.toString();
   }
}
