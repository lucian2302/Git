package Examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Examen1Menu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnumero;
	public JPanel panel;
	public JButton btnPrimo;
	public JButton btnCircunferencia;
	public JButton btn10multiplos ;
	public JButton btnPar;
	public JLabel lblresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Menu frame = new Examen1Menu();
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
	public Examen1Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		btnPrimo = new JButton("EsPrimo");
		btnPrimo.addActionListener(this);
		panel.add(btnPrimo);
		
		btnCircunferencia = new JButton("Circunferencia");
		btnCircunferencia.addActionListener(this);
		panel.add(btnCircunferencia);
		
		btn10multiplos = new JButton("10 Multiplos");
		btn10multiplos.addActionListener(this);
		panel.add(btn10multiplos);
		
		btnPar = new JButton("Par o Impar ");
		btnPar.addActionListener(this);
		panel.add(btnPar);
		
		txtnumero = new JTextField();
		txtnumero.setHorizontalAlignment(SwingConstants.TRAILING);
		txtnumero.setText("0");
		contentPane.add(txtnumero, BorderLayout.NORTH);
		txtnumero.setColumns(10);
		lblresultado = new JLabel("Bienvenido");
		contentPane.add(lblresultado, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Double PI= Math.PI;
		Double x= 0.0;
		x = Double.parseDouble(txtnumero.getText());
		
		Object o = e.getSource();
		
		if (o.equals(btnPar)) {
			
			if ((x%2)==0) {
				lblresultado.setText(x+" Es par");
			}
			else {
				lblresultado.setText(x+" Es impar");
			}
			
		}
		
		else if (o.equals(btnPrimo)) {
			if ((x%x)==0 && (x%1)==0 && (x%2)!=0) {
				lblresultado.setText("El numero "+x+" Es primo");
			}
			else {
				lblresultado.setText(x+" No es primo");
			}
		} 
		
		
		else if (o.equals(btn10multiplos)) {
			lblresultado.setText("los 10 primeros multiplos de "+x+" son " +x*1+" "+x*2+" "+x*3+" "+x*4+" "+x*5+" "+x*6+" "+x*7+" "+x*8+" "+x*9+" "+x*10+" ");

			}
		
		
		else if(o.equals(btnCircunferencia)) {
			lblresultado.setText("El Valor de la circunferencia de de radio "+x+" es "+(x*2)*PI);
		}
		
	}

}
