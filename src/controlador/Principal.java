package controlador;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.TresNRayaUI;



@SuppressWarnings("serial")
public class Principal extends TresNRayaUI{
	
	protected int tablero[][] = new int[3][3];
	protected int posicion[][] = new int [1][1];
	protected int turno;
	
public Principal(){
	turno = 0;
	Control control = new Control();
	
	cerocero.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			
		}
	});
	cerouno.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	cerodos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	unocero.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	unouno.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	unodos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	doscero.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	dosuno.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	dosdos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	
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
