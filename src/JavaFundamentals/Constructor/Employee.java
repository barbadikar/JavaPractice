package JavaFundamentals.Constructor;

public class Employee {

    public Employee(int hourlyRate,int workingHours){
        setHourlyRate(hourlyRate);
        setWorkingHours(workingHours);
    }
    private int hourlyRate;
    private int workingHours;
    private int baseSalary;

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate<=0)
            throw new IllegalArgumentException("rate cannot be less than zero");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
    public int getWorkingHours() {
        return workingHours;
    }
    private void setWorkingHours(int workingHours){
        if(workingHours<=0)
            throw new IllegalArgumentException("hours cannot be less than zero");
        this.workingHours = workingHours;
    }
    public int calculateSalary(int baseSalary){
        return hourlyRate*workingHours+baseSalary;
    }
}
