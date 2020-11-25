package example;

public class Code63 {
	
	public static void main(String[] args) {
		int row, col;
		for(row = 1; row <= 9; row++) {
			for(col = 1; col <= 9; col++) {
				System.out.print(row * col + " ");
			}
			System.out.println();
		}
	}

}
