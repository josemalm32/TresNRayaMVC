package controlador;

public class TresEnColumna {
	
		//Version 3. funciona para cualquier tamaño de fila pero divide los problemas en 
		//problemas más sencillos
		public static boolean hasThreeInAColum(int[][] matrix) {
			for (int j = 0; j < matrix.length; j++) {
				int[]columna=getColumn(matrix,j);
				if (ThreeInThisRow(columna))
					return true;
			}
			return false;
		}

		private static int[] getColumn(int[][] matrix, int j) {
			int[] vector=new int[matrix.length];
			for (int i = 0; i < vector.length; i++) {
				vector[i]=matrix[i][j];
			}
			return vector;
		}

		private static boolean ThreeInThisRow(int[] vector) {
			boolean thisRow = true;
			for (int j = 0; j < vector.length - 1 && thisRow; j++) {
				thisRow = vector[j] == vector[j + 1] && vector[0] != 0;
			}
			return thisRow;
		}
}
