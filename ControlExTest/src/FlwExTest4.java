import java.util.Scanner;

public class FlwExTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("자신의 점수를 입력해주세요");

		score = scan.nextInt();

		if (score > 100) {
			System.out.println("100을 초과해서는 안됩니다");
		} else if (score >= 90) {
			System.out.println(score + "점은 A");
		} else if (score >= 80) {
			System.out.println(score + "점은 B");
		} else if (score >= 70) {
			System.out.println(score + "점은 C");
		} else {
			System.out.println(score + "점은 F");
		}

	}

}
