package Subscriber;

public class Subscriber {

    String subscriberName;
    long subscriberId;
    long subscriberPhoneNumber;
    String subscriberPlanName;
    int subscriberFreeCalls;
    double subscriberPackageCost;
    int subscriberExtraCallsInMinutes;
    double subscriberExtraCallCostPerMinutes;
    double subscriberTaxOnBill;

    public void getSubscriberDetails() {
        System.out.println("Subscriber Name: " + subscriberName);
        System.out.println("Subscriber ID: " + subscriberId);
        System.out.println("Phone Number: " + subscriberPhoneNumber);
        System.out.println("Plan Name: " + subscriberPlanName);
    }
}