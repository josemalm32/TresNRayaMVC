package controlador;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.TresNRayaUI;



@SuppressWarnings("serial")
public class Principal extends TresNRayaUI{
	
	
	
public Principal(){
	
	Control control = new Control();
	
	cerocero.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	cerocero.setText(control.evento(0, 0, cerocero.getText()));

		}
	});
	cerouno.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			cerouno.setText(control.evento(0, 1, cerouno.getText()));
		}
	});
	cerodos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			cerodos.setText(control.evento(0, 2, cerodos.getText()));
			
		}
	});
	unocero.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			unocero.setText(control.evento(1, 0, unocero.getText()));
		}
	});
	unouno.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
			unouno.setText(control.evento(1, 1, unouno.getText()));
		}
	});
	unodos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			unodos.setText(control.evento(1, 2, unodos.getText()));
		}
	});
	doscero.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			doscero.setText(control.evento(2, 0, doscero.getText()));
		}
	});
	dosuno.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dosuno.setText(control.evento(2, 1, dosuno.getText()));
			
		}
	});
	dosdos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			dosdos.setText(control.evento(2, 2, dosdos.getText()));
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
