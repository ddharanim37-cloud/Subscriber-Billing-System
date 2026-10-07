package Subscriber;

public class MobileSubscriber extends Subscriber {

    int roamingNoOfMinutes;
    double roamingCostPerMinute;

    @Override
    public void getSubscriberDetails() {
        super.getSubscriberDetails();
        System.out.println("Roaming Minutes: " + roamingNoOfMinutes);
        System.out.println("Roaming Cost Per Minute: " + roamingCostPerMinute);
    }

    public double calculateBill() {
        double total = subscriberPackageCost
                + (subscriberExtraCallsInMinutes * subscriberExtraCallCostPerMinutes)
                + (roamingNoOfMinutes * roamingCostPerMinute);

        subscriberTaxOnBill = total * 0.10;

        return total + subscriberTaxOnBill;
    }
}