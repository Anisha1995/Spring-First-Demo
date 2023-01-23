package co.pragra.learning.firstspringproject.business;

import co.pragra.learning.firstspringproject.domain.IRateofInterest;
import co.pragra.learning.firstspringproject.domain.RateType;

public class PaymentCalculator {
    private double loanAmount;
    private double tenure;

    public PaymentCalculator(double loanAmount, double tenure,  IRateofInterest interestProvider) {
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.interestProvider = interestProvider;
    }

    private IRateofInterest interestProvider;

    public double calculatePayment() {
        return  loanAmount+ loanAmount*interestProvider.getInterestRte(RateType.FIXED)*tenure/100;
    }

}
