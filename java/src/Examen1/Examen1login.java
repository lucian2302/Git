package Examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Examen1login extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3583213081011643310L;
	private JPanel contentPane;
	private JTextField txtusuario;
	private JLabel lblcontrasena;
	private JPasswordField PSWcontrasena;
	private JLabel lblImensaje;
	private JPanel panel;
	private JLabel lblUsuario;
	//int x=3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1login frame = new Examen1login();
					frame.setTitle("Examen de Lucian Hanzi");
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
	public Examen1login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblUsuario = new JLabel("Usuario :");
		panel.add(lblUsuario);
		
		txtusuario = new JTextField();
		txtusuario.addActionListener(this);
		panel.add(txtusuario);
		txtusuario.setColumns(10);
		
		lblcontrasena = new JLabel("Password ");
		panel.add(lblcontrasena);
		
		PSWcontraseadas ana = new JPasswordField();
		PSWcontrasena.addActionListener(this);
		PSWcontrasena.setColumns(4);
		panel.add(PSWcontrasena);
		
		lblImensaje = new JLabel("Introduce tus datos porfavor ");
		lblImensaje.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblImensaje, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int x = 3 ;
		String Psw=new String(PSWcontrasena.getPassword());
		String Usuario= new String(txtusuario.getText());
	
		if (x > 0) 
	{		
		if(Usuario.equals("lucian") && Psw.equals("hanzi")) {
			Examen1Menu ve = new Examen1Menu();
			ve.setTitle("Bienvenido Lucian");
			ve.setVisible(true);
			this.setVisible(false);
			this.dispose();}
		
		else{
			
				x = (x - 1);
				
				String mensaje="Error. Los datos no son correctos. Le quedan "+x+" intentos";
				lblImensaje.setText(mensaje);}					
			}
	else {
		System.exit(0);
	}
			
		}
	

}
