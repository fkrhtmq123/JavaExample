package example;

public class Code23 {
	
	public static void main(String[] args) {
		int n = 2753;
		int a, b, c, d;
		a = n / 1000;
		n = n % 1000;
		b = n / 100;
		n = n % 100;
		c = n / 10;
		d = n % 10;
		
		System.out.println("1000�� �ڸ� : " + a);
		System.out.println("100�� �ڸ� : " + b);
		System.out.println("10�� �ڸ� : " + c);
		System.out.println("1�� �ڸ� : " + d);
	}

}
