package practice01;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.name = "山田";
		employee1.age = 20;
		employee2.name = "鈴木";
		employee2.age = 30;
		employee1.showInfo();
		System.out.println("----------");
		employee2.showInfo();
	}

}
