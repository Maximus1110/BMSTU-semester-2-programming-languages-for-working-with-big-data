import java.util.Random;

public class Bank {
    private int balance;

    public Bank(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Пополнение: +" + amount + " | Баланс: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: -" + amount + " | Баланс: " + balance);
        } else {
            System.out.println("Недостаточно денежных средств.");
        }
    }

    public static void main(String[] args) {
        // Создание объекта банка с начальным балансом 1000
        Bank bank = new Bank(1000);

        // Создание и запуск потоков для пополнения и снятия денег
        Thread depositThread = new Thread(() -> {
            Random random = new Random();
            while (true) {
                int amount = random.nextInt(100) + 1; // Случайная сумма от 1 до 100
                bank.deposit(amount);
                try {
                    Thread.sleep(1000); // Пауза 1 секунда
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread withdrawThread = new Thread(() -> {
            Random random = new Random();
            while (true) {
                int amount = random.nextInt(100) + 1; // Случайная сумма от 1 до 100
                bank.withdraw(amount);
                try {
                    Thread.sleep(1500); // Пауза 1.5 секунды
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        depositThread.start();
        withdrawThread.start();
    }
}
