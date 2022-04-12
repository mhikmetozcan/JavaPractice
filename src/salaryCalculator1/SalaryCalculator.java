package salaryCalculator1;

public class SalaryCalculator {
    public static void main(String[] args) {

        Salary s1 = new Salary();
        s1.setWeeklyHours(30);
        s1.setFederalTaxRate(0.2);
        s1.setStateTaxRate(0.25);
        s1.setHourlyRate(25);

        System.out.println(s1);

        Salary s2 = new Salary(18, 0.20, 0.15,40);

        System.out.println(s2);

        Salary s3 = new Salary(30, 0.25,0.35,20);
        System.out.println(s3);

        System.out.println(s3);

        s3.setHourlyRate(-50);

        System.out.println(s3);



    }
}
