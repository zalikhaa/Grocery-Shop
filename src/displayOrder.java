// total semua item dari category berbeza
// dalam bentuk jtable

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

public class displayOrder extends JFrame {
	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField bil;
	private JTextField item;
	private JTextField quantity;
	private JTextField price;
	DefaultTableModel model;
	private JTable tbl_details;
	private JTextField txt_total;
	private JButton btn_remove;
	private double totalpricesemua = 0;
	private JButton btn_back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayOrder frame = new displayOrder();
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
	public displayOrder() {
		
		setTitle("GOGROCER");
		setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 628);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new LineBorder(new Color(255, 192, 203)));
		setContentPane(contentPane);
		
		JLabel lbl_details = new JLabel("ORDER DETAILS");
		lbl_details.setBounds(22, 35, 141, 41);
		lbl_details.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		contentPane.add(lbl_details);
		
		Object[] column = {"Bil", "Item", "Quantity", "Price"};
		
		String data[][]=new String [Controller.productList.size()][]; {
			for(int i=0;i<Controller.productList.size();i++) {
				Product p = Controller.productList.get(i);
				
				data[i]= new String[] {
						Integer.toString(i+1),
					    p.getName(),
					    Integer.toString(p.getQuantity()),
					     String.format("RM %.2f", p.calculateTotalPrice()),
				};
			}
		};
		
		JLabel lbl_total = new JLabel("TOTAL:");
		lbl_total.setBounds(52, 387, 85, 31);
		lbl_total.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		contentPane.add(lbl_total);
		
		txt_total = new JTextField();
		txt_total.setBackground(new Color(255, 228, 225));
		txt_total.setBounds(104, 387, 96, 23);
		txt_total.setFont(new Font("Myriad Pro", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(txt_total);
		txt_total.setColumns(10);
	
		for(Product p : Controller.productList)
		{
			totalpricesemua+=p.calculateTotalPrice();
		}
		txt_total.setText(String.format("RM %.2f" ,totalpricesemua));
		
		btn_remove = new JButton("REMOVE");
		btn_remove.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		btn_remove.setBounds(303, 423, 110, 30);
		btn_remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int table=tbl_details.getSelectedRow();
				if(table>=0)
				{
					int row=tbl_details.getSelectedRow();
					
					String productname = tbl_details.getModel().getValueAt(row, 1).toString();
					
					if(Controller.removeProduct(productname))
					JOptionPane.showMessageDialog(null, "Successfully Remove Item");
					
					
					String data[][]=new String [Controller.productList.size()][]; {
						for(int i=0;i<Controller.productList.size();i++) {
							Product p = Controller.productList.get(i);
							
							data[i]= new String[] {
									Integer.toString(i+1),
								    p.getName(),
								    Integer.toString(p.getQuantity()),
								     String.format("RM %.2f", p.calculateTotalPrice()),
							};
						}
					};
					
					totalpricesemua=0;
					tbl_details.setModel(new DefaultTableModel(data,column));
					for(Product p : Controller.productList)
					{
						totalpricesemua+=p.calculateTotalPrice();
					}
					txt_total.setText(String.format("RM %.2f" ,totalpricesemua));
				}
			else
			{
				JOptionPane.showMessageDialog(null, "Please select an item first");
			}
			}
		});
		contentPane.add(btn_remove);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(255, 192, 203)));
		scrollPane.setToolTipText("");
		scrollPane.setBounds(32, 86, 400, 284);
		contentPane.add(scrollPane);
		tbl_details = new JTable();
		scrollPane.setViewportView(tbl_details);
	
		
		tbl_details.setModel(new DefaultTableModel(
			data,
		column 
		));
		
		btn_back = new JButton("BACK");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Category frame = new Category();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_back.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		btn_back.setBounds(303, 388, 110, 30);
		contentPane.add(btn_back);
		
		JLabel lbl_payment = new JLabel("PAYMENT METHOD :");
		lbl_payment.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		lbl_payment.setBounds(52, 443, 131, 23);
		contentPane.add(lbl_payment);
		
		String [] pay = {"Cash-on-Delivery", "Online Banking"};
		JComboBox comboBox = new JComboBox(pay);
		comboBox.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		comboBox.setBounds(52, 475, 176, 27);
		contentPane.add(comboBox);
		tbl_details.getColumnModel().getColumn(0).setPreferredWidth(38);
		
		JButton btn_checkout = new JButton("CHECK OUT");
		btn_checkout.setBounds(303, 458, 110, 30);
		btn_checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int table = tbl_details.getRowCount();
				if (table>=1)
				{					
					if((boolean) comboBox.getSelectedItem().equals("Cash-on-Delivery")) {
						
						JOptionPane.showMessageDialog( null, "Your items will be delivered right away.", "Customized Dialog",JOptionPane.INFORMATION_MESSAGE);
						status frame = new status();
						frame.setVisible(true);
						dispose();
					}
					else {
						System.out.println("Please proceed to the next page.");
						online frame = new online();
						frame.setVisible(true);
						dispose();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "No item on cart");
					
				}
			}
		});
		
		contentPane.setLayout(null);
		btn_checkout.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		contentPane.add(btn_checkout);
	}
}
