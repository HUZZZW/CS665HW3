package edu.bu.met.cs665.HW3;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
/*
 * @Name: Yiming hu
 * @Data: 03/15/2023
 * @description: Create the EmailGenerationService test class.
 */
public class EmailGenerationServiceTest extends TestCase {
    //Create EmailGenerationService class
    private EmailGenerationService emailGenerationService;
    @Before
    public void setUp() throws Exception {
        emailGenerationService = new EmailGenerationService();
    }

    @Test
    public void testBusinessEmail() {
        Customer customer = new Customer();
        customer.setName("Arthus");
        customer.setEmail("Arthus@gmail.com");
        customer.setStstus("Business");
        String email = emailGenerationService.generateEmail(customer);
        assertEquals("Business Customer", email);
    }


    @Test
    public void testFrequentEmail() {
        Customer customer = new Customer();
        customer.setName("Arthus");
        customer.setEmail("Arthus@gmail.com");
        customer.setStstus("Frequent");
        String email = emailGenerationService.generateEmail(customer);
        assertEquals("Frequent Customer", email);
    }

    @Test
    public void testReturningEmail() {
        Customer customer = new Customer();
        customer.setName("Arthus");
        customer.setEmail("Arthus@gmail.com");
        customer.setStstus("Returning");
        String email = emailGenerationService.generateEmail(customer);
        assertEquals("Returning Customer", email);
    }

    @Test
    public void testNewEmail() {
        Customer customer = new Customer();
        customer.setName("Arthus");
        customer.setEmail("Arthus@gmail.com");
        customer.setStstus("New");
        String email = emailGenerationService.generateEmail(customer);
        assertEquals("New Customer", email);
    }


    @Test
    public void testVIPEmail() {
        Customer customer = new Customer();
        customer.setName("Arthus");
        customer.setEmail("Arthus@gmail.com");
        customer.setStstus("VIP");
        String email = emailGenerationService.generateEmail(customer);
        assertEquals("VIP Customer", email);
    }
}