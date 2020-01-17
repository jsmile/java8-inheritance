package com.jsmile.java8.inheritance.domain;

import com.jsmile.java8.inheritance.util.MyDate;

public class Order
{
   MyDate orderDate;
   double orderAmount = 0.00;
   String customer;
   String product;
   int quantity;

   public static double taxRate = 0.05;

   public Order( MyDate _orderDate, double _orderAmount, String _customer, String _product, int _quantity )
   {
      this.orderDate = _orderDate;
      this.orderAmount = _orderAmount;
      this.customer = _customer;
      this.product = _product;
      this.quantity = _quantity;
   }

   public static void setTaxRate( double _newRate ) { taxRate = _newRate; }

   public static double computeTaxOn( double _anAmount )
   {
      System.out.println( "The taz for " + _anAmount + " is : " + (_anAmount * Order.taxRate ) );

      return _anAmount * Order.taxRate;
   }

   public double computeTax()
   {
      System.out.println( "The tax for this order is : " + ( orderAmount * Order.taxRate ) );

      return orderAmount * Order.taxRate;
   }

   public char jobSize()
   {
      if( this.quantity <= 25 ) { return 'S'; }
      else if( this.quantity <= 75 ) { return 'M'; }
      else if( this.quantity <= 150 ) { return 'L'; }

      return 'X';
   }

   public double computeTotal()
   {
      double total = this.orderAmount;

      switch( jobSize() )
      {
         case 'M': total = total - ( this.orderAmount * 0.01 );
            break;
         case 'L': total = total - ( this.orderAmount * 0.02 );
            break;
         case 'X': total = total - ( this.orderAmount * 0.03 );
            break;
      }

      if( orderAmount <= 1500 ) { total = total + computeTax(); }

      return total;
   }

   @Override
   public String toString()
   {
      return this.quantity + " ea. " + product + " for " + customer;
   }
}
