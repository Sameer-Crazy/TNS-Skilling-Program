public class BankAccount {

	private double balance;

	public BankAccount() {

	}

	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " deposited: " + amount);

	}

	public synchronized void withdraw(double amount) {
		balance -= amount;
		System.out.println(Thread.currentThread().getName() + " withdraw: " + amount);
	}

	public double getBalance() {
		return balance;
	}

}
