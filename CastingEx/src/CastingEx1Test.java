
public class CastingEx1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ڵ� ����ȯ
		// �ڵ� ����ȯ�� ��Ģ
		// ������ ���� �ִ��� ������ �� �ִ� Ÿ������ �ڵ� �������Ѵ�
		//  1        2       4      8        4        8
		// byte -> short -> int -> long -> float -> double
		//         char  ->
		//������ ����ȯ -> ���� �ս��� ����
		//����� ����ȯ -> ���� �ս��� ������ �� ����� ���ϴ� ������ compiler���� �˷��ش�.
		
		/* 1. boolean�� ������ ������ 7���� �⺻���� ���� ����ȯ�� �����ϴ�
		 * 2. ���� �ٸ� Ÿ���� ���� ���� ������ ����ȯ�� �ϴ� ���� ��Ģ������
		 *    ���� ������ ���� Ÿ�Կ��� ū Ÿ������ ����ȯ�� ������ �� �ִ�. */
		
		double doubleNum = 0.0;
		
		doubleNum = 10;

				
		
		//long bigNum = (long)324324324;
		//int bigNum2 = (int)32432432400L;
		
		
		System.out.println(doubleNum);
		
		
		int n = 0;
		
				n = (int)doubleNum;
				
				System.out.println(n);
	}

}
