package edu.bu.met.cs665.HW3;
/*
 * @Name: Yiming hu
 * @Data: 03/15/2023
 * @description:Create a Customer class that contains the customer information, and definite customer status.
 */
public class Customer   {
    private String name;
    private String email;
    private String ststus;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStstus(String ststus) {
        this.ststus = ststus;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getStstus() {
        return ststus;
    }
}
