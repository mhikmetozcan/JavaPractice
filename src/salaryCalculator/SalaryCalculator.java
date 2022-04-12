package salaryCalculator;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(){

    }

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }

    public double stateTax(){
        return salary() * stateTaxRate;
    }

    public double federalTax(){
        return stateTax() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

    public String toString(){

        return "Salary: " + salary() + "\nState Tax: " + stateTax() + "\nFederal Tax: " + federalTax() + "\nSalary After Tax: " + salaryAfterTax();

    }

    public static void main(String[] args) {
        SalaryCalculator salary = new SalaryCalculator(22.5, 0.35, 0.30, 40);
        System.out.println(salary);

    }

}
