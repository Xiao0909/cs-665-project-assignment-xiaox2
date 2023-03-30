package edu.bu.met.cs665;

import edu.bu.met.cs665.Adapter.*;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestData {
     // Test USB implementation
     @Test
     public void testUSB() {
         CustomerData usb = new USB();
         assertEquals("Printing customer data for customer 1234 using USB interface.", getOutput(() -> usb.printCustomer("1234")));
         assertEquals("Getting customer data for customer 1234 using USB interface.", getOutput(() -> usb.getCustomerData("1234")));
     }
 
     // Test HTTPS implementation
     @Test
     public void testHTTPS() {
         CustomerData https = new HTTPS();
         assertEquals("Printing customer data for customer 5678 using HTTPS interface.", getOutput(() -> https.printCustomer("5678")));
         assertEquals("Getting customer data for customer 5678 using HTTPS interface.", getOutput(() -> https.getCustomerData("5678")));
     }
 
     // Test HTTPS adapter implementation
     @Test
     public void testHTTPSAdapter() {
         CustomerData httpsAdapter = new ConnectionAdapter(new HTTPS());
         assertEquals("Printing customer data for customer 9012 using HTTPS interface.", getOutput(() -> httpsAdapter.printCustomer("9012")));
         assertEquals("Using USB to get customer data for customer 9012", getOutput(() -> httpsAdapter.getCustomerData("9012")));
     }

     // Helper method to capture System.out output
    private String getOutput(Runnable runnable) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        runnable.run();
        System.out.flush();
        System.setOut(old);
        return baos.toString().trim();
    }
}
