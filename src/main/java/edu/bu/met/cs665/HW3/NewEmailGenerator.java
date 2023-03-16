package edu.bu.met.cs665.HW3;
/*
 * @Name: Yiming hu
 * @Data: 03/15/2023
 * @description:Create New Customer email generator classes that implement the EmailGenerator interface, and Automatically generate a reply message.
 */
public class NewEmailGenerator implements EmailGenerator{
    @Override
    public String generateEmail(Customer customer) {
        return "New Customer";
    }
}

