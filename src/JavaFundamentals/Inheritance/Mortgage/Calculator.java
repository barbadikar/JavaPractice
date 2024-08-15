package JavaFundamentals.Inheritance.Mortgage;

import java.security.Principal;

public class Calculator {
    int principle;
    double interest;
    int loanYear;

    public Calculator(int principle, double interest, int loanYear) {
        this.principle = principle;
        this.interest = interest;
        this.loanYear = loanYear;
    }

    public double interestPaid(){
        double amount = (principle*interest*loanYear);
        System.out.println("Intrst paid will be :"+amount);
        return amount;
    }
    
    public void monthlyPayment(){
        double amount = principle+interestPaid();
        System.out.println(amount);

    }
}
