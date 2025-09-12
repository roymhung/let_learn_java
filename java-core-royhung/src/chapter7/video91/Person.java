package chapter7.video91;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static class UserID {
		private String cccd;
		private String address;

		public UserID(String cccd, String address) {
			this.cccd = cccd;
			this.address = address;
		}

		// public void printInfo() {
		// System.out.println("Outside name = " + name);
		// }

		public String getCccd() {
			return cccd;
		}

		public void setCccd(String cccd) {
			this.cccd = cccd;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	}

}
