package Module_2.Homework1.taxes;

public class Main {
    public static void main(String[] args) {
        TaxSystem incomeTaxSystem = new IncomeTaxSystem();
        TaxSystem incomeMinusExpenses = new IncomeMinusExpensesTaxSystem();

        Company comA = new Company("A", incomeTaxSystem);
        Company comB = new Company("B", incomeMinusExpenses);

        comA.shiftMoney(100_000);
        comA.shiftMoney(-20_000);

        comB.shiftMoney(100_000);
        comB.shiftMoney(-40_000);

        comA.payTaxes();
        comB.payTaxes();


        Company comC = new Company("C", incomeMinusExpenses);

        Deal[] deals = new Deal[4];

        deals[0] = new Sale("D1", 35000);
        deals[1] = new Sale("D2", 7500);
        deals[2] = new Expenditure("D3", 12000);
        deals[3] = new Expenditure("D4", 8000);

        System.out.println("Разница: " + comC.applyDeals(deals));
    }
}
