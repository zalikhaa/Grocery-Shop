import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class status extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					status frame = new status();
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
	public status() {
		setBackground(new Color(255, 228, 225));
		
		setTitle("GOGROCER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 228, 225));
		desktopPane.setBounds(295, 182, 94, -97);
		contentPane.add(desktopPane);
		
		
		JLabel lblNewLabel = new JLabel("");
		desktopPane.add(lblNewLabel);
		lblNewLabel.setBounds(147, 18, 225, 162);
		lblNewLabel.setIcon(new ImageIcon("products/download.png"));
		ImageIcon icon = new ImageIcon("products/download.png");
		JLabel img = new JLabel(icon);
		lblNewLabel.add(img);

		JLabel lblNewLabel_1 = new JLabel("Your order is on its way! :)");
		lblNewLabel_1.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(172, 237, 200, 16);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DELIVERING . . . . ");
		lblNewLabel_2.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(213, 198, 135, 16);
		desktopPane.add(lblNewLabel_2);
		
		JButton btn_home = new JButton("HOME");
		btn_home.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		btn_home.setBounds(200, 284, 117, 29);
		desktopPane.add(btn_home);
		btn_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Category frame = new Category();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
	}

}
