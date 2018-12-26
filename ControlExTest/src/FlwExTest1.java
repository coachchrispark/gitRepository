import java.util.Scanner;

public class FlwExTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int visitCount = 0;
			visitCount = 0;
			
			Scanner scan = new Scanner(System.in);
			
		
			System.out.println("몇 번 방문하셨나요?");
			visitCount = scan.nextInt();
			
			if(visitCount == 0) {
				System.out.println("처음 오셨군요 방문해주셔서 감사합니다.");
				//System.out.println("방문횟수는 " + (visitCount+1) + "번 입니다");
			}
			
			if(visitCount >= 0) {
				System.out.println("다시 방문해주셔서 감사합니다.");
				//System.out.println("방문횟수는 " + (visitCount+1) + "번 입니다");
				//System.out.println("방문횟수는 " + ++visitCount + "번 입니다");
			}
			System.out.println("방문횟수는 " + (visitCount+1) + "번 입니다");
			System.out.println("방문횟수는 " + (visitCount+1) + "번 입니다");
			
		
	}

}
