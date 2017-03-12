package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;



public class ReceptorDeEventos implements ActionListener {
	Control ControlGame = new Control();
	int posicionx, posiciony;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		reconoceBoton(arg0.getSource());
	}

	private void reconoceBoton(Object source) {
		JButton boton = (JButton) source;
		posicionx = Integer.valueOf(Character.toString(boton.getName().charAt(0)));
		posiciony = Integer.valueOf(Character.toString(boton.getName().charAt(1)));
		boton.setText(ControlGame.evento(posicionx, posiciony, boton.getText()));
	}

	public int getPosicionx() {
		return posicionx;
	}

	public int getPosiciony() {
		return posiciony;
	}

}
