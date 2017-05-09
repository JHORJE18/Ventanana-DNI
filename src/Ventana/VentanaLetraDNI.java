package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Component;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	private JTextField txtDNI;
	private JTextField txtLetra;



	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblIntroduceDni = new JLabel("Introduce DNI");
		lblIntroduceDni.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblIntroduceDni);
		
		txtDNI = new JTextField();
		txtDNI.setHorizontalAlignment(SwingConstants.CENTER);
		txtDNI.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		JLabel lblLetraDniCalculada = new JLabel("Letra DNI Calculada");
		lblLetraDniCalculada.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblLetraDniCalculada);
		
		txtLetra = new JTextField();
		txtLetra.setBackground(Color.DARK_GRAY);
		txtLetra.setHorizontalAlignment(SwingConstants.CENTER);
		txtLetra.setForeground(Color.GREEN);
		txtLetra.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(txtLetra);
		txtLetra.setEditable(false);
		txtLetra.setColumns(1);
		
		JButton btnCalcular = new JButton("Calcular");
		contentPane.add(btnCalcular);
	}

}
