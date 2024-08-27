package com.ipayment;

public class RestaurantService {
    private Ipayment payment;

    public RestaurantService() {
        System.out.println("RestaurantService 0 param :: constructor");
    }
    public RestaurantService(Ipayment payment) {
        System.out.println("RestaurantService param :: constructor");
        this.payment = payment;
    }

    public void setPayment(Ipayment payment) {
        System.out.println("setter-method called....");
        this.payment = payment;
    }

    public void processPayment(double amt) {
        boolean status = payment.payBill(amt);
        if (status) {
            System.out.println("payment success......thank you");
        } else {
            System.out.println("card declined....");
        }
    }
}
