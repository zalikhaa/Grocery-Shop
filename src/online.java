import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class online extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txt_card;
	private JTextField txt_cvv;
	private JTextField txt_date;
	private JTextField txt_name;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					online window = new online();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public online() {
		setBackground(new Color(255, 228, 225));
		
		
		frame = new JFrame();
		setTitle("GOGROCER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 288);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lbl_card = new JLabel("Card Payment:");
		lbl_card.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lbl_card.setBounds(264, 36, 102, 16);
		getContentPane().add(lbl_card);
		
		JLabel lbl_cvv = new JLabel("CVV:");
		lbl_cvv.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lbl_cvv.setBounds(37, 115, 75, 16);
		getContentPane().add(lbl_cvv);
		
		JLabel lbl_date = new JLabel("Expiration Date:");
		lbl_date.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lbl_date.setBounds(264, 115, 138, 16);
		getContentPane().add(lbl_date);
		
		txt_card = new JTextField();
		txt_card.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txt_card.setBounds(264, 64, 170, 26);
		getContentPane().add(txt_card);
		txt_card.setColumns(10);
		
		txt_cvv = new JTextField();
		txt_cvv.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txt_cvv.setBounds(37, 141, 170, 26);
		getContentPane().add(txt_cvv);
		txt_cvv.setColumns(10);
		
		txt_date = new JTextField();
		txt_date.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txt_date.setBounds(264, 141, 130, 26);
		getContentPane().add(txt_date);
		txt_date.setColumns(10);
		
		JLabel lbl_name = new JLabel("Card Holder's Name:");
		lbl_name.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lbl_name.setBounds(37, 36, 157, 16);
		getContentPane().add(lbl_name);
		
		txt_name = new JTextField();
		txt_name.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txt_name.setBounds(37, 64, 170, 26);
		getContentPane().add(txt_name);
		txt_name.setColumns(10);

		
		JButton btnNewButton = new JButton("PAY");
		btnNewButton.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		btnNewButton.setBounds(170, 201, 117, 29);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				status frame = null;
				frame = new status();
				frame.setVisible(true);
				dispose();
				
			}
		});
		

}
}
