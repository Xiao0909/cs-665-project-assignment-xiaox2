/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date:03/29/2023
 * File Name: ConnectionAdapter.java
 * Description:  Adapter class to convert HTTPS customer data operations to USB interface
 */

package edu.bu.met.cs665.Adapter;

public class ConnectionAdapter implements CustomerData {
        // Private field to store original HTTPS customer data operations
        private final CustomerData customerData;

        // Constructor to initialize adapter with original customer data operations
        public ConnectionAdapter(CustomerData customerData) {
            this.customerData = customerData;
        }
    
        // Override method to print customer data using USB interface by calling the original print method
        @Override
        public void printCustomer(String customerId) {
            customerData.printCustomer(customerId);
        }
    
        // Override method to get customer data using USB interface by printing a message
        @Override
        public void getCustomerData(String customerId) {
            System.out.println("Using USB to get customer data for customer " + customerId);
        }
}
