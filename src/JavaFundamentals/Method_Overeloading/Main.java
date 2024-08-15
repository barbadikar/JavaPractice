package JavaFundamentals.Method_Overeloading;

public class Main {
    public static void main(String args[]){
        var employee = new Employee(10,30);

       // employee.setHourlyRate(5);
       // employee.setWorkingHours(10);
        System.out.println(employee.getWorkingHours());
       int wage = employee.calculateSalary();//if no value is passed
        System.out.println(wage);
    }
}

