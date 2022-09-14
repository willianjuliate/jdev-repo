package valor;

public class Matriz {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		// ------------------
		matrix[0][0] = 0;
		matrix[0][1] = 0;
		matrix[0][2] = 0;
		// ------------------
		matrix[1][0] = 0;
		matrix[1][1] = 0;
		matrix[1][2] = 0;
		// ------------------
		matrix[2][0] = 0;
		matrix[2][1] = 0;
		matrix[2][2] = 0;
		// ------------------

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {				
				matrix[i][i] = 1;
				System.out.print("|" + matrix[i][j]);

			}			
			System.out.print("|\n");
		}

	}
}
