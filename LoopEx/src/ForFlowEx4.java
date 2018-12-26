import java.util.Scanner;

public class ForFlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("홀짝 게임 시작");

		for (int i = 0; i <= 2; i++) {

			System.out.println("숫자를 입력하세요");

			num = scan.nextInt();


			if (num % 2 == 0) {
				System.out.println(num + "는 짝수입니다");
			} else {
				System.out.println(num + "는 홀수입니다");
			}
			System.out.println();
		}

	}
}
