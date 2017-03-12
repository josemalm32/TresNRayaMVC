package controlador;

import vista.TresNRayaUI;

@SuppressWarnings("serial")
public class Control extends TresNRayaUI{

	private int posicionantiguax;
	private int posicionantiguay;
	private int tablero[][] = {{0,0,0},{0,2,0},{0,0,0}};
	private int turno = 1;
	private boolean banderaborrar = true;
	//Principal principal = new Principal();
	
	//Turno 0 Nadie, Turno 1 X, Turno 2 O
	public String evento (int posicionx, int posiciony, String contenido){
		
		
		//Bloque Uno.. Hasta el sexto movimiento juego normal.. Pon pon y pon
		if(turno<=5){
			//Comprobamos que la casilla este vacia...
			if(casillaVacia(posicionx, posiciony, tablero)){
				tablero = colocarFicha(tablero, turno, posicionx, posiciony);	
				String letra = devuelveXO(turno);
				if (comprobarLinea(tablero)){
					System.out.println("El ganador es la: " + letra);
					return letra;
				}
				turno++;
				System.out.println("Turno de la: " + devuelveXO(turno));
				return letra;
			}else {
				System.out.println("Esta Casilla No esta Libre!!!, Prueba con otra..");
				return contenido;
			}
		//Bloque Dos.. A partir del sexto movimiento, Hay que quitar y poner y comprobar.	
		}else{
			
			//Comprobamos si podemos borrar o hay que poner una ficha nueva
			if(banderaborrar){
			//Comprobamos que la ficha es nuestra... y que no 
			if(compruebaFicha(tablero, turno, posicionx, posiciony)){
				if(comprobarEncerrada(tablero, posicionx, posiciony)){
					borrarFicha(tablero, posicionx, posiciony);
					posicionantiguax = posicionx;
					posicionantiguay = posiciony;
					banderaborrar = false;
					System.out.println("Puedes Selecionar una posicion nueva.");
					return "";
				}else {
					System.out.println("Ummm.. la ficha esta encerrada :(");
					return contenido;
				}
				
				
			}else {
				System.out.println("Ummm.. la ficha no es tuya");
				return contenido;
			}
			
		}else  {
			if(comprobarContigua(posicionantiguax, posicionantiguay, posicionx, posiciony, tablero)){
				tablero = colocarFicha(tablero, turno, posicionx, posiciony);
				String letra =  devuelveXO(turno);
				if (comprobarLinea(tablero)){
					System.out.println("El ganador es la: " + letra);
					return letra;
					//Molaria la idea de enable(false) a la botonera.. 
				}
				turno++;
				System.out.println("Turno de la: " + devuelveXO(turno));
				banderaborrar = true;
				return letra;
			}else {
				System.out.println("La ficha no puede ser colocada aqui.. No es contigua a la posicion anterior.");
				return contenido;
			}			
		}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	//Metodos tipicos del 3 en raya.. 
	private boolean compruebaFicha(int[][] tablero,int turno,int posicionx, int posiciony){
		turno = turno%2;
		switch (turno) {
		case 0:
			if (tablero[posicionx][posiciony]==2){
				return true;
			}else return false;
		default:
			if (tablero[posicionx][posiciony]==1){
				return true;
			}else return false;
		}
		
	}
	
	private int[][] colocarFicha(int[][] tablero,int turno,int posicionx, int posiciony) {
		if (turno%2==0){
			 tablero[posicionx][posiciony]=2;
		}else {
			 tablero[posicionx][posiciony]=1;
		}
		
		return tablero;
		}
	
	private int[][] borrarFicha(int[][] tablero,int posicionx, int posiciony) {
		
		tablero[posicionx][posiciony] = 0;
		return tablero;
		
	}
	
	private boolean comprobarEncerrada(int [][] tablero,int posicionx,int posiciony) {
		for (int x=posicionx-1;x<=posiciony+1;x++)
			for (int y=posiciony-1;y<=posiciony+1;y++)
				if (x>-1&&x<3&&y>-1&&y<3){
					if (tablero[x][y]==0){
						return true;
						}
				}
		return false;
	}
	
	
	private boolean comprobarContigua(int posicionantiguax,int posicionantiguay, int posicionx,int posiciony, int [][] tablero) {
		int x=posicionx-posicionantiguax,y=posiciony-posicionantiguax;
		if(x>-2&&x<2&&y>-2&&y<2){
			return true;
		}else  {
			return false;
		}
	}
	
	
	private  boolean hasThreeInARowTwo(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (ThreeInThisRow(matrix[i]))
				return true;
		}
		return false;
	}
	
	
	private  boolean ThreeInThisRow(int[] vector) {
		boolean thisRow = true;
		for (int j = 0; j < vector.length - 1 && thisRow; j++) {
			thisRow = vector[j] == vector[j + 1] && vector[0] != 0;
		}
		return thisRow;
	}

	
	//Diagonal Recta
	private  boolean isThreeDiagonalStraightPro(int[][] matrix) {
		boolean bandera = true;
		for (int i = 0; i < matrix.length - 1 && bandera; i++) {
			int j = i;
			bandera = (matrix[i][j] == matrix[i + 1][j + 1]);
		}
		return bandera;
		
	}
	//Diagonal Inversa
	private  boolean isThreeDiagonalInversePro(int[][] matrix) {
		boolean bandera = true;
		for (int i = 0,j = matrix.length-1-i; i < matrix.length - 1 
				&& bandera; i++,j--) {
			bandera = (matrix[i][j] == matrix[i + 1][j - 1]);
		}
		return bandera;
	}
	
	
//Columna
	private  boolean hasThreeInAColum(int[][] matrix) {
		for (int j = 0; j < matrix.length; j++) {
			int[]columna=getColumn(matrix,j);
			if (ThreeInThisRow(columna))
				return true;
		}
		return false;
	}

	private  int[] getColumn(int[][] matrix, int j) {
		int[] vector=new int[matrix.length];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=matrix[i][j];
		}
		return vector;
	}


	private String devuelveXO(int numero) {
		if(numero%2==0){
			return "O";
		}
		return "X";
	}
	
	private boolean casillaVacia(int posicionx,int posiciony, int [][] tablero){
		return tablero[posicionx][posiciony] == 0;
	}
	
	
	private  boolean comprobarLinea(int [][] tablero) {
		
		if (hasThreeInAColum(tablero) || hasThreeInARowTwo(tablero) || isThreeDiagonalStraightPro(tablero) || isThreeDiagonalInversePro(tablero)){
			
			return true;
		} else return false;
	}
	
	
}
