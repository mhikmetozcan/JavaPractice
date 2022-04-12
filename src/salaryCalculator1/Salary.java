package salaryCalculator1;

public class Salary {

    private double hourlyRate, stateTaxRate, federalTaxRate;
    private int weeklyHours;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 10 || hourlyRate > 50){
            System.err.println("Invalid Salary: " + hourlyRate);
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }

    public double getStateTaxRate() {
        return stateTaxRate;
    }

    public void setStateTaxRate(double stateTaxRate) {
        if(stateTaxRate < 0 || stateTaxRate > 1){
            System.err.println("Invalid Tax Rate: " + stateTaxRate);
            System.exit(1);
        }
        this.stateTaxRate = stateTaxRate;
    }

    public double getFederalTaxRate() {
        return federalTaxRate;
    }

    public void setFederalTaxRate(double federalTaxRate) {
        if(federalTaxRate < 0 || federalTaxRate > 1){
            System.err.println("Invalid Tax Rate: " + federalTaxRate);
            System.exit(1);
        }
        this.federalTaxRate = federalTaxRate;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        if(weeklyHours < 0 || weeklyHours > 40){
            System.err.println("Invalid working hours: " + weeklyHours);
            System.exit(1);
        }
        this.weeklyHours = weeklyHours;
    }


    public Salary(){

    }

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours){
       setHourlyRate(hourlyRate);
       setStateTaxRate(stateTaxRate);
       setFederalTaxRate(federalTaxRate);
       setWeeklyHours(weeklyHours);
    }

    public double salary(){
        return this.hourlyRate * this.weeklyHours * 52;
    }

    public double stateTax(){
        return stateTaxRate * salary();
    }

    public double federalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax(); // 150 000, 30%, 25%;  150000
    }

    public String toString() {
        return "Salary{" +
                "Salary=" + salary() +
                ", state Tax=" + stateTax() +
                ", federal Tax=" + federalTax() +
                ", salary After Tax=" + salaryAfterTax() +
                '}';
    }
}



/*
SalaryCalculator Task:
1.1 Create a class named Salary calculator:
        Attributes:
            hourlyRate, stateTaxRate,
federalTaxRate, weeklyHours
            Add a constructor to set all the fields
        Actions:
            salary(): calculates the salary (hourlyRate * weeklyHour * 52)
            stateTax(): calculates the totalStateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */