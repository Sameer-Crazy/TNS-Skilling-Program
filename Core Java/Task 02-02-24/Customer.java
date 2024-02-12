public class Customer implements Runnable {

	private BankAccount account;
	private double balance;

	public Customer(BankAccount account, double balance) {

		this.account = account;
		this.account.deposit(balance);
		this.balance = balance;
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			double amount = Math.round(Math.random() * 500);
			amount -= amount % 10;

			if (Math.random() < 0.5) {
				account.deposit(amount);
				balance += amount;
			} else {
				account.withdraw(amount);
				balance -= amount;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		System.out.println(Thread.currentThread().getName() + "Balance is : " + balance);

	}

}
