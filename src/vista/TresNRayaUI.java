package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TresNRayaUI extends JFrame {

	protected JPanel contentPane;
	protected JTextField estadoText;
	protected JButton cerocero = new JButton("");
	protected JButton cerouno = new JButton("");
	protected JButton cerodos = new JButton("");
	protected JButton unocero = new JButton("");
	protected JButton unouno = new JButton("O");
	protected JButton doscero = new JButton("");
	protected JButton unodos = new JButton("");
	protected JButton dosuno = new JButton("");
	protected JButton dosdos = new JButton("");
	
	/**
	 * Create the frame.
	 */
	public TresNRayaUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTresNRaya = new JLabel("Tres N Raya");
		lblTresNRaya.setHorizontalAlignment(SwingConstants.CENTER);
		lblTresNRaya.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblTresNRaya.setBounds(12, 13, 512, 65);
		contentPane.add(lblTresNRaya);
		cerocero.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
	
		
		
		cerocero.setBounds(12, 127, 122, 109);
		contentPane.add(cerocero);
		cerouno.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
		
		
		cerouno.setBounds(202, 127, 122, 109);
		contentPane.add(cerouno);
		cerodos.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
		
		
		cerodos.setBounds(402, 127, 122, 109);
		contentPane.add(cerodos);
		unocero.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
		
		
		unocero.setBounds(12, 256, 122, 109);
		contentPane.add(unocero);
		unouno.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
		
		
		unouno.setBounds(202, 256, 122, 109);
		contentPane.add(unouno);
		unodos.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
		
		
		unodos.setBounds(402, 256, 122, 109);
		contentPane.add(unodos);
		doscero.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
		
		
		doscero.setBounds(12, 383, 122, 109);
		contentPane.add(doscero);
		dosuno.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
		
		
		dosuno.setBounds(202, 383, 122, 109);
		contentPane.add(dosuno);
		dosdos.setFont(new Font("Tahoma", Font.PLAIN, 78));
		
		
		
		dosdos.setBounds(402, 383, 122, 109);
		contentPane.add(dosdos);
		
		estadoText = new JTextField();
		estadoText.setBounds(88, 542, 294, 22);
		contentPane.add(estadoText);
		estadoText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Estado");
		lblNewLabel.setBounds(27, 545, 49, 16);
		contentPane.add(lblNewLabel);
	}
}
