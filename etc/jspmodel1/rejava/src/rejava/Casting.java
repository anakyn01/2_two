package rejava;

public class Casting {

/*
�� ��ȯ�� �� �⺻ ������ ������ ���� �ٸ� ������ �Ҵ��ϴ� ���� ���մϴ�.
�ڹٿ��� �� ���� ������ ĳ������ �ֽ��ϴ�.

���̵�� ĳ���� (�ڵ�) - ���� ���ڸ� ū ���� ũ��� ��ȯ
byte-> short-> char-> int-> long-> float->double

Narrowing Casting (����) - �� ū ���ڸ� �� ���� ũ���� ���ڷ� ��ȯ
double-> float-> long-> int-> char-> short->byte
*/
	public static void main(String[] args) {

		//�ڵ� ĳ����
		int myInt = 9;
		double myDouble = myInt;
				
		System.out.println(myInt);		
		System.out.println(myDouble);//���ٸ� ��ġ ���� �ڵ����� ����
		
	//ū�ְ� �ɸ��� �ɶ�
	double myD = 9.78d;
	int myI = (int) myD;//���� ĳ���� �տ��ٰ� ��ȣġ�� �Ͻ�
		
	//��� ĳ����
	System.out.println(myD);		
	System.out.println(myI);//���ٸ� ��ġ ���� �ڵ����� ����	
		
		
		
		
		

	}

}
