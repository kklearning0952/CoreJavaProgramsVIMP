package main.java.com.java17features;

public class Java17SealedExample {

    public static void main(String[] args) {
        Payment payment=new CardPayment();

        System.out.println(payment instanceof CardPayment);
    }
}

sealed interface Payment
        permits UpiPayment, CardPayment {}

final class UpiPayment implements Payment {}

final class CardPayment implements Payment {}
