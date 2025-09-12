package chapter7.lab07;

public class Order {
	private String id;
	private OrderStatus status;

	public Order(String id, OrderStatus status) {
		this.id = id;
		this.status = status;
	}

	public void processOrder() {
		class Logger {
			public void info() {
				System.out.println("[LOG] Xử lý đơn hàng ID:" + id + " - Trạng thái: " + status.getDescription());
			}
		}

		Logger log = new Logger();
		log.info();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	class CustomerInfo {
		private String name;
		private String phone;

		public CustomerInfo(String name, String phone) {
			this.name = name;
			this.phone = phone;
		}

		public void printInfo() {
			System.out.println("Khach hang: " + this.name + "-" + this.phone);
			System.out.println("Trạng thái đơn hàng: " + status.getDescription() + "(" + status + ")");
		}
	}

	static class DiscountHelper {
		// Trả về 10% nếu SHIPPED, 0% nếu DELIVERED hoặc CANCELLED, và 5% cho trạng thái
		// khác.

		public String calculateDiscount(OrderStatus status) {
			if (status.name().equals("SHIPPED"))
				return "10%";
			if (status.name().equals("DELIVERED") || status.name().equals("CANCELLED"))
				return "0%";
			return "5%";
		}
	}

}
