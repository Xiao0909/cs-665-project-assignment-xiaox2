/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date: 03-30-2023
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.Adapter.*;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    // Create USB customer data object and perform operations
    CustomerData usb = new USB();
    usb.printCustomer("1234");
    usb.getCustomerData("1234");

    // Create HTTPS customer data object and perform operations
    CustomerData https = new HTTPS();
    https.printCustomer("5678");
    https.getCustomerData("5678");

    // Create HTTPS adapter object and perform operations
    CustomerData httpsAdapter = new ConnectionAdapter(new HTTPS());
    httpsAdapter.printCustomer("9012");
    httpsAdapter.getCustomerData("9012");
}
}
