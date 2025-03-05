package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		int month = 1;
		String season = "";
		switch (month) {
		case 1:

		case 2:
			season = month + "月は冬です。";
			break;
		case 3:

		case 4:

		case 5:
			season = month + "月は春です。";
			break;
		case 6:

		case 7:

		case 8:
			season = month + "月は夏です。";
			break;
		case 9:

		case 10:

		case 11:
			season = month + "月は秋です。";
			break;
		case 12:
			season = month + "月は冬です。";
			break;
		case 13:
			season = month + "月は存在しないです。";
			break;
		}
		System.out.println(season);

	}

}
