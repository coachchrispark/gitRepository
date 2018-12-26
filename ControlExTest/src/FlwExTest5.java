import java.util.Scanner;

public class FlwExTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		String grade = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("자신의 점수를 입력해주세요");

		score = scan.nextInt();

		if (score >= 90) {
			grade = "A";
			if (score >= 98) {
				grade = "A+";
			} else if (score < 94) {
				grade = "A-";
			}
		} else if (score >= 80)

		{
			grade = "B";
		}
		if (score >= 88) {
			grade = "B+";
		} else if (score < 84) {
			grade = "B-";
		} else {
			grade = "F";
		}

		System.out.println(score + "점은 " + grade);

	}
}
