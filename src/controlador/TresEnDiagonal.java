package controlador;

public class TresEnDiagonal {

	public static boolean isThreeDiagonalStraightPro(int[][] matrix) {
		boolean bandera = true;
		for (int i = 0; i < matrix.length - 1 && bandera; i++) {
			int j = i;
			bandera = (matrix[i][j] == matrix[i + 1][j + 1]);
		}
		return bandera;
	}
	public static boolean isThreeDiagonalInversePro(int[][] matrix) {
		boolean bandera = true;
		for (int i = 0,j = matrix.length-1-i; i < matrix.length - 1 
				&& bandera; i++,j--) {
			bandera = (matrix[i][j] == matrix[i + 1][j - 1]);
		}
		return bandera;
	}
	
	
	
	
	
	
	
	
	
}
