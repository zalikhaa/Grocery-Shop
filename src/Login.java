import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField Username = new JTextField ("Username:");
	private JTextField Password = new JTextField ("Password:  ");
	private JPasswordField txtPass;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setBackground(new Color(255, 228, 225));
		
		setTitle("GOGROCER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 367);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to GoGrocer");
		lblNewLabel.setFont(new Font("Myriad Pro", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(144, 33, 300, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblUser = new JLabel("USERNAME:");
		lblUser.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblUser.setBounds(144, 129, 93, 16);
		contentPane.add(lblUser);
		
		JLabel lblPass = new JLabel("PASSWORD:");
		lblPass.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		lblPass.setBounds(144, 180, 93, 16);
		contentPane.add(lblPass);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txtUser.setBounds(236, 123, 130, 26);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
	
		
		JCheckBox chckbxUser = new JCheckBox("show password");
		chckbxUser.setBackground(new Color(255, 228, 225));
		chckbxUser.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		chckbxUser.setBounds(261, 206, 105, 23);
		contentPane.add(chckbxUser);
		chckbxUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==chckbxUser){
				if(chckbxUser.isSelected()){
					(txtPass).setEchoChar((char)0);
				}
				else{
					txtPass.setEchoChar('*');
				}
			}
			}	
		});
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		txtPass.setBounds(236, 174, 130, 26);
		contentPane.add(txtPass);
		
		JButton btn_register = new JButton("REGISTER");
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register frame = new Register();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btn_register.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		btn_register.setBackground(Color.WHITE);
		btn_register.setBounds(144, 278, 116, 29);
		contentPane.add(btn_register);
		
			String [] opt = {"CUSTOMER", "VENDOR"};
			JComboBox comboBox = new JComboBox(opt);
			comboBox.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
			comboBox.setBounds(203, 84, 130, 27);
			contentPane.add(comboBox);
			
			JButton btnLogin = new JButton("LOG IN");
			btnLogin.setBackground(Color.WHITE);
			btnLogin.setBounds(268, 276, 105, 29);
			
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (txtUser.getText().equals("") || txtPass.getText().equals("") )
					{
						JOptionPane.showMessageDialog(null,  "Please enter the correct username and password.");
					}
					else {
					
						if((boolean) comboBox.getSelectedItem().equals("CUSTOMER")) {
							Category frame = new Category();
							frame.setVisible(true);
							dispose();
						}
						else if((boolean) comboBox.getSelectedItem().equals("VENDOR")){
							Vendor frame = new Vendor();
							frame.setVisible(true);
							dispose();
						}
					}
				}
			});
			
			contentPane.setLayout(null);
			btnLogin.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
			contentPane.add(btnLogin);

			
			JDesktopPane desktopPane = new JDesktopPane();
			desktopPane.setBackground(new Color(255, 228, 225));
			desktopPane.setBounds(10, 317, 484, -304);
			contentPane.add(desktopPane);
			ImageIcon icon = new ImageIcon("products/shopping-cart.png");
			
			JLabel lbl_img = new JLabel("");
			lbl_img.setBounds(120, 10, 384, 259);
			contentPane.add(lbl_img);
			lbl_img.setIcon(new ImageIcon("products/shopping-cart.png"));
			JLabel img = new JLabel(icon);
			lbl_img.add(img);
		
	}
}
