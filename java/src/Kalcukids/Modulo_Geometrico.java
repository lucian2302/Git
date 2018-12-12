package Kalcukids;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Modulo_Geometrico extends JFrame implements ActionListener {
public JButton btnCuadrado;
public JButton btnTriangulo;
public JButton btnCirculo;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modulo_Geometrico frame = new Modulo_Geometrico();
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
	public Modulo_Geometrico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnCuadrado = new JButton("Cuadreado");
		btnCuadrado.setBackground(new Color(255, 250, 205));
		btnCuadrado.addActionListener(this); 
			
		btnCuadrado.setIcon(null);
		
		btnTriangulo = new JButton("Triangulo");
		btnTriangulo.addActionListener(this);
		btnTriangulo.setBackground(new Color(255, 250, 205));
		
		btnCirculo = new JButton("Circulo");
		btnCirculo.addActionListener(this);
		btnCirculo.setBackground(new Color(255, 250, 205));
		
		btnSalir = new JButton("Atras");
		btnSalir.addActionListener(this);
		

		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnCuadrado, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addGap(56)
							.addComponent(btnTriangulo, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(124)
							.addComponent(btnCirculo, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
							.addComponent(btnSalir)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnTriangulo, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCuadrado, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnCirculo, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addComponent(btnSalir)))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
Object o = e.getSource();

		
		if (o.equals(btnCuadrado)){
			ventana_area_perimetro_cuadrado vapc = new ventana_area_perimetro_cuadrado();
		//la hago visible
			vapc.setTitle("cuadrado");
			vapc.setVisible(true);
		//oculto la ventan de inicio 
			this.setVisible(false);
		//borro de memoria la ventan de inicio 
			this.dispose();
			}
		
		else if (o.equals(btnCirculo)){
			ventana_area_perimetro_circulo vapci = new ventana_area_perimetro_circulo();
		//la hago visible
			vapci.setTitle("circulo");
			vapci.setVisible(true);
		//oculto la ventan de inicio 
			this.setVisible(false);
		//borro de memoria la ventan de inicio 
			this.dispose();
			}
		
		else if (o.equals(btnTriangulo)){
			ventana_area_perimetro_triangulo vapt = new ventana_area_perimetro_triangulo();
		//la hago visible
			vapt.setTitle("Triangulo");
			vapt.setVisible(true);
		//oculto la ventan de inicio 
			this.setVisible(false);
		//borro de memoria la ventan de inicio 
			this.dispose();
			}
		else
			{
			Modulo_Menu vm = new Modulo_Menu();
			vm.setTitle("Bienvenido");
			vm.setVisible(true);
			this.setVisible(false);
			this.dispose();
			}
		
	}
}
