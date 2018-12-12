package Kalcukids.copy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Modulo_Menu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblKalkukids;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnCalculadora;
	private JButton btnLogico;
	private JPanel panel_2;
	private JButton btnGeometria;
	private JButton btnSalir;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modulo_Menu frame = new Modulo_Menu();
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
	public Modulo_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblKalkukids = new JLabel("Kalkukids");
		lblKalkukids.setHorizontalAlignment(SwingConstants.CENTER);
		lblKalkukids.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblKalkukids, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		btnCalculadora = new JButton("Calculadora");
		btnCalculadora.addActionListener(this);
		panel_1.add(btnCalculadora);
		
		btnLogico = new JButton("L\u00F3gico");
		btnLogico.addActionListener(this);
		panel_1.add(btnLogico);
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		btnGeometria = new JButton("Geometr\u00EDa");
		btnGeometria.addActionListener(this);
		panel_2.add(btnGeometria);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		panel_2.add(btnSalir);
		
		panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Modulo_Menu.class.getResource("/iconos/acercade.gif")));
		panel_3.add(lblNewLabel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();

		
		if (o.equals(btnCalculadora)){
			Modulo_Calculadora vc = new Modulo_Calculadora();
		//la hago visible
			vc.setTitle("Claculadora");
			vc.setVisible(true);
			vc.setSize(440, 300);
			vc.setResizable(true);
		//oculto la ventan de inicio 
			this.setVisible(false);
		//borro de memoria la ventan de inicio 
			this.dispose();
			}
		
		else if(o.equals(btnLogico)){
			Modulo_Logico vl = new Modulo_Logico();
		//la hago visible
			vl.setTitle("Lógico");
			vl.setVisible(true);
		//oculto la ventan de inicio 
			this.setVisible(false);
		//borro de memoria la ventan de inicio 
			this.dispose();
		}
		
		else if(o.equals(btnGeometria)){		
			Modulo_Geometrico vg = new Modulo_Geometrico();
		//la hago visible
			vg.setTitle("Geometría");
			vg.setVisible(true);
		//oculto la ventan de inicio 
			this.setVisible(false);
		//borro de memoria la ventan de inicio 
			this.dispose();
		}
		
		else
		{
			this.setVisible(false);
			this.dispose();
		}

				}
}

		
		



