import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textField;
	private JTextField txtNum;
	private JTextField txtAdress;
	private JTextField textField_1;
	private JTextField txt_pass;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Register() {
		
		setTitle("GOGROCER");
		setBackground(new Color(255, 228, 225));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblName.setBounds(24, 28, 61, 16);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txtName.setBounds(127, 23, 189, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblEmail.setBounds(24, 142, 61, 16);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		textField.setBounds(127, 137, 189, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNum = new JLabel("Phone Number:");
		lblNum.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblNum.setBounds(24, 187, 96, 16);
		contentPane.add(lblNum);
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txtNum.setBounds(127, 182, 130, 26);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblAddress.setBounds(24, 232, 61, 16);
		contentPane.add(lblAddress);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txtAdress.setBounds(127, 227, 189, 62);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
		
		String[] pay = {"CUSTOMER", "VENDOR"};
		JComboBox comboBox = new JComboBox(pay);
		comboBox.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		//this.add(comboBox);
		//this.pack();
		//this.setVisible(true);
		comboBox.setBounds(127, 317, 130, 27);
		contentPane.add(comboBox);
		
		JButton btnNext = new JButton("REGISTER");
		btnNext.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		btnNext.setBounds(360, 316, 117, 29);
		contentPane.add(btnNext);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblUsername.setBounds(24, 70, 61, 16);
		contentPane.add(lblUsername);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(127, 59, 149, 26);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblPassword.setBounds(24, 110, 61, 16);
		contentPane.add(lblPassword);
		
		txt_pass = new JTextField();
		txt_pass.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txt_pass.setColumns(10);
		txt_pass.setBounds(127, 101, 149, 26);
		contentPane.add(txt_pass);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtName.getText().equals("") || textField.getText().equals("") || txtNum.getText().equals("") || txtAdress.getText().equals("")||textField_1.getText().equals("") || txt_pass.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,  "Please Complete The Form");
				}
				else {
					JOptionPane.showMessageDialog(null,  "You have successfully registered!");
					Login frame = new Login();
					frame.setVisible(true);
					dispose();
				}
				
			}
		});
		
	}
}
