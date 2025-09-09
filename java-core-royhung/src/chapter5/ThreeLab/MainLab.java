package chapter5.ThreeLab;

public class MainLab {
	public static void main(String[] args) {
		Student st1 = new Student("King", "mhung", 22);

		st1.test();
		// super.printInfo(); giai thich ben duoi
	}

}

// Bạn bị lỗi ở dòng:
//
// super.printInfo();
//
//
// 📌 Nguyên nhân:
// Từ khóa super chỉ có thể được dùng bên trong một phương thức không tĩnh
// (non-static method) của lớp con để gọi đến phương thức hoặc constructor của
// lớp cha.
//
// Trong MainLab, bạn đang ở bên trong phương thức main (là static), không nằm
// trong một lớp con kế thừa từ Person. Do đó super không hợp lệ ở đây.
//
// 👉 Trong code của bạn:
// Student kế thừa từ Person.
//
// Trong Student bạn đã viết:
//
// public void test() {
// this.printInfo(); // Gọi phương thức override trong Student
// super.printInfo(); // Gọi phương thức printInfo() trong Person
// }
// ==> Đây mới là chỗ đúng để dùng super.
//
// Còn trong MainLab.main(), bạn chỉ cần gọi:
//
// st1.test();
//
// vì trong test() bạn đã gọi cả this.printInfo() và super.printInfo() rồi.
//
// ✅ Sửa code MainLab.java như sau:
//
// package chapter5.ThreeLab;
//
// public class MainLab {
// public static void main(String[] args) {
// Student st1 = new Student("King", "mhung", 22);
// st1.test(); // Tự động in cả thông tin Student và Person
// }
// }
//
//
// 🔑 Tóm lại: super chỉ dùng được trong lớp con khi muốn gọi phương thức hoặc
// constructor của lớp cha. Không thể dùng super trực tiếp trong main() hoặc bất
// kỳ static context nào.
//
// Vẽ sơ đồ flow gọi phương thức st1.test() để thấy rõ thứ tự this.printInfo()
// và super.printInfo() chạy như thế nào để bạn thấy rõ thứ tự các lệnh chạy.
//
// Code liên quan:
// public void test() {
// this.printInfo(); // (1) gọi Student.printInfo()
// super.printInfo(); // (2) gọi Person.printInfo()
// }
//
// Khi chạy st1.test() trong MainLab:
//
// sơ đồ asciII:
// MainLab.main()
// |
// v
// st1.test() // gọi phương thức test() của Student
// |
// +--> this.printInfo() // gọi phiên bản printInfo() trong Student
// | |
// | v
// | Student.printInfo()
// | --> In ra: " Student: King"
// |
// +--> super.printInfo() // gọi phiên bản printInfo() trong Person
// |
// v
// Person.printInfo()
// --> In ra: " Person: mhung - 22"
//
// Kết quả in ra màn hình:
// Student: King
// Person: mhung - 22
//
//
// 📌 Giải thích:
//
// this.printInfo() gọi phương thức được override trong lớp Student.
//
// super.printInfo() bỏ qua override, gọi trực tiếp phương thức printInfo() của
// lớp cha Person.