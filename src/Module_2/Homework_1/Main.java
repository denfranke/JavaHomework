package Module_2.Homework_1;

import Module_2.Homework_1.Taxes.IncomeMinusExpensesTaxSystem;
import Module_2.Homework_1.Taxes.IncomeTaxSystem;
import Module_2.Homework_1.Taxes.TaxSystem;

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

    }
}
