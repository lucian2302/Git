package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ss extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ss frame = new ss();
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
	public ss() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblIntroduceUnNumero = new JLabel("Introduce un numero.");
		panel.add(lblIntroduceUnNumero);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton button = new JButton("7");
		panel_2.add(button);
		
		JButton button_1 = new JButton("8");
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("9");
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("4");
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("5");
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("6");
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("1");
		panel_2.add(button_6);
		
		JButton button_7 = new JButton("2");
		panel_2.add(button_7);
		
		JButton button_8 = new JButton("3");
		panel_2.add(button_8);
		
		JButton btnNewButton = new JButton("(");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_2.add(btnNewButton);
		
		JButton button_9 = new JButton("0");
		panel_2.add(button_9);
		
		JButton button_10 = new JButton(")");
		panel_2.add(button_10);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 2, 0, 0));
		
		JButton btnNewButton_1 = new JButton("CE");
		panel_3.add(btnNewButton_1);
		
		JButton btnC = new JButton("c");
		panel_3.add(btnC);
		
		JButton button_12 = new JButton("+");
		panel_3.add(button_12);
		
		JButton btnNewButton_2 = new JButton("-");
		panel_3.add(btnNewButton_2);
		
		JButton button_11 = new JButton("*");
		panel_3.add(button_11);
		
		JButton button_13 = new JButton("/");
		panel_3.add(button_13);
		
		JButton button_15 = new JButton("=");
		panel_3.add(button_15);
		
		JButton button_14 = new JButton("\u03C0");
		button_14.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(button_14);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnSuperficie = new JButton("Superficie");
		btnSuperficie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnSuperficie);
		
		JButton btnrea = new JButton("\u00C4rea");
		panel_4.add(btnrea);
		
		JButton btnBinario = new JButton("Binario");
		panel_4.add(btnBinario);
	}

}
