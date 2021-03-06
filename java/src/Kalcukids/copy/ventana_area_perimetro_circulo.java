package Kalcukids.copy;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

public class ventana_area_perimetro_circulo extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField RadioArea;
	private JTextField RadioPerimetro;
	public JButton btnigualA; 
	public JButton btnigualP;
	public JLabel lblresultado;
	public JLabel lblPerimetro;
	public JPanel panel_2;
	public JPanel panel_3;
	public JPanel panel_1;
	public JButton btnSalir;
	public GroupLayout gl_contentPane;
	public JLabel lblFormula_1;
	public JLabel lblRadio_1;
	public GroupLayout gl_panel_1;
	public GroupLayout gl_panel_2;
	public GroupLayout gl_panel_3;
	public JPanel panel;
	public JLabel lblRadio;
	public GroupLayout gl_panel;
	public JLabel lblArea;
	public JLabel label;

	
	

	/**
	 * Launch the application.
	 */
	public static void main (String[] args) 	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_area_perimetro_circulo frame = new ventana_area_perimetro_circulo();
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
	public ventana_area_perimetro_circulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 302);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblresultado = new JLabel("Resultado =");
		lblresultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		panel_2 = new JPanel();
		
		panel_3 = new JPanel();
		
		btnSalir = new JButton("Atras");
		btnSalir.addActionListener(this);
	 gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(75)
							.addComponent(lblresultado, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalir))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
							.addGap(21)))
					.addGap(62))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblresultado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSalir))
					.addContainerGap())
		);
		
		lblPerimetro = new JLabel("Perimetro");
		lblPerimetro.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		panel_1= new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		
		RadioPerimetro = new JTextField();
		RadioPerimetro.setColumns(10);
		
		lblRadio_1 = new JLabel("Radio");
		lblRadio_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		btnigualP = new JButton("=");
		btnigualP.addActionListener(this);
		gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnigualP)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblRadio_1)
							.addGap(10)
							.addComponent(RadioPerimetro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(85, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(RadioPerimetro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRadio_1))
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addComponent(btnigualP)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		lblFormula_1 = new JLabel("Formula : 2\u03C0 * radio");
		lblFormula_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(39)
							.addComponent(lblFormula_1))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(59)
							.addComponent(lblPerimetro))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(7)
					.addComponent(lblPerimetro)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblFormula_1)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
	  panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		
		lblRadio = new JLabel("Radio");
		lblRadio.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		RadioArea = new JTextField();
		RadioArea.setColumns(10);
		
		btnigualA = new JButton("=");
		btnigualA.addActionListener(this);
		gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnigualA)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblRadio, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(RadioArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRadio)
						.addComponent(RadioArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnigualA)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		lblArea = new JLabel("Area");
		lblArea.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		label = new JLabel("Formula : \u03C0 * radio\u00B2");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(84)
							.addComponent(lblArea))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(47)
							.addComponent(label)))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblArea)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object o = ae.getSource();
		String mensaje = "";
		Double r=Math.PI;
		int Radio = 0;
		if(o.equals(btnigualA)) {
			String Radio1=RadioArea.getText();
			Radio = Integer.parseInt(Radio1);
			Radio=(Radio*Radio);
			r=r*Radio;
			mensaje="Resultado = " + r;
			lblresultado.setText(mensaje);	
		}
		
		else if(o.equals(btnigualP)) {
			String Radio1=RadioPerimetro.getText();
			Radio = Integer.parseInt(Radio1);
			r=r*2*(Radio);
			mensaje="Resultado = " + r;
			lblresultado.setText(mensaje);	
		}
		else if(o.equals(btnSalir)) 
		{
			Modulo_Menu vm = new Modulo_Menu();
			//la hago visible
				vm.setTitle("bienvenido");
				vm.setVisible(true);
			//oculto la ventan de inicio 
				this.setVisible(false);
			//borro de memoria la ventan de inicio 
				this.dispose();
			}
		

	}
}
