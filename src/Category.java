import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Category extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Category frame = new Category();
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
	public Category() {
		setTitle("GOGROCER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCTS");
		lblNewLabel.setFont(new Font("Myriad Pro", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel.setBounds(216, 62, 170, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BEVERAGES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Beverages frame = new Beverages();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 20));
		btnNewButton.setBounds(227, 135, 134, 40);
		contentPane.add(btnNewButton);
		
		JButton btnSnacks = new JButton("SNACKS");
		btnSnacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Snacks frame = new Snacks();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSnacks.setFont(new Font("Myriad Pro", Font.PLAIN, 20));
		btnSnacks.setBounds(227, 195, 134, 40);
		contentPane.add(btnSnacks);
		
		JButton btnFrozenFood = new JButton("FROZEN FOOD");
		btnFrozenFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrozenFood frame = new FrozenFood();
				frame.setVisible(true);
				dispose();
			}
		});
		btnFrozenFood.setFont(new Font("Myriad Pro", Font.PLAIN, 20));
		btnFrozenFood.setBounds(216, 255, 170, 40);
		contentPane.add(btnFrozenFood);
		
		JButton btn_out = new JButton("LOG OUT");
		btn_out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_out.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		btn_out.setBounds(518, 346, 103, 27);
		contentPane.add(btn_out);
		
		JButton btnCart = new JButton("CART");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayOrder frame = new displayOrder();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCart.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		btnCart.setBounds(518, 311, 103, 27);
		contentPane.add(btnCart);
	}
}
