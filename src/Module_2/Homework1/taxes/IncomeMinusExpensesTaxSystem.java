package Module_2.Homework1.taxes;

import static java.lang.Math.abs;

public class IncomeMinusExpensesTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int profit = abs(debit - credit);
        return (int) (0.15 * profit);
    }
}
