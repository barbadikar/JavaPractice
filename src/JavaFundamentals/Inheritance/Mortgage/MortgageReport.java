package JavaFundamentals.Inheritance.Mortgage;

public class MortgageReport {


    public void printMortgageReport(int p,double l,int r){
        System.out.println("---This is interest report---");
        var calc = new Calculator(p,l,r);
        calc.interestPaid();

        System.out.println("---This is monthly report---");
        calc.monthlyPayment();


    }
}
