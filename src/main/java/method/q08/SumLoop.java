package method.q08;

public class SumLoop {
	public static void main(String[] args) {
		int minNum = 1;
		int maxNum = 100;
		int sum = sumLoop(minNum, maxNum);
		System.out.println("最小値：" + minNum);
		System.out.println("最大値：" + maxNum);
		System.out.println("加算結果：" + sum);
	}

	public static int sumLoop(int minNum, int maxNum) {
		int sum = 0;
		for (int i = minNum; i <= maxNum; i++) {
			sum += i;
		}
		return sum;
	}
}
