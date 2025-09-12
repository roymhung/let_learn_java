package chapter7.lab07;

public enum OrderStatus {
	PENDING("Chờ xác nhận"), SHIPPED("Đang giao hàng"), DELIVERED("Đã giao"), CANCELLED("Đã huỷ");

	private final String description;

	private OrderStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public boolean hasFinal() {
		if (this == DELIVERED || this == CANCELLED)
			return true;
		return false;
	}

}
