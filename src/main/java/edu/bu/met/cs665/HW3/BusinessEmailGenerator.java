package edu.bu.met.cs665.HW3;
/*
 * @Name: Yiming hu
 * @Data: 03/15/2023
 * @description:Create Business email generator classes that implement the EmailGenerator interface, and Automatically generate a reply message.
 */
public class BusinessEmailGenerator implements EmailGenerator {
    @Override
    public String generateEmail(Customer customer) {
        return "Business Customer";
    }
}
