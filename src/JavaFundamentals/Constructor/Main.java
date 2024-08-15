package JavaFundamentals.Constructor;

public class Main {
    public static void main(String args[]){
        var employee = new Employee(10,30);

       // employee.setHourlyRate(5);
       // employee.setWorkingHours(10);
        System.out.println(employee.getWorkingHours());
       int wage = employee.calculateSalary(100);
        System.out.println(wage);
    }
}

