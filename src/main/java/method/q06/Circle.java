package method.q06;

public class Circle {

	public static void main(String[] args) {
		double circle = getCircleArea(5.0);
		System.out.println("円の面積：" + circle);
	}

	public static double getCircleArea(double a) {
		System.out.println("半径：" + a);

		return a * a * 3.14;
	}

}
