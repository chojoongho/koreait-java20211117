package a05_������;

public class Operation1 {

	public static void main(String[] args) {
		//����������(����,���� ������)
		
		int score = 50; 
		score = score + 1;
		score += 1;
		//���� �� ���� ���� ��, �Ʒ��� ���� ���� ������
		
		System.out.println(score);
		System.out.println(++score);
		//������(��� ����)
		System.out.println(score);
		System.out.println(score++ + ", " + score);
		System.out.println(score);
		//������(�ѹ� ���� �� �������� +1 ��Ű�� ��)
		System.out.println(--score);
		System.out.println(score);
		System.out.println(score--);
		

	}

}
