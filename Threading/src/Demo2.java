class Account {
    public String name;
    public int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public synchronized void withDraw(int money) throws InterruptedException {
        if(this.amount >= money) {
            Thread.sleep(1000);
            this.amount = this.amount - money;
            System.out.println("Bạn đã rút : " + money + "| Số dư còn lại là: " + this.amount);
        } else {
            System.out.println("Ban khong du tien");
        }
    }
}

class WithDrawTask extends Thread {
    public Account account;

    public WithDrawTask(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            account.withDraw(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Account account = new Account("Mai", 15);

        Thread thread1 = new WithDrawTask(account);
        Thread thread2 = new WithDrawTask(account);

        thread1.start();
        thread2.start();
    }
}
