import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Snacks extends JFrame {
	private JPanel pane;
	static JSpinner spinner;
	static double qty, price, total, sum;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Snacks frame = new Snacks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Snacks() {
		setTitle("GOGROCER ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 531);
		JPanel pane = new JPanel();
		pane.setBackground(new Color(255, 228, 225));
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);
				
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.PINK);
		desktopPane.setBounds(295, 182, 94, -97);
		pane.add(desktopPane);
		
		
		JLabel lblProducts = new JLabel("Products > Snacks");
		lblProducts.setFont(new Font("Myriad Pro", Font.BOLD | Font.ITALIC, 30));
		lblProducts.setBounds(32, 31, 280, 54);
		pane.add(lblProducts);
		
		// PANEL FOR TOBLERONE
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 192, 203)));
		panel.setBackground(new Color(255, 228, 225));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(32, 105, 193, 120);
		pane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lbl_img = new JLabel("");
		panel.add(lbl_img);	
		lbl_img.setBounds(23, 10, 83, 85);
		lbl_img.setIcon(new ImageIcon("products/11.png"));
		ImageIcon icon = new ImageIcon("products/11.png");
		JLabel img = new JLabel(icon);
		lbl_img.add(img);
					
		JLabel lbl_prod = new JLabel("Toblerone");
		lbl_prod.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_prod.setBounds(111, 21, 72, 25);
		panel.add(lbl_prod);
					
		JLabel lbl_price = new JLabel("RM 3.20");
		lbl_price.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_price.setBounds(111, 42, 63, 19);
		panel.add(lbl_price);
					
		JSpinner spin_qt = new JSpinner();
		spin_qt.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spin_qt.setBackground(new Color(250, 240, 230));
		spin_qt.setBounds(111, 60, 39, 25);
		panel.add(spin_qt);
		
					
		JButton btnAddToblerone = new JButton("Add to Cart");
		btnAddToblerone.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		btnAddToblerone.setBounds(88, 90, 95, 21);
		panel.add(btnAddToblerone);
		btnAddToblerone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = new Double(price);
				price = 3.20;
				String name = "Toblerone";
				
			
				int value=(Integer) spin_qt.getValue();
				if(e.getSource()==spin_qt){
				if(spin_qt.getValue() != null){
					
				try {
					spinner.commitEdit();
					
				} catch (java.text.ParseException e1) {
					
				}
				//int value=(Integer) spinner.getValue();
					}
				}
				System.out.println("Quantity: " + value);
				total = price * value;
				String total = String.format("%.2f", price * value);
				System.out.println("Total: RM " + total );
				
			
				Controller.addProduct(name,price,value);

			}			
		
		});
	
		// PANEL FOR CADBURRY
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(255, 192, 203)));
		panel1.setBackground(new Color(255, 228, 225));
		panel1.setBounds(32, 235, 193, 120);
		pane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lbl_img1 = new JLabel("");
		lbl_img1.setBounds(10, 10, 83, 85);
		panel1.add(lbl_img1);
		lbl_img1.setIcon(new ImageIcon("products/12.png"));
		ImageIcon icon1 = new ImageIcon("products/12.png");
		JLabel img1 = new JLabel(icon1);
		lbl_img.add(img1);
		
		JLabel lbl_prod1 = new JLabel("Cadburry");
		lbl_prod1.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_prod1.setBounds(111, 21, 72, 25);
		panel1.add(lbl_prod1);
		
		JLabel lbl_price1 = new JLabel("RM 2.80");
		lbl_price1.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_price1.setBounds(111, 42, 63, 19);
		panel1.add(lbl_price1);
		
		JSpinner spin_qt1 = new JSpinner();
		spin_qt1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spin_qt1.setBackground(new Color(250, 240, 230));
		spin_qt1.setBounds(111, 60, 39, 25);
		panel1.add(spin_qt1);
		
		JButton btnAddCadburry = new JButton("Add to Cart");
		btnAddCadburry.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		btnAddCadburry.setBounds(88, 90, 95, 21);
		panel1.add(btnAddCadburry);
		btnAddCadburry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = new Double(price);
				price = 2.80;
				String name = "Cadburry";
				
			
				int value=(Integer) spin_qt1.getValue();
				if(e.getSource()==spin_qt1){
				if(spin_qt1.getValue() != null){
					
				try {
					spinner.commitEdit();
					
				} catch (java.text.ParseException e1) {
					
				}
				//int value=(Integer) spinner.getValue();
					}
				}
				System.out.println("Quantity: " + value);
				total = price * value;
				String total = String.format("%.2f", price * value);
				System.out.println("Total: RM " + total );
				
			
				Controller.addProduct(name,price,value);
			}				
		
		});
		
		// PANEL FOR MARS
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 228, 225));
		panel2.setBorder(new LineBorder(new Color(255, 192, 203)));
		panel2.setLayout(null);
		panel2.setBounds(32, 365, 193, 120);
		pane.add(panel2);
		
		JLabel lbl_img2 = new JLabel("");
		lbl_img2.setBounds(10, 10, 83, 85);
		panel2.add(lbl_img2);
		lbl_img2.setIcon(new ImageIcon("products/13.png"));
		ImageIcon icon2 = new ImageIcon("products/13.png");
		JLabel img2 = new JLabel(icon2);
		lbl_img2.add(img2);
		
		JLabel lbl_prod2 = new JLabel("Mars");
		lbl_prod2.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_prod2.setBounds(111, 21, 39, 25);
		panel2.add(lbl_prod2);
		
		JLabel lbl_price2 = new JLabel("RM 2.50");
		lbl_price2.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_price2.setBounds(111, 42, 63, 19);
		panel2.add(lbl_price2);
		
		JSpinner spn_qt2 = new JSpinner();
		spn_qt2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spn_qt2.setBackground(new Color(250, 240, 230));
		spn_qt2.setBounds(111, 60, 39, 25);
		panel2.add(spn_qt2);
		
		JButton btnAddMars = new JButton("Add to Cart");
		btnAddMars.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		btnAddMars.setBounds(88, 90, 95, 21);
		panel2.add(btnAddMars);
		btnAddMars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = new Double(price);
				price = 2.50;
				String name = "Mars";
				
			
				int value=(Integer) spn_qt2.getValue();
				if(e.getSource()==spn_qt2){
				if(spn_qt2.getValue() != null){
					
				try {
					spinner.commitEdit();
					
				} catch (java.text.ParseException e1) {
					
				}
				//int value=(Integer) spinner.getValue();
					}
				}
				System.out.println("Quantity: " + value);
				total = price * value;
				String total = String.format("%.2f", price * value);
				System.out.println("Total: RM " + total );
				
			
				Controller.addProduct(name,price,value);
			}			
		
		});
		
		
		// PANEL FOR M&M
		JPanel panel3 = new JPanel();
		panel3.setBorder(new LineBorder(new Color(255, 192, 203)));
		panel3.setBackground(new Color(255, 228, 225));
		panel3.setLayout(null);
		panel3.setForeground(Color.BLACK);
		panel3.setBounds(274, 105, 193, 120);
		pane.add(panel3);
		
		JLabel lbl_img3 = new JLabel("");
		lbl_img3.setBounds(10, 10, 83, 85);
		panel3.add(lbl_img3);
		lbl_img3.setIcon(new ImageIcon("products/14.png"));
		ImageIcon icon3 = new ImageIcon("products/14.png");
		JLabel img3 = new JLabel(icon3);
		lbl_img.add(img3);
		
		
		JLabel lbl_prod3 = new JLabel("\r\n\r\nM&Ms");
		lbl_prod3.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_prod3.setBounds(111, 10, 51, 36);
		panel3.add(lbl_prod3);
		
		JLabel lbl_price3 = new JLabel("RM 2.80");
		lbl_price3.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_price3.setBounds(111, 42, 63, 19);
		panel3.add(lbl_price3);
		
		JSpinner spn_qt3 = new JSpinner();
		spn_qt3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spn_qt3.setBackground(new Color(250, 240, 230));
		spn_qt3.setBounds(111, 60, 39, 25);
		panel3.add(spn_qt3);
		
		JButton btnAddMM = new JButton("Add to Cart");
		btnAddMM.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		btnAddMM.setBounds(88, 90, 95, 21);
		panel3.add(btnAddMM);
		btnAddMM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = new Double(price);
				price = 2.80;
				String name = "M&Ms";
				
			
				int value=(Integer) spn_qt3.getValue();
				if(e.getSource()==spn_qt3){
				if(spn_qt3.getValue() != null){
					
				try {
					spinner.commitEdit();
					
				} catch (java.text.ParseException e1) {
					
				}
				//int value=(Integer) spinner.getValue();
					}
				}
				System.out.println("Quantity: " + value);
				total = price * value;
				String total = String.format("%.2f", price * value);
				System.out.println("Total: RM " + total );
				
			
				Controller.addProduct(name,price,value);
			}			
		
		});
		
		
		//PANEL FOR KITKAT
		JPanel panel4 = new JPanel();
		panel4.setBorder(new LineBorder(new Color(255, 192, 203)));
		panel4.setBackground(new Color(255, 228, 225));
		panel4.setLayout(null);
		panel4.setForeground(Color.BLACK);
		panel4.setBounds(274, 235, 193, 120);
		pane.add(panel4);
		
		JLabel lbl_img4 = new JLabel("");
		lbl_img4.setBounds(10, 10, 83, 85);
		panel4.add(lbl_img4);
		lbl_img4.setIcon(new ImageIcon("products/15.png"));
		ImageIcon icon4 = new ImageIcon("products/15.png");
		JLabel img4 = new JLabel(icon4);
		lbl_img.add(img4);
		
		JLabel lbl_prod4 = new JLabel("\r\n\r\nKitKat");
		lbl_prod4.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_prod4.setBounds(111, 10, 51, 36);
		panel4.add(lbl_prod4);
		
		JLabel lbl_price4 = new JLabel("RM 2.20");
		lbl_price4.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_price4.setBounds(111, 42, 63, 19);
		panel4.add(lbl_price4);
		
		JSpinner spn_qt4 = new JSpinner();
		spn_qt4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spn_qt4.setBackground(new Color(250, 240, 230));
		spn_qt4.setBounds(111, 60, 39, 25);
		panel4.add(spn_qt4);
		
		JButton btnAddKitkat = new JButton("Add to Cart");
		btnAddKitkat.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		btnAddKitkat.setBounds(88, 90, 95, 21);
		panel4.add(btnAddKitkat);
		btnAddKitkat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = new Double(price);
				price = 2.20;
				String name = "KitKat";
				
			
				int value=(Integer) spn_qt4.getValue();
				if(e.getSource()==spn_qt4){
				if(spn_qt4.getValue() != null){
					
				try {
					spinner.commitEdit();
					
				} catch (java.text.ParseException e1) {
					
				}
				//int value=(Integer) spinner.getValue();
					}
				}
				System.out.println("Quantity: " + value);
				total = price * value;
				String total = String.format("%.2f", price * value);
				System.out.println("Total: RM " + total );
				
			
				Controller.addProduct(name,price,value);
			}			
		
		});
		
		
		
		// PANEL FOR KINDER BUENO
		JPanel panel5 = new JPanel();
		panel5.setBorder(new LineBorder(new Color(255, 192, 203)));
		panel5.setBackground(new Color(255, 228, 225));
		panel5.setLayout(null);
		panel5.setForeground(Color.BLACK);
		panel5.setBounds(274, 365, 193, 120);
		pane.add(panel5);
		
		JLabel lbl_img5 = new JLabel("");
		lbl_img5.setBounds(10, 10, 83, 85);
		panel5.add(lbl_img5);
		lbl_img5.setIcon(new ImageIcon("products/16.png"));
		ImageIcon icon5 = new ImageIcon("products/16.png");
		JLabel img5 = new JLabel(icon5);
		lbl_img.add(img5);
		
		JLabel lbl_prod5 = new JLabel("\r\n\r\nKinder Bueno");
		lbl_prod5.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_prod5.setBounds(88, 10, 95, 36);
		panel5.add(lbl_prod5);
		
		JLabel lbl_price5 = new JLabel("RM 3.20");
		lbl_price5.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lbl_price5.setBounds(111, 42, 63, 19);
		panel5.add(lbl_price5);
		
		JSpinner spn_qt5 = new JSpinner();
		spn_qt5.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spn_qt5.setBackground(new Color(250, 240, 230));
		spn_qt5.setBounds(111, 60, 39, 25);
		panel5.add(spn_qt5);
		
		JButton btnAddBueno = new JButton("Add to Cart");
		btnAddBueno.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		btnAddBueno.setBounds(88, 90, 95, 21);
		panel5.add(btnAddBueno);
		btnAddBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = new Double(price);
				price = 3.20;
				String name = "Kinder Bueno";
				
			
				int value=(Integer) spn_qt5.getValue();
				if(e.getSource()==spn_qt5){
				if(spn_qt5.getValue() != null){
					
				try {
					spinner.commitEdit();
					
				} catch (java.text.ParseException e1) {
					
				}
				//int value=(Integer) spinner.getValue();
					}
				}
				System.out.println("Quantity: " + value);
				total = price * value;
				String total = String.format("%.2f", price * value);
				System.out.println("Total: RM " + total );
				
			
				Controller.addProduct(name,price,value);
			}			
		
		});
		
		JButton btn_ok = new JButton("CONFIRM");
		btn_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				displayOrder frame = new displayOrder();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_ok.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		btn_ok.setBounds(533, 455, 100, 30);
		pane.add(btn_ok);
		
		JButton btn_back = new JButton("BACK");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Category frame = new Category();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_back.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		btn_back.setBounds(533, 415, 100, 30);
		pane.add(btn_back);
	}
}

