package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		int num = 5;
		double realNumber = 3.3;
		double sum = calculateSum(num, realNumber);
		System.out.println("第一引数（整数）：" + num);
		System.out.println("第二引数（実数）：" + realNumber);
		System.out.println("加算結果：" + (int) sum);
	}

	public static int calculateSum(int num, double realNumber) {
		return (int) (num + realNumber);
	}
}
