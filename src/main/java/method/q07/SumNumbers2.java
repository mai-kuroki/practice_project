package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		double sum = calculateSum(5, 3.3);
		System.out.println("加算結果：" + (int) sum);
	}

	public static double calculateSum(int a, double b) {
		System.out.println("第一引数（整数）：" + a);
		System.out.println("第二引数（実数）：" + b);
		return a + b;
	}
}
