package day03_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45, yearWeeks = 52;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;
        double grossPay = hourlyRate*weeklyHours*yearWeeks;
        double stateTax = stateTaxRate*grossPay,
               federalTax = federalTaxRate*grossPay;
        double totalTax = federalTax+stateTax;

        System.out.println("Gross pay is: $" + grossPay );
        System.out.println("Federal tax is: $" + federalTax );
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + (federalTax+stateTax));
        System.out.println("Net income is: $" + (grossPay-totalTax));

    }
}
/*
Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax
				stateTax
				federalTax
				totalTax
				salaryAfterTax

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0
 */