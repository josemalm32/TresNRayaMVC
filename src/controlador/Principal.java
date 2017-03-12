package controlador;

import java.awt.Component;

import java.awt.EventQueue;

import javax.swing.JButton;

import vista.TresNRayaUI;

@SuppressWarnings("serial")
public class Principal extends TresNRayaUI{
	
	public void setEstado(String texto) {
		estadoText.setText(texto);		
	}
	
public Principal(){
	
	Component[] componentes = botonera.getComponents();
	ReceptorDeEventos eventos = new ReceptorDeEventos();
	for(Component component : componentes){
		JButton temporal = (JButton) component;
		temporal.addActionListener(eventos);
	}
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
