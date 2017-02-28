package controlador;

public class TresEnFila {


	// Version 1 la más sencilla (sólo funciona para filas de 3)
	public static boolean TresEnAlgunaFila(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != 0)
				return true;
		}
		return false;
	}
//Version 2 más dificil porque funciona para filas de cualquier tamaño pero mezcla problemas
	public static boolean hasThreeInARow(int[][] matrix) {
		boolean hasThreeAnyRow = false;
		boolean thisRow = true;
		for (int i = 0; i < matrix.length && !hasThreeAnyRow; i++) {
			for (int j = 0; j < matrix[i].length - 1 && thisRow; j++) {
				thisRow = matrix[i][j] == matrix[i][j + 1] && matrix[i][0] != 0;
			}
			if (thisRow) {
				return true;
			}
			thisRow = true;
		}
		return hasThreeAnyRow;
	}

	//Version 3. funciona para cualquier tamaño de fila pero divide los problemas en 
	//problemas más sencillos
	public static boolean hasThreeInARowTwo(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (ThreeInThisRow(matrix[i]))
				return true;
		}
		return false;
	}

	private static boolean ThreeInThisRow(int[] vector) {
		boolean thisRow = true;
		for (int j = 0; j < vector.length - 1 && thisRow; j++) {
			thisRow = vector[j] == vector[j + 1] && vector[0] != 0;
		}
		return thisRow;
	}

	
	
	
	
	
}
