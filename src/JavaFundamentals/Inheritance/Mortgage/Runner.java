package JavaFundamentals.Inheritance.Mortgage;

public class Runner {
    public static void main(String[] args){
        var report = new MortgageReport();
        report.printMortgageReport(100000,0.006,30);
    }
}
