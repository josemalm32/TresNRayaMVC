package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class TresNRayaUI extends JFrame {

	protected JPanel contentPane;
	protected JLabel estadoText;
	protected JButton cerocero = new JButton("");
	protected JButton cerouno = new JButton("");
	protected JButton cerodos = new JButton("");
	protected JButton unocero = new JButton("");
	protected JButton unouno = new JButton("O");
	protected JButton doscero = new JButton("");
	protected JButton unodos = new JButton("");
	protected JButton dosuno = new JButton("");
	protected JButton dosdos = new JButton("");
	protected JPanel botonera = new JPanel();
	/**
	 * Create the frame.
	 */
	public TresNRayaUI() {
		setTitle("El Tres En Raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTresNRaya = new JLabel("Tres N Raya");
		lblTresNRaya.setHorizontalAlignment(SwingConstants.CENTER);
		lblTresNRaya.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblTresNRaya.setBounds(12, 13, 512, 65);
		contentPane.add(lblTresNRaya);
		
		
		estadoText = new JLabel();
		estadoText.setBackground(Color.WHITE);
		estadoText.setBounds(88, 542, 294, 22);
		contentPane.add(estadoText);
		
		JLabel lblNewLabel = new JLabel("Estado");
		lblNewLabel.setBounds(27, 545, 49, 16);
		contentPane.add(lblNewLabel);
		botonera.setBackground(new Color(30, 144, 255));
		
		
		botonera.setBounds(12, 95, 512, 411);
		contentPane.add(botonera);
		botonera.setLayout(null);
		cerocero.setBackground(Color.WHITE);
		cerocero.setBounds(12, 13, 101, 112);
		botonera.add(cerocero);
		cerocero.setFont(new Font("Tahoma", Font.PLAIN, 78));
		cerocero.setName("00");
		cerouno.setBackground(Color.WHITE);
		cerouno.setBounds(195, 13, 101, 112);
		botonera.add(cerouno);
		cerouno.setFont(new Font("Tahoma", Font.PLAIN, 78));
		cerouno.setName("01");
		cerodos.setBackground(Color.WHITE);
		cerodos.setBounds(384, 13, 99, 112);
		botonera.add(cerodos);
		cerodos.setFont(new Font("Tahoma", Font.PLAIN, 78));
		cerodos.setName("02");
		unocero.setBackground(Color.WHITE);
		unocero.setBounds(12, 148, 101, 112);
		botonera.add(unocero);
		unocero.setFont(new Font("Tahoma", Font.PLAIN, 78));
		unocero.setName("10");
		unouno.setBackground(Color.WHITE);
		unouno.setBounds(195, 148, 98, 112);
		botonera.add(unouno);
		unouno.setFont(new Font("Tahoma", Font.PLAIN, 78));
		unouno.setName("11");
		unodos.setBackground(Color.WHITE);
		unodos.setBounds(384, 148, 99, 112);
		botonera.add(unodos);
		unodos.setFont(new Font("Tahoma", Font.PLAIN, 78));
		unodos.setName("12");
		doscero.setBackground(Color.WHITE);
		doscero.setBounds(12, 286, 101, 112);
		botonera.add(doscero);
		doscero.setFont(new Font("Tahoma", Font.PLAIN, 78));
		doscero.setName("20");
		dosuno.setBackground(Color.WHITE);
		dosuno.setBounds(195, 286, 101, 111);
		botonera.add(dosuno);
		dosuno.setFont(new Font("Tahoma", Font.PLAIN, 78));
		dosuno.setName("21");
		dosdos.setBackground(Color.WHITE);
		dosdos.setBounds(384, 286, 99, 112);
		botonera.add(dosdos);
		dosdos.setFont(new Font("Tahoma", Font.PLAIN, 78));
		dosdos.setName("22");
	}
}
