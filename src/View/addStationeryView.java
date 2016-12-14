package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import model.modifyStationery;

import javax.swing.JTextArea;
import java.awt.Color;

public class addStationeryView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JTextArea textArea;
	public String name;
	public String id;
	public String price;
	public String number;
	public String sid;
	public String sname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addStationeryView frame = new addStationeryView();
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
	public addStationeryView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600,450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(166, 74, 143, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddCloth = new JLabel("Add  Stationery");
		lblAddCloth.setBounds(255, 13, 165, 18);
		contentPane.add(lblAddCloth);
		
		JLabel lblNewLabel = new JLabel("Stationery Name");
		lblNewLabel.setBounds(37, 76, 131, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumber = new JLabel("Stationery ID");
		lblNumber.setBounds(37, 136, 104, 18);
		contentPane.add(lblNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 133, 143, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(367, 344, 113, 27);
		contentPane.add(btnCancel);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNumber_1 = new JLabel("Number");
		lblNumber_1.setBounds(37, 201, 85, 18);
		contentPane.add(lblNumber_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 198, 143, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(50, 293, 25, -7);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(37, 262, 72, 18);
		contentPane.add(lblPrice);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 259, 143, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSupplier = new JLabel("Supplier ");
		lblSupplier.setBounds(323, 77, 72, 18);
		contentPane.add(lblSupplier);
		
		textField_4 = new JTextField();
		textField_4.setBounds(422, 74, 146, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSupplierId = new JLabel("Supplier ID");
		lblSupplierId.setBounds(323, 136, 88, 18);
		contentPane.add(lblSupplierId);
		
		textField_5 = new JTextField();
		textField_5.setBounds(422, 133, 146, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		this.setVisible(true);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(89, 344, 113, 27);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.RED);
		textArea.setBounds(71, 304, 385, 27);
		contentPane.add(textArea);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name=textField.getText();
				id=textField_1.getText();
				number=textField_2.getText();
				price=textField_3.getText();
				sname=textField_4.getText();
				sid=textField_5.getText();
				
				if(number.isEmpty()||price.isEmpty()||name.isEmpty()){
					System.out.println("----");
					textArea.setText("Wrong input, try again!");
				}
				else{
					if(Integer.parseInt(number)<=0||Integer.parseInt(price)<=0||Integer.parseInt(id)>3999||Integer.parseInt(id)<3000||Integer.parseInt(sid)>9999||Integer.parseInt(sid)<1000){
					textArea.setText("Wrong input, try again!");
					}
					else{
					System.out.println("*****");
				modifyStationery add=new modifyStationery(name,id,number,price,sname,sid);
				try {
					add.addStationeryQuery1();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea.setText("Wrong, try again!");
				}
				try {
					add.addStationeryQuery2();
					textArea.setText("Add Successful!");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea.setText("Wrong, try again!");
				}
				try {
					add.addStationeryQuery3();
					//textArea.setText("Add Successful!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea.setText("Wrong, try again!");
				}
				}}

			}
		});
	}
}
