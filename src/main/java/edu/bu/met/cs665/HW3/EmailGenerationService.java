package edu.bu.met.cs665.HW3;
/*
 * @Name: Yiming hu
 * @Data: 03/15/2023
 * @description: Create the EmailGenerationService class that will use the appropriate email generator based on the customer segment.
 */
public class EmailGenerationService {
    private EmailGenerator businessEmailGenerator;
    private EmailGenerator returningEmailGenerator;
    private EmailGenerator frequentEmailGenerator;
    private EmailGenerator newEmailGenerator;
    private EmailGenerator vipEmailGenerator;

    public EmailGenerationService() {
        this.businessEmailGenerator = new BusinessEmailGenerator();
        this.returningEmailGenerator = new ReturningEmailGenerator();
        this.frequentEmailGenerator = new FrequentEmailGenerator();
        this.newEmailGenerator = new NewEmailGenerator();
        this.vipEmailGenerator = new VIPEmailGenerator();

    }
    public String generateEmail(Customer customer) {
        EmailGenerator emailGenerator = null;

        switch(customer.getStstus()) {
            case "Business":
                emailGenerator = businessEmailGenerator;
                break;
            case "Returning":
                emailGenerator = returningEmailGenerator;
                break;
            case "Frequent":
                emailGenerator = frequentEmailGenerator;
                break;
            case "New":
                emailGenerator = newEmailGenerator;
                break;
            case "VIP":
                emailGenerator = vipEmailGenerator;
                break;
            default:
                throw new IllegalArgumentException("Invalid customer segment");
        }

        return emailGenerator.generateEmail(customer);
    }
}

