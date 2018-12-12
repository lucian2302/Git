package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

public class Ventanaleercontraseñacomun extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JTextField TxtNUM;
	private JLabel lblHolaMundo;
	private JPanel paneldatos;
	private JLabel lblNumero;
	private JLabel lblContrasea;
	private JPasswordField passwordField;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanaleercontraseñacomun frame = new Ventanaleercontraseñacomun();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventanaleercontraseñacomun() {
		setResizable (false);
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 149);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.DARK_GRAY));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		//etiqueta hola mundo
		lblHolaMundo = new JLabel("anononimo");
		lblHolaMundo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHolaMundo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHolaMundo, BorderLayout.SOUTH);
		//panel de datos
		paneldatos = new JPanel();
		paneldatos.setBorder(new LineBorder(Color.WHITE, 1, true));
		paneldatos.setBackground(Color.DARK_GRAY);
		contentPane.add(paneldatos, BorderLayout.NORTH);
		//etiqueta numero
		lblNumero = new JLabel("Name ");
		lblNumero.setForeground(Color.WHITE);
		paneldatos.add(lblNumero);
		//apartado de texto
		TxtNUM = new JTextField();
		TxtNUM.addActionListener(this);
		TxtNUM.setHorizontalAlignment(SwingConstants.RIGHT);
		TxtNUM.setText("1dw3");
		paneldatos.add(TxtNUM);			
		paneldatos.add(TxtNUM);
		TxtNUM.setColumns(10);
	//label de contraseña	
		lblContrasea = new JLabel("contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		paneldatos.add(lblContrasea);
	//contraseña
		passwordField = new JPasswordField();
		passwordField.addActionListener(this);
		passwordField.setColumns(10);
		paneldatos.add(passwordField);
	//boton ok
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);	
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		paneldatos.add(btnOk);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	// accciones a realizar al pulsar el botón
				String usuario=TxtNUM.getText();
				String password=new String(passwordField.getPassword());
				String mensaje;
				//condicional 
				if(usuario.equals("1dw3") && password.equals("1dw3")) {
				mensaje =("bienvenido "+TxtNUM.getText());
				}
				else {
				mensaje=("usuario erroneo");
				}
				lblHolaMundo.setText(mensaje);
	}

}
