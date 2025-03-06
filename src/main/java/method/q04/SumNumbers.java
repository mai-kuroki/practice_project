package method.q04;

public class SumNumbers {
	public static void main(String[] args) {
		int sum = calculateSum(3, 2);
		System.out.println("加算結果：" + sum);
	}

	public static int calculateSum(int a, int b) {
		System.out.println("第一引数：" + a);
		System.out.println("第二引数：" + b);

		return a + b;
	}
}
