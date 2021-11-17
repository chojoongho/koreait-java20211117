package a05_연산자;

public class Operation1 {

	public static void main(String[] args) {
		//증감연산자(증가,감소 연산자)
		
		int score = 50; 
		score = score + 1;
		score += 1;
		//위에 두 줄은 같은 뜻, 아래는 복합 대입 연산자
		
		System.out.println(score);
		System.out.println(++score);
		//선진가(즉시 증가)
		System.out.println(score);
		System.out.println(score++ + ", " + score);
		System.out.println(score);
		//후진가(한번 쓰고 그 다음부터 +1 시키는 것)
		System.out.println(--score);
		System.out.println(score);
		System.out.println(score--);
		

	}

}
