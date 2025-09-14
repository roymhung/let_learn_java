package chapter8.lab08;

public class BankAccount {
	private String username;
	private String password;
	private double balance;

	public BankAccount(String username, String password, double balace) {
		this.username = username;
		if (password.length() < 6) {
			throw new WeakPasswordException("Mat khau phai co it nhat 6 ki tu");
		}
		this.password = password;
		this.balance = balace;
	}

	public void withdraw(double amount) throws NegativeBalanceException {
		if (amount > this.balance) {
			throw new NegativeBalanceException("Khong du so du de rut tien");
		}

		double newBalance = this.balance - amount;
		this.setBalance(newBalance);

		System.out.println("Rut tien thanh cong. So du con lai: " + newBalance);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
