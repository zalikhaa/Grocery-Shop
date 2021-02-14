import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vendor extends JFrame {

	private JFrame frame;
	private JTable table;
	private JTextField id;
	private JTextField name;
	private JTextField type;
	private JTextField price;
	private JTextField quantity;
	private JTextField info;
	private JButton btnInsert;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnClear;
	DefaultTableModel model;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendor window = new Vendor();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Vendor() {
		setTitle("GOGROCER");
		setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		
		frame = new JFrame();
		setBackground(new Color(255, 228, 225));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 691);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProductId = new JLabel("Product ID:");
		lblProductId.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		lblProductId.setBounds(46, 27, 90, 31);
		getContentPane().add(lblProductId);
		
		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		lblProductName.setBounds(20, 65, 116, 31);
		getContentPane().add(lblProductName);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		lblType.setBounds(96, 107, 51, 31);
		getContentPane().add(lblType);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		lblPrice.setBounds(388, 27, 51, 31);
		getContentPane().add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		lblQuantity.setBounds(364, 65, 62, 31);
		getContentPane().add(lblQuantity);
		
		JLabel lblInformation = new JLabel("Information:");
		lblInformation.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		lblInformation.setBounds(331, 107, 90, 31);
		getContentPane().add(lblInformation);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 228, 785, 375);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		JTableHeader header = table.getTableHeader();
	      header.setBackground(Color.WHITE);
	    //  header.setForeground(Color.yellow);
	      
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				id.setText(model.getValueAt(i, 0).toString());
				name.setText(model.getValueAt(i, 1).toString());
				type.setText(model.getValueAt(i, 2).toString());
				price.setText(model.getValueAt(i, 3).toString());
				quantity.setText(model.getValueAt(i, 4).toString());
				info.setText(model.getValueAt(i, 5).toString());
			}
		});
		model=new DefaultTableModel();
		Object[] column = {"ID", "Name", "Type", "Price","Quantity", "Information"};
		final Object[] row = new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id.getText().equals("") || name.getText().equals("") || type.getText().equals("") || price.getText().equals("") || quantity.getText().equals("") || info.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,  "Please Complete The Form");
				}
				else
				{
					row[0]=id.getText();
					row[1]=name.getText();
					row[2]=type.getText();
					row[3]=price.getText();
					row[4]=quantity.getText();
					row[5]=info.getText();
					model.addRow(row);
					
					id.setText("");
					name.setText("");
					type.setText("");
					price.setText("");
					quantity.setText("");
					info.setText("");
					JOptionPane.showMessageDialog(null, "Inserted Successfully");
					
				}
			}
		});
		btnInsert.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		btnInsert.setBounds(83, 164, 120, 45);
		getContentPane().add(btnInsert);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0)
				{
					model.setValueAt(id.getText(), i, 0);
					model.setValueAt(name.getText(), i, 1);
					model.setValueAt(type.getText(), i, 2);
					model.setValueAt(price.getText(), i, 3);
					model.setValueAt(quantity.getText(), i, 4);
					model.setValueAt(info.getText(), i, 5);
					JOptionPane.showMessageDialog(null, "Updated Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please Select a Row First");
				}
				
			}
		});
		btnUpdate.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		btnUpdate.setBounds(239, 164, 120, 45);
		getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Deleted Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please Select a Row First");
				}
			}
		});
		btnDelete.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		btnDelete.setBounds(397, 164, 120, 45);
		getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				name.setText("");
				type.setText("");
				price.setText("");
				quantity.setText("");
				info.setText("");
			}
		});
		btnClear.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		btnClear.setBounds(553, 164, 120, 45);
		getContentPane().add(btnClear);
		
		id = new JTextField();
		id.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		id.setBounds(152, 27, 103, 31);
		getContentPane().add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		name.setColumns(10);
		name.setBounds(152, 65, 103, 31);
		getContentPane().add(name);
		
		type = new JTextField();
		type.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		type.setColumns(10);
		type.setBounds(152, 107, 103, 31);
		getContentPane().add(type);
		
		price = new JTextField();
		price.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		price.setColumns(10);
		price.setBounds(454, 29, 103, 31);
		getContentPane().add(price);
		
		quantity = new JTextField();
		quantity.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		quantity.setColumns(10);
		quantity.setBounds(454, 67, 103, 31);
		getContentPane().add(quantity);
		
		info = new JTextField();
		info.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		info.setColumns(10);
		info.setBounds(454, 109, 315, 31);
		getContentPane().add(info);
		
		JButton button = new JButton("LOG OUT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						Login frame = new Login();
						frame.setVisible(true);
						dispose();
			}
		});
		button.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		button.setBounds(717, 613, 103, 27);
		contentPane.add(button);
	}
}

