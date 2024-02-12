public class BankApp {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		int numberOfCustomer = 3;
		Thread[] threads = new Thread[numberOfCustomer];

		for (int i = 0; i < numberOfCustomer; i++) {
			threads[i] = new Thread(new Customer(account, 1000));
			threads[i].start();
		}

		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println("Bank Balance is :" + account.getBalance());
	}

}
