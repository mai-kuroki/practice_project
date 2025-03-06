package method.q04;

public class SumNumbers {
	public static void main(String[] args) {
		int firstArgument = 3;
		int secondArgument = 2;
		int sum = calculateSum(firstArgument, secondArgument);
		System.out.println("第一引数：" + firstArgument);
		System.out.println("第二引数：" + secondArgument);
		System.out.println("加算結果：" + sum);
	}

	public static int calculateSum(int firstArgument, int secondArgument) {

		return firstArgument + secondArgument;
	}
}
