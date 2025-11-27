package Module_2.Homework2;

public class Main {
    public static void main(String[] args) {
        SimpleAccount s = new SimpleAccount(500);
        CreditAccount c = new CreditAccount(1000);

        System.out.println(s.transfer(c, 200));
        System.out.println(s.getBalance());
        System.out.println(c.getBalance());
        System.out.println(c.add(300));
        System.out.println(c.add(150));

    }
}
