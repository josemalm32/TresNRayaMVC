package controlador;

import java.awt.EventQueue;

import vista.TresNRayaUI;



@SuppressWarnings("serial")
public class Principal extends TresNRayaUI{
	
	protected int tablero[][] = new int[3][3];
	
public Principal(){
	
	
	
	
	
}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//IMPORTANTE: Se crea un objeto de Principal no del UI
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
}
