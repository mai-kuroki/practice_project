package method.q05;

public class Triangle {
	public static void main(String[] args) {
		int triangle = getTriangleArea(8, 5);
		System.out.println("三角形の面積：" + triangle);
	}

	public static int getTriangleArea(int a, int b) {
		System.out.println("底辺：" + a);
		System.out.println("高さ：" + b);

		return a * b / 2;
	}
}
