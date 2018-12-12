package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;


public class BotonesMensajeMenu extends JFrame implements ActionListener{

	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JButton btnHola;
	private JButton btnKaixo;
	private JButton btnAdios;
	private JButton btnAgur;
	private JPanel panel;
	private JLabel lblMensaje;
	private JTextField textNombre;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmHola;
	private JMenuItem mntmAdios;
	private JMenuItem mntmKaixo;
	private JMenuItem mntmAgur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajeMenu frame = new BotonesMensajeMenu();
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
	public BotonesMensajeMenu() {
		setResizable(false);
		setTitle("VentanaActionListenerComunFoco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 361);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmHola = new JMenuItem("Hola");
		mntmHola.addActionListener(this);
		mntmHola.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmHola);
		
		mntmAdios = new JMenuItem("Adios");
		mntmAdios.addActionListener(this);
		mntmAdios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmAdios);
		
		mntmKaixo = new JMenuItem("Kaixo");
		mntmKaixo.addActionListener(this);
		mntmKaixo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmKaixo);
		
		mntmAgur = new JMenuItem("Agur");
		mntmAgur.addActionListener(this);
		mntmAgur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmAgur);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		btnAdios = new JButton("Adios");
		btnAdios.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAdios.setForeground(Color.WHITE);
		btnAdios.setBackground(Color.DARK_GRAY);
		btnAdios.addActionListener(this);
		panel.add(btnAdios);
		
		btnHola = new JButton("Hola");
		btnHola.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnHola.setForeground(Color.WHITE);
		btnHola.setBackground(Color.DARK_GRAY);
		btnHola.addActionListener(this);
		panel.add(btnHola);
		
		btnKaixo = new JButton("Kaixo");
		btnKaixo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnKaixo.setForeground(Color.WHITE);
		btnKaixo.setBackground(Color.DARK_GRAY);
		btnKaixo.addActionListener(this);
		panel.add(btnKaixo);
		
		btnAgur = new JButton("Agur");
		btnAgur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAgur.setForeground(Color.WHITE);
		btnAgur.setBackground(Color.DARK_GRAY);
		btnAgur.addActionListener(this);
		panel.add(btnAgur);
		
		lblMensaje = new JLabel("No hay mensaje ");
		lblMensaje.setBackground(new Color(192, 192, 192));
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
		
		textNombre = new JTextField();
		textNombre.setBackground(Color.WHITE);
		contentPane.add(textNombre, BorderLayout.NORTH);
		textNombre.setColumns(10);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		//condicional 
		Object o = ae.getSource();
		String mensaje="";
		
		mensaje = o.getClass().getName();
		lblMensaje.setText(mensaje);
		
		if(mensaje.equals("javax.swing.JMenuitem")) {
			mensaje = ((JMenuItem)o).getText();}
		else if(mensaje.equals("javax.swing.JButton")){
			mensaje =((JButton)o).getText();
		}
		lblMensaje.setText(mensaje+" "+textNombre.getText());


		}}
