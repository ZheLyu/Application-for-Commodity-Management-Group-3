package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import model.modifyStationery;
import javax.swing.JTextArea;
import java.awt.Color;

public class deleteStationeryView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public String id;
	public String number;
	JTextArea textArea;

	

	/**
	 * Create the frame.
	 */
	public deleteStationeryView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        textArea = new JTextArea();
		textArea.setForeground(Color.RED);
		textArea.setBounds(50, 259, 378, 28);
		contentPane.add(textArea);
		JLabel lblDeleteCloth = new JLabel("Delete Stationery");
		lblDeleteCloth.setBounds(230, 13, 166, 28);
		contentPane.add(lblDeleteCloth);
		
		JLabel lblClothName = new JLabel("Stationery ID");
		lblClothName.setBounds(50, 77, 135, 37);
		contentPane.add(lblClothName);
		
		textField = new JTextField();
		textField.setBounds(199, 81, 209, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(50, 202, 72, 18);
		contentPane.add(lblNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 195, 209, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDelete = new JButton("Delete Number");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id=textField.getText();
				number=textField_1.getText();
				System.out.println("*******");
				modifyStationery del= new modifyStationery(id,number);
				try {
					del.addStationeryQuery5();
					textArea.setText("Delete Successful!");
					
				} catch (Exception e1) {
					e1.printStackTrace();
					textArea.setText("Wrong, try again!");
				}
			}
		});
		btnDelete.setBounds(185, 318, 145, 27);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(362, 318, 135, 27);
		contentPane.add(btnCancel);
		
		JButton DeleteData = new JButton("Delete Data");
		DeleteData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id=textField.getText();
				number=textField.getText();
				modifyStationery del= new modifyStationery(id,number);
				try {
					del.addStationeryQuery4();
					textArea.setText("Delete Successful!");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea.setText("Wrong, try again!");
				}
			}
		});
		DeleteData.setBounds(14, 318, 134, 27);
		contentPane.add(DeleteData);
		
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

		});
	}
}

