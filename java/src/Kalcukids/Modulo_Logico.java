package Kalcukids;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Modulo_Logico extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Resultado;

	public JButton btn1, btn0, btnAtras, btnIgual, btnAnd, btnOr;
	int N1, N2, R;
	int x = 0;
	char operacion;
	private JButton btnC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modulo_Logico frame = new Modulo_Logico();
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
	public Modulo_Logico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnAnd_1 = new JMenu("And");
		menuBar.add(mnAnd_1);
		mnAnd_1.addActionListener(this);

		JMenu mnOr_1 = new JMenu("Or");
		menuBar.add(mnOr_1);
		mnOr_1.addActionListener(this);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(57, 19, 111));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 30));

		btn0 = new JButton("0");
		btn0.addActionListener(this);
		btn0.setBackground(new Color(57, 19, 111));
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 30));

		Resultado = new JTextField();
		Resultado.setColumns(10);

		btnAtras = new JButton("atras");
		btnAtras.addActionListener(this);

		btnIgual = new JButton("=");
		btnIgual.addActionListener(this);

		btnAnd = new JButton("AND");
		btnAnd.setBackground(new Color(57, 19, 111));
		btnAnd.setForeground(new Color(255, 255, 255));
		btnAnd.addActionListener(this);

		btnOr = new JButton("OR");
		btnOr.setBackground(new Color(98, 42, 193));
		btnOr.setForeground(new Color(255, 255, 255));
		btnOr.addActionListener(this);

		btnC = new JButton("C");
		btnC.setBackground(new Color(98, 42, 193));
		btnC.setForeground(new Color(255, 255, 255));
		btnC.addActionListener(this);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnOr, 0, 0, Short.MAX_VALUE)
								.addComponent(btnAnd, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
								.addComponent(btnC, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAtras))
					.addGap(29))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(153)
					.addComponent(btnIgual, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(163, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(120)
					.addComponent(Resultado, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(125, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAnd)
							.addGap(7)
							.addComponent(btnOr)
							.addGap(7)
							.addComponent(btnC)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnIgual, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Resultado, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(btnAtras))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
//Condiciones para que cuando se pulse el boton C se borren todos los datos que se hayan introducido
		if (o.equals(btnC)) {
			N1 = 0;
			N2 = 0;
			R = 0;
			Resultado.setText("");
		}
//Condiciones para que en el caso de que cuando 
		if (o.equals(btn1)) {
			if (x == 0) {
				Resultado.setText("1");
			} else {
				Resultado.setText("");
				Resultado.setText("1");
				x = 0;
			}
		}
		if (o.equals(btn0)) {
			if (x == 0) {
				Resultado.setText("0");
			} else {
				Resultado.setText("");
				Resultado.setText("0");
				x = 0;
			}
		}
		if (o.equals(btnAnd)) {
			N1 = Integer.parseInt(Resultado.getText());
			operacion = 'a';
			x = 0;
			Resultado.requestFocus();
		}
		if (o.equals(btnOr)) {
			N1 = Integer.parseInt(Resultado.getText());
			operacion = 'o';
			x = 0;
			Resultado.requestFocus();
		}
		if (o.equals(btnIgual)) {
			N2 = Integer.parseInt(Resultado.getText());
			switch (operacion) {
			case 'a':
				if (N1 == 1) {
					if (N2 == 1) {
						R = 1;
					} else {
						R = 0;
					}
				} else {
					R = 0;
				}
				break;
			case 'o':
				if (N1 == 0) {
					if (N2 == 0) {
						R = 0;
					} else {
						R = 1;
					}
				} else {
					R = 1;
				}
				break;
			}
			Resultado.setText("Resultado = " + R);
			x = 1;
		}
		Resultado.requestFocus();
		if (o.equals(btnAtras)) {
			Modulo_Menu vm = new Modulo_Menu();
			vm.setTitle("Bienvenido");
			vm.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
	}
}
