package Module_2.Homework_2;

class CreditAccount extends Account {
    private long money;
    private final long creditLimit;

    public CreditAccount(long creditLimit) {
        if (creditLimit < 0) {
            throw new IllegalArgumentException("Кредитный лимит не может быть отрицательным");
        }
        this.creditLimit = creditLimit;
        this.money = 0;
    }

    @Override
    public long getBalance() {
        return money;
    }

    @Override
    public boolean add(long val) {
        if (val <= 0) {
            return false;
        }
        long newBalance = money + val;
        if (newBalance > 0) {
            return false;
        }
        money = newBalance;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0) {
            return false;
        }
        long newBalance = money - amount;
        if (newBalance < -creditLimit) {
            return false;
        }
        money = newBalance;
        return true;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        return super.transfer(account, amount);
    }
}
