package by.academy.lesson24;

import java.time.LocalDate;

public class CreditCard implements Payment {

    private String issuer;
    private Long cardNo;
    private LocalDate expiryDate;

    @Override
    public boolean authorise(double amount) {
        return true;
    }
}
