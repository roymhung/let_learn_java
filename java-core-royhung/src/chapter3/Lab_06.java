package chapter3;

public class Lab_06 {
	// #45. So sánh chuỗi == vs equals()
	// Mục tiêu:
	// Hiểu sự khác biệt giữa == và .equals() khi so sánh chuỗi.
	// Tránh lỗi phổ biến khi so sánh chuỗi bằng ==.
	//
	// 1.So sánh địa chỉ (==)
	// Ví dụ:
	// String a = "hello";
	// String b = new String("hello");
	// System.out.println(a == b); // false
	//
	// 2. So sánh nội dung (equals())
	// System.out.println(a.equals(b)); // true
	//
	// Kinh nghiệm với Java: So sánh chuỗi → luôn dùng .equals() để so sánh nội
	// dung/giá trị
	//
	// Ví dụ:
	// String s1 = "abc";
	// String s2 = "abc";
	// String s3 = new String("abc");
	//
	// System.out.println(s1 == s2); // true (do tối ưu bộ nhớ)
	// System.out.println(s1 == s3); // false
	// System.out.println(s1.equals(s3)); // true

}
