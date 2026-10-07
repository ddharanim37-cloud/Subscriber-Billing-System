package Subscriber;

public class main {
    public static void main(String[] args) {

        MobileSubscriber m = new MobileSubscriber();

        m.subscriberName = "Dharani";
        m.subscriberId = 101;
        m.subscriberPhoneNumber = 9876543210L;
        m.subscriberPlanName = "Gold";
        m.subscriberPackageCost = 399;
        m.subscriberExtraCallsInMinutes = 100;
        m.subscriberExtraCallCostPerMinutes = 0.5;
        m.roamingNoOfMinutes = 20;
        m.roamingCostPerMinute = 1.5;

        m.getSubscriberDetails();
        System.out.println("Bill = " + m.calculateBill());
    }
}