package Kalcukids.copy;

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
	JButton suma, resta, division, multiplicacion, igual, masmenos, coma;
	Container cont;
	JPanel panelbotones, panelresultado;

	Modulo_Calculadora() {
		cont = getContentPane();
		cont.setLayout(new BorderLayout());
		panelresultado = new JPanel();
		panelresultado.setBackground(Color.GRAY);
		textresultado = new JTextField(25);
		textresultado.setFont(new Font("Arial Black", Font.BOLD, 16));
		textresultado.setHorizontalAlignment(SwingConstants.RIGHT);
		panelresultado.add(textresultado);
		
		// Panel de botones con todos los botones y su actionlistener
		
		panelbotones = new JPanel();
		panelbotones.setBackground(Color.GRAY);
		siete = new JButton("7");
		siete.addActionListener(this);
		ocho = new JButton("8");
		ocho.addActionListener(this);
		nueve = new JButton("9");
		nueve.addActionListener(this);
		c = new JButton("C");
		c.addActionListener(this);
		cuatro = new JButton("4");
		cuatro.addActionListener(this);
		cinco = new JButton("5");
		cinco.addActionListener(this);
		seis = new JButton("6");
		seis.addActionListener(this);
		resta = new JButton("-");
		resta.addActionListener(this);
		tres = new JButton("3");
		tres.addActionListener(this);
		dos = new JButton("2");
		dos.addActionListener(this);
		uno = new JButton("1");
		uno.addActionListener(this);
		suma = new JButton("+");
		suma.addActionListener(this);
		masmenos = new JButton("+/-");
		masmenos.addActionListener(this);
		cero = new JButton("0");
		cero.addActionListener(this);
		coma = new JButton(".");
		coma.addActionListener(this);
		division = new JButton("/");
		division.addActionListener(this);
		multiplicacion = new JButton("*");
		multiplicacion.addActionListener(this);
		igual = new JButton("=");
		igual.addActionListener(this);

		cont.add("Center", panelbotones);
		
		JButton Atras = new JButton("Atras");
		GroupLayout gl_panelbotones = new GroupLayout(panelbotones);
		gl_panelbotones.setHorizontalGroup(
			gl_panelbotones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelbotones.createSequentialGroup()
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelbotones.createSequentialGroup()
							.addComponent(tres, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(dos, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(uno, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(suma, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelbotones.createSequentialGroup()
							.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addComponent(cuatro, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(seis, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addComponent(siete, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(nueve, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
							.addGap(2)
							.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
								.addComponent(multiplicacion, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(resta, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelbotones.createSequentialGroup()
							.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING, false)
								.addComponent(c, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addComponent(masmenos, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(cero, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addGap(2)
									.addComponent(coma, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(division, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelbotones.createSequentialGroup()
									.addGap(1)
									.addComponent(igual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(gl_panelbotones.createSequentialGroup()
							.addGap(185)
							.addComponent(Atras)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelbotones.setVerticalGroup(
			gl_panelbotones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelbotones.createSequentialGroup()
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(siete, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelbotones.createParallelGroup(Alignment.BASELINE)
							.addComponent(nueve, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addComponent(multiplicacion, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(cuatro, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(seis, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(resta, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(tres, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(dos, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(uno, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(suma, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.LEADING)
						.addComponent(masmenos, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(cero, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(coma, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(division, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_panelbotones.createParallelGroup(Alignment.BASELINE)
						.addComponent(c, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(igual, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(Atras))
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
		
		if (btn.equals("atras")) {
			this.setVisible(false);
			this.dispose();
		
			textresultado.requestFocus();
	}}

	/*
	 * Caracteristicas de la ventalna de la aplicacion.
	 */
	
	public static void main(String args[]) {
		Modulo_Calculadora n = new Modulo_Calculadora();
		n.setTitle("CALCULADORA");
		n.setSize(440, 300);
		n.setResizable(true);
		n.setVisible(true);
	}
}