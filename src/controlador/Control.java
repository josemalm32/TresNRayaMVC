package controlador;

public class Control {

	
	public int[][] evento (int[][] tablero,int turno,int posicionx, int posiciony){
		
		
		
		return tablero;
	}
	
	
	public int[][] colocarFicha(int[][] tablero,int turno,int posicionx, int posiciony) {
		if (turno%2==0){
			 tablero[posicionx][posiciony]=2;
		}else {
			 tablero[posicionx][posiciony]=1;
		}
		
		return tablero;
		}
	
	public int[][] borrarFicha(int[][] tablero,int posicionx, int posiciony) {
		return tablero;
		
	}
	
	public boolean comprobarEncerrada(int [][] tablero, int [] posicion) {
		for (int x=posicion[0]-1;x<=posicion[0]+1;x++)
			for (int y=posicion[1]-1;y<=posicion[1]+1;y++)
				if (x>-1&&x<3&&y>-1&&y<3){
					if (tablero[x][y]==0){
						return true;
						}
				}
		return false;
	}
	
	
	public static boolean comprobarContigua(int[] posicionantigua, int[] posicion, int [][] tablero) {
		int x=posicion[0]-posicionantigua[0],y=posicion[1]-posicionantigua[0];
		if(x>-2&&x<2&&y>-2&&y<2){
			return true;
		}else  {
			return false;
		}
	}
	
	
	
	
	
	
}
