package chapter7.lab07;

public class Lab07 {
	public static void main(String[] args) {
		System.out.println("--------------------");
		Runnable task = new Runnable() {
			@Override
			public void run() {

				OrderStatus myStatus = OrderStatus.CANCELLED;

				Order myOrder = new Order("B001", myStatus);
				myOrder.processOrder();

				Order.CustomerInfo data = myOrder.new CustomerInfo("royhung", "358957532");
				data.printInfo();

				Order.DiscountHelper od = new Order.DiscountHelper();
				System.out.println("Chiet khau ap dung: " + od.calculateDiscount(myStatus));

				System.out.println(
						"Đơn hàng " + myOrder.getId() + " đang được xử lý ở trạng thái: " + myStatus.getDescription());
			}
		};
		task.run();

	}

}
