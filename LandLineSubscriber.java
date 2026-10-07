package Subscriber;

public class LandLineSubscriber extends Subscriber {

    int noOfSTDCallMinutes;
    double costPerEachSTDMinute;

    @Override
    public void getSubscriberDetails() {
        super.getSubscriberDetails();
        System.out.println("STD Minutes: " + noOfSTDCallMinutes);
        System.out.println("STD Cost Per Minute: " + costPerEachSTDMinute);
    }

    public double calculateBill() {
        double total = subscriberPackageCost
                + (subscriberExtraCallsInMinutes * subscriberExtraCallCostPerMinutes)
                + (noOfSTDCallMinutes * costPerEachSTDMinute);

        subscriberTaxOnBill = total * 0.10;

        return total + subscriberTaxOnBill;
    }
}