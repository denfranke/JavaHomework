package Module_2.Homework1.taxes;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
        this.title = title;
        debit=0;
        credit=0;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        }
        if (amount < 0) {
            credit -= Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes(){
        int taxAmount = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания "+title+" уплатила налог в размере: "+ taxAmount+" руб.");
        debit = 0;
        credit = 0;
    }
}
