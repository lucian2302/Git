package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

public class Ventanaleerentero extends JFrame {

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
					Ventanaleerentero frame = new Ventanaleerentero();
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
	public Ventanaleerentero() {
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 149);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.DARK_GRAY));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblHolaMundo = new JLabel("No se ha itroducido ningun numero ");
		lblHolaMundo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHolaMundo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHolaMundo, BorderLayout.SOUTH);
		
		paneldatos = new JPanel();
		paneldatos.setBorder(new LineBorder(Color.WHITE, 1, true));
		paneldatos.setBackground(Color.DARK_GRAY);
		contentPane.add(paneldatos, BorderLayout.NORTH);
		
		lblNumero = new JLabel("Name ");
		lblNumero.setForeground(Color.WHITE);
		paneldatos.add(lblNumero);
		
		TxtNUM = new JTextField();
		TxtNUM.setHorizontalAlignment(SwingConstants.RIGHT);
		TxtNUM.setText("7");
		paneldatos.add(TxtNUM);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// accciones a realizar al pulsar el botón
			String usuario=TxtNUM.getText();
			String password=new String(passwordField.getPassword());
	
			//if() {
				//lblHolaMundo = new JLabel("bienvenido Lucian");
			//}
			
			//else {
				lblHolaMundo = new JLabel("error");		
			//}
			
			}}
			);
		paneldatos.add(TxtNUM);
		TxtNUM.setColumns(10);
		
		lblContrasea = new JLabel("contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		paneldatos.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		paneldatos.add(passwordField);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		paneldatos.add(btnOk);
	}

}
