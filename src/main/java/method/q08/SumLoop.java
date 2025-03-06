package method.q08;

public class SumLoop {
	public static void main(String[] args) {
		int sum = sumLoop(1, 100);
		System.out.println("加算結果：" + sum);
	}

	public static int sumLoop(int a, int b) {
		System.out.println("最小値：" + a);
		System.out.println("最大値：" + b);

		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
}
