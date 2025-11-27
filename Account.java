package Module_2.Homework2;

abstract class Account {
    public abstract long getBalance();

    public abstract boolean add(long amount);
    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (amount <= 0) return false;
        if ( account.add(amount)&&pay(amount) ) {
            return account.add(amount);
        }
        return false;
    }
}
