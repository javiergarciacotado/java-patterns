package com.owned.design.principles.solid.open_closed.weird.example_2;

public final class PaymentGateway {

    // switch and if-elseif-elseif-else are devil!
    public Payment paymentFrom(String paymentMethod) {
        switch(paymentMethod) {
            case "stripe":
                //return new Stripe
            case "paypal":
                //return new Paypal
            case "amazon-pay":
                //return new AmazonPay
            default:
                break;
        }
        return null;
    }
}

interface Payment {

}
