package Kalcukids;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Modulo_Calculadora extends JFrame implements ActionListener {
	
	/**
	* Modulo Calculadora. Operaciones: sumar, restar, multiplicar y dividir.
	*/
	
	private static final long serialVersionUID = 1L;
	JTextField textresultado;
	double N1, N2, resultado;
	int x = 0, y = 0, z = 0;
	char operacion;
	JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, c;
	JButton suma, resta, division, multiplicacion, igual, masmenos, coma, Atras;
	Container cont;
	JPanel panelbotones, panelresultado;

	Modulo_Calculadora() {
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		panelresultado = new JPanel();
		panelresultado.setBackground(new Color(0, 0, 0));
		textresultado = new JTextField(25);
		textresultado.setForeground(new Color(255, 255, 255));
		textresultado.setBackground(new Color(0, 0, 0));
		textresultado.setFont(new Font("Arial Black", Font.BOLD, 16));
		textresultado.setHorizontalAlignment(SwingConstants.RIGHT);
		panelresultado.add(textresultado);
		
		// Panel de botones con todos los botones y su actionlistener
		
		panelbotones = new JPanel();
		panelbotones.setBackground(new Color(20, 20, 20));
		siete = new JButton("7");
		siete.setForeground(new Color(255, 255, 255));
		siete.setBackground(new Color(20, 20, 20));
		siete.setFont(new Font("Arial Black", Font.PLAIN, 18));
		siete.addActionListener(this);
		ocho = new JButton("8");
		ocho.setForeground(new Color(255, 255, 255));
		ocho.setBackground(new Color(19, 21, 32));
		ocho.setFont(new Font("Arial Black", Font.PLAIN, 18));
		ocho.addActionListener(this);
		nueve = new JButton("9");
		nueve.setForeground(new Color(255, 255, 255));
		nueve.setBackground(new Color(37, 16, 55));
		nueve.setFont(new Font("Arial Black", Font.PLAIN, 18));
		nueve.addActionListener(this);
		resta = new JButton("-");
		resta.setForeground(new Color(255, 255, 255));
		resta.setBackground(new Color(20, 20, 20));
		resta.setFont(new Font("Arial Black", Font.PLAIN, 18));
		resta.addActionListener(this);
		masmenos = new JButton("\u00B1");
		masmenos.setForeground(new Color(255, 255, 255));
		masmenos.setBackground(new Color(20, 20, 20));
		masmenos.setFont(new Font("Arial", Font.PLAIN, 18));
		masmenos.addActionListener(this);
		cero = new JButton("0");
		cero.setForeground(new Color(255, 255, 255));
		cero.setBackground(new Color(23, 20, 33));
		cero.setFont(new Font("Arial Black", Font.PLAIN, 18));
		cero.addActionListener(this);
		coma = new JButton(".");
		coma.setForeground(new Color(255, 255, 255));
		coma.setBackground(new Color(35, 16, 60));
		coma.setFont(new Font("Arial Black", Font.PLAIN, 18));
		coma.addActionListener(this);
		division = new JButton("\u00F7");
		division.setForeground(new Color(255, 255, 255));
		division.setBackground(new Color(20, 20, 20));
		division.setFont(new Font("Arial", Font.PLAIN, 18));
		division.addActionListener(this);
		multiplicacion = new JButton("x");
		multiplicacion.setForeground(new Color(255, 255, 255));
		multiplicacion.setBackground(new Color(20, 20, 20));
		multiplicacion.setFont(new Font("Arial", Font.PLAIN, 18));
		multiplicacion.addActionListener(this);
		igual = new JButton("=");
		igual.setForeground(new Color(46, 204, 113));
		igual.setFont(new Font("Arial Black", Font.PLAIN, 18));
		igual.setBackground(new Color(51, 51, 51));
		igual.addActionListener(this);

		cont.add("Center", panelbotones);
		
		Atras = new JButton("Atras");
		Atras.setForeground(Color.WHITE);
		Atras.setBackground(new Color(34, 15, 59));
		Atras.setFont(new Font("Arial", Font.PLAIN, 18));
		Atras.addActionListener(this);
		seis = new JButton("6");
		seis.setForeground(new Color(255, 255, 255));
		seis.setBackground(new Color(39, 16, 58));
		seis.setFont(new Font("Arial Black", Font.PLAIN, 18));
		seis.addActionListener(this);
		cinco = new JButton("5");
		cinco.setForeground(new Color(255, 255, 255));
		cinco.setBackground(new Color(22, 20, 30));
		cinco.setFont(new Font("Arial Black", Font.PLAIN, 18));
		cinco.addActionListener(this);
		cuatro = new JButton("4");
		cuatro.setForeground(new Color(255, 255, 255));
		cuatro.setBackground(new Color(20, 20, 20));
		cuatro.setFont(new Font("Arial Black", Font.PLAIN, 18));
		cuatro.addActionListener(this);
		suma = new JButton("+");
		suma.setForeground(new Color(255, 255, 255));
		suma.setBackground(new Color(37, 16, 55));
		suma.setFont(new Font("Arial Black", Font.PLAIN, 18));
		suma.addActionListener(this);
		uno = new JButton("1");
		uno.setForeground(new Color(255, 255, 255));
		uno.setBackground(new Color(98, 42, 193));
		uno.setFont(new Font("Arial Black", Font.PLAIN, 18));
		uno.addActionListener(this);
		dos = new JButton("2");
		dos.setForeground(new Color(255, 255, 255));
		dos.setBackground(new Color(57, 19, 111));
		dos.setFont(new Font("Arial Black", Font.PLAIN, 18));
		dos.addActionListener(this);
		tres = new JButton("3");
		tres.setForeground(new Color(255, 255, 255));
		tres.setBackground(new Color(31, 15, 73));
		tres.setFont(new Font("Arial Black", Font.PLAIN, 18));
		tres.addActionListener(this);
		c = new JButton("C");
		c.setFont(new Font("Arial Black", Font.PLAIN, 18));
		c.setBackground(new Color(51, 51, 51));
		c.setForeground(new Color(255, 255, 102));
		c.addActionListener(this);
		GroupLayout gl_panelbotones = new GroupLayout(panelbotones);
		gl_panelbotones.setHorizontalGroup(
			gl_panelbotones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelbotones.createSequentialGroup()
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelbotones.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addComponent(siete, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(nueve, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(multiplicacion, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addComponent(cuatro, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(seis, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(resta, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addComponent(tres, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(dos, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(uno, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(suma, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addComponent(masmenos, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(cero, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(coma, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(division, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addComponent(c, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(igual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(gl_panelbotones.createSequentialGroup()
							.addGap(168)
							.addComponent(Atras, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(3, Short.MAX_VALUE))
		);
		gl_panelbotones.setVerticalGroup(
			gl_panelbotones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelbotones.createSequentialGroup()
					.addGap(2)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(siete, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(nueve, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(multiplicacion, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(cuatro, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(seis, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(resta, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(tres, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(dos, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(uno, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(suma, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(masmenos, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(cero, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(coma, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(division, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(c, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(igual, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Atras, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(14))
		);
		panelbotones.setLayout(gl_panelbotones);
		cont.add("North", panelresultado);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	/*
	 *ActionListener para codificar el funcionamiento de todos los botones.
	 *Mediante un if se comprueba que boton se ha pulsado.
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String btn = e.getActionCommand();
		
		/*Si se ha pulsado un boton de un numero se comprueba si Z = 0 (Si ha pulsado el boton igual Z sera 1).
		*	Si Z es igual a 0 se le añade el numero correspondiente al boton pulsado al numero.
		*	Si Z es igual a 1 se borra el texto, se le añade el numero correspondiente y se pone z igual a 0.
		*/
		
		// Boton 1

		if (btn.equals("1")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "1");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "1");
				z = 0;
			}
		}
		
		// Boton 2

		if (btn.equals("2")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "2");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "2");
				z = 0;
			}
		}
		
		// Boton 3

		if (btn.equals("3")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "3");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "3");
				z = 0;
			}
		}
		
		// Boton 4

		if (btn.equals("4")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "4");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "4");
				z = 0;
			}
		}
		
		// Boton 5

		if (btn.equals("5")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "5");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "5");
				z = 0;
			}
		}
		
		// Boton 6

		if (btn.equals("6")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "6");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "6");
				z = 0;
			}
		}
		
		// Boton 7

		if (btn.equals("7")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "7");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "7");
				z = 0;
			}
		}
		
		// Boton 8

		if (btn.equals("8")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "8");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "8");
				z = 0;
			}
		}
		
		// Boton 9

		if (btn.equals("9")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "9");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "9");
				z = 0;
			}
		}
		
		// Boton 0

		if (btn.equals("0")) {
			if (z == 0) {
				textresultado.setText(textresultado.getText() + "0");
			} else {
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + "0");
				z = 0;
			}
		}
		
		/*
		 * Si se ha pulsado el boton C, se borran el texto y las variables X, Y, Z, N1 y N2.
		 */
		
		// Boton C

		if (btn.equals("C")) {
			textresultado.setText("");
			x = 0;
			y = 0;
			z = 0;
			N1 = 0;
			N2 = 0;
		}

		/*
		 * Si se pulsa +/- se comprueba si X = 0.
		 *		Si X es igual a 0 se añade un - delante del texto y se pone X igual a 1.
		 *		Si X es igual a 1 pone el texto segun esta.
		 */
		
		// Boton +/-

		if (btn.equals("+/-")) {
			if (x == 0) {
				textresultado.setText("-" + textresultado.getText());
				x = 1;
			} else {
				textresultado.setText(textresultado.getText());
			}
		}
		
		/*
		 * Si se pulsa el punto se comprueba si Y es igual a 0.
		 *		Si Y es igual a 0 se añade un punto detras del texto.
		 *		Si Y es igual a 1 pone el texto segun esta.
		 */
		
		// Boton punto
		
		if (btn.equals(".")) {
			if (y == 0) {
				textresultado.setText(textresultado.getText() + ".");
				y = 1;
			} else {
				textresultado.setText(textresultado.getText());
			}
		}
		
		/*
		 * 	 Si se ha pulsado una operacion primero se comprueba si el texto esta vacio.
		 *		Si esta vacio a N1 se le asigna el valor 0 (1 en el caso de la multiplicacion y la division).
		 *		Sino se le asigna el texto a N1 (pasando a ser numero real double) y se borra el texto.
		 *			Al char operacion se le asigna el boton de la operacion que se ha pulsado.
		 *			Tambien se le asignan el valor 0 a X e Y.
		 */
		
		// Boton mas
		
		if (btn.equals("+")) {
			if (textresultado.getText().equals("")) {
				textresultado.setText("");
				N1 = 0;
				operacion = '+';
			} else {
				N1 = Double.parseDouble(textresultado.getText());
				textresultado.setText("");
				operacion = '+';
				y = 0;
				x = 0;
			}
			textresultado.requestFocus();
		}
		
		// Boton menos
		
		if (btn.equals("-")) {
			if (textresultado.getText().equals("")) {
				textresultado.setText("");
				N1 = 0;
				operacion = '-';
			} else {
				N1 = Double.parseDouble(textresultado.getText());
				textresultado.setText("");
				operacion = '-';
				x = 0;
				y = 0;
			}
			textresultado.requestFocus();
		}
		
		// Boton dividir

		if (btn.equals("/")) {
			if (textresultado.getText().equals("")) {
				textresultado.setText("");
				N1 = 1;
				operacion = '/';
			} else {
				N1 = Double.parseDouble(textresultado.getText());
				operacion = '/';
				textresultado.setText("");
				x = 0;
				y = 0;
			}
			textresultado.requestFocus();
		}
		
		// Boton multiplicar

		if (btn.equals("*")) {
			if (textresultado.getText().equals("")) {
				textresultado.setText("");
				N1 = 1;
				operacion = '*';
			} else {
				N1 = Double.parseDouble(textresultado.getText());
				operacion = '*';
				textresultado.setText("");
				x = 0;
				y = 0;
			}
			textresultado.requestFocus();
		}

		/*
		 *  Si se ha pulsado el boton igual se comprueba si el texto esta vacio
		 *		Si esta vacio se pone el texto segun esta.
		 *		Sino se le asigna el texto a N2 y se comprueba (mediante un switch/case)
		 *		que operacion se ha pulsado y se muestra el resultado por pantalla.
		 */
		
		// Boton igual

		if (btn.equals("=")) {
			if (textresultado.getText().equals("")) {
				textresultado.setText("");
			} else {
				N2 = Double.parseDouble(textresultado.getText());
				switch (operacion) {
				case '+':
					resultado = N1 + N2;
					break;
				case '-':
					resultado = N1 - N2;
					break;
				case '/':
					resultado = N1 / N2;
					break;
				case '*':
					resultado = N1 * N2;
					break;
				}
				textresultado.setText("");
				textresultado.setText(textresultado.getText() + resultado);
				z = 1;
			}
		}
		
		if (btn.equals("Atras")) {
		Modulo_Menu vm = new Modulo_Menu();
		vm.setTitle("Bienvenido");
		vm.setVisible(true);
		this.setVisible(false);
		this.dispose();}}

	/*
	 * Caracteristicas de la ventalna de la aplicacion.
	 */
	
	public static void main(String args[]) {
		Modulo_Calculadora n = new Modulo_Calculadora();
		n.setTitle("CALCULADORA");
		n.setSize(460, 380);
		n.setResizable(true);
		n.setVisible(true);
	}
}