
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		boolean
		//기본값  : false
		
		boolean power = true;
		boolean checked = false;
		
		System.out.println("대답 yes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		System.out.println();
		
//		char
		
		char ch = 'A';
		System.out.println(ch);
		
		char ch1 = 65;
		System.out.println(ch1);
		// 아스키 코드
		// 인코딩 디코딩
		
// int
		int num = 10;
		System.out.println(num);
		
// byte
		byte b = 127;
		
		b = (byte)(b + 2);
		
		System.out.println(b);
		
// long
		long bigNum = 3000000000L;
				
		System.out.println("long 타입: " + bigNum);
		
		int firstNum = 1500000000;
		int secondNum = 1300000000;
		
		long sum = 0;
		sum = firstNum + secondNum;
		
		System.out.println("총 명품금액 : " + sum);
		
//실수형
//float, double
//실수 정확도 -> 정밀도
		
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		
		
		
	}

}
