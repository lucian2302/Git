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

public class VentanaleerenteroBoton2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JTextField TxtNUM;
	private JLabel lblHolaMundo;
	private JPanel paneldatos;
	private JLabel lblNumero;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaleerenteroBoton2 frame = new VentanaleerenteroBoton2();
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
	public VentanaleerenteroBoton2() {
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
		
		lblNumero = new JLabel("Numero:");
		lblNumero.setForeground(Color.WHITE);
		paneldatos.add(lblNumero);
		
		TxtNUM = new JTextField();
		TxtNUM.setHorizontalAlignment(SwingConstants.RIGHT);
		TxtNUM.setText("7");
		paneldatos.add(TxtNUM);
		TxtNUM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// accciones a realizar al pulsar el botón
			String Mensaje;
			Mensaje ="el numero introduciodo es el "+TxtNUM.getText();
			lblHolaMundo.setText(Mensaje);
			}}
			);
		paneldatos.add(TxtNUM);
		TxtNUM.setColumns(10);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Mensaje;
				Mensaje ="el numero introduciodo es el "+TxtNUM.getText();
				lblHolaMundo.setText(Mensaje);
			}
		});
		paneldatos.add(btnOk);
	}

}
