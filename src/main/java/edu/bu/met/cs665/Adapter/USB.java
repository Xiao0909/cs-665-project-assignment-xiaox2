/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date:03/29/2023
 * File Name: USB.java
 * Description:  Class for USB customer data operations
 */

package edu.bu.met.cs665.Adapter;

public class USB implements CustomerData {
   // Override method to print customer data using USB interface
   @Override
   public void printCustomer(String customerId) {
       System.out.println("Printing customer data for customer " + customerId + " using USB interface.");
   }

   // Override method to get customer data using USB interface
   @Override
   public void getCustomerData(String customerId) {
       System.out.println("Getting customer data for customer " + customerId + " using USB interface.");
   }
}
