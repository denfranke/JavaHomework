package Module_2.Homework_2;

class SimpleAccount extends Account {
    private long money;

    public SimpleAccount(long initialBalance) {
        money = Math.max(0, initialBalance);
    }

    @Override
    public boolean add(long val) {
        if (val <= 0) {
            return false;
        }
        money += val;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0 || money < amount) {
            return false;
        }
        money -= amount;
        return true;
    }

    @Override
    public long getBalance() {
        return money;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        return super.transfer(account, amount);
    }
}
