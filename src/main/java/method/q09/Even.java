package method.q09;

public class Even {
	public static void main(String[] args) {
		int num = 12;
		boolean even = checkEven(num);

		if (even) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}

	public static boolean checkEven(int num) {
		return num % 2 == 0;
	}
}
