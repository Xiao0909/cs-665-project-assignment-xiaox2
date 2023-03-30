/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date:03/29/2023
 * File Name: CustomerData.java
 * Description:  Interface for customer data operations
 */

package edu.bu.met.cs665.Adapter;

public interface CustomerData {
     // Method to print customer data
     void printCustomer(String customerId);
     // Method to get customer data
     void getCustomerData(String customerId);
}
