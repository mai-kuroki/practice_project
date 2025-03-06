package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		int num = 5;
		double realNumber = 3.3;
		int sum = calculateSum(num, realNumber);
		System.out.println("第一引数（整数）：" + num);
		System.out.println("第二引数（実数）：" + realNumber);
		System.out.println("加算結果：" + sum);
	}

	public static int calculateSum(int num, double realNumber) {
		return (int) (num + realNumber);
	}
}
