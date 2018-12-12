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
import javax.swing.JToolBar;
import javax.swing.ImageIcon;


public class BotonesMensajeMenuBarra extends JFrame implements ActionListener{

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
	private JPanel panel_1;
	private JToolBar toolBar;
	private JButton btnHola_1;
	private JButton btnAdios_1;
	private JButton btnKaixo_1;
	private JButton btnAgur_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajeMenuBarra frame = new BotonesMensajeMenuBarra();
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
	public BotonesMensajeMenuBarra() {
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
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		btnAdios = new JButton("Adios");
		panel_1.add(btnAdios);
		btnAdios.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAdios.setForeground(Color.WHITE);
		btnAdios.setBackground(Color.DARK_GRAY);
		
		btnHola = new JButton("Hola");
		panel_1.add(btnHola);
		btnHola.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnHola.setForeground(Color.WHITE);
		btnHola.setBackground(Color.DARK_GRAY);
		
		btnKaixo = new JButton("Kaixo");
		panel_1.add(btnKaixo);
		btnKaixo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnKaixo.setForeground(Color.WHITE);
		btnKaixo.setBackground(Color.DARK_GRAY);
		
		btnAgur = new JButton("Agur");
		panel_1.add(btnAgur);
		btnAgur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAgur.setForeground(Color.WHITE);
		btnAgur.setBackground(Color.DARK_GRAY);
		
		textNombre = new JTextField();
		textNombre.setText("Anonimo");
		panel.add(textNombre, BorderLayout.NORTH);
		textNombre.setBackground(Color.WHITE);
		textNombre.setColumns(10);
		btnAgur.addActionListener(this);
		btnKaixo.addActionListener(this);
		btnHola.addActionListener(this);
		btnAdios.addActionListener(this);
		
		lblMensaje = new JLabel("No hay mensaje ");
		lblMensaje.setBackground(new Color(192, 192, 192));
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
		
		toolBar = new JToolBar();
		toolBar.setBackground(Color.LIGHT_GRAY);
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnHola_1 = new JButton("Hola");
		btnHola_1.setBackground(Color.DARK_GRAY);
		btnHola_1.setIcon(new ImageIcon(BotonesMensajeMenuBarra.class.getResource("/iconos/abrir.gif")));
		btnHola_1.addActionListener(this);
	
		toolBar.add(btnHola_1);
		
		btnAdios_1 = new JButton("Adios");
		btnAdios_1.setBackground(Color.DARK_GRAY);
		btnAdios_1.addActionListener(this);
		btnAdios_1.setIcon(new ImageIcon(BotonesMensajeMenuBarra.class.getResource("/iconos/cortar.gif")));
		toolBar.add(btnAdios_1);
		
		btnKaixo_1 = new JButton("kaixo");
		btnKaixo_1.setBackground(Color.DARK_GRAY);
		btnKaixo_1.addActionListener(this);
		btnKaixo_1.setIcon(new ImageIcon(BotonesMensajeMenuBarra.class.getResource("/iconos/nuevo.gif")));
		toolBar.add(btnKaixo_1);
		
		btnAgur_1 = new JButton("agur");
		btnAgur_1.setBackground(Color.DARK_GRAY);
		btnAgur_1.addActionListener(this);
		btnAgur_1.setIcon(new ImageIcon(BotonesMensajeMenuBarra.class.getResource("/iconos/fuente.gif")));
		toolBar.add(btnAgur_1);
		
		
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
