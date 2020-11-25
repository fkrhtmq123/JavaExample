package example;

public class Code62 {
	
	public static void main(String[] args) {
		int row, col;
		row = 1;
		while(row <= 9) {
			col = 1;
			while(col <= 9) {
				System.out.print(row * col + " ");
				col++;
			}
			row++;
			System.out.println();
		}
	}

}
