package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.ClothController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class deleteClothView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldSize;
	private JTextField textFieldColor;

	
	/**
	 * Create the frame.
	 */
	public deleteClothView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteCloth = new JLabel("Delete Cloth");
		lblDeleteCloth.setBounds(230, 13, 119, 28);
		contentPane.add(lblDeleteCloth);
		
		JLabel lblClothName = new JLabel("Cloth Name");
		lblClothName.setBounds(50, 77, 119, 37);
		contentPane.add(lblClothName);
		
		textField = new JTextField();
		textField.setBounds(199, 81, 209, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(50, 237, 72, 18);
		contentPane.add(lblNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 227, 209, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				String size = textFieldSize.getText();
				String color = textFieldColor.getText();
				int number = Integer.parseInt(textField_1.getText());
				try {
					new ClothController().process_delNumber(name,size,color,number);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(79, 318, 113, 27);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(295, 318, 113, 27);
		contentPane.add(btnCancel);
		
		textFieldSize = new JTextField();
		textFieldSize.setBounds(199, 132, 209, 28);
		contentPane.add(textFieldSize);
		textFieldSize.setColumns(10);
		
		textFieldColor = new JTextField();
		textFieldColor.setBounds(199, 185, 209, 26);
		contentPane.add(textFieldColor);
		textFieldColor.setColumns(10);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(50, 130, 115, 33);
		contentPane.add(lblSize);
		
		JLabel lblCloar = new JLabel("Cloar");
		lblCloar.setBounds(50, 182, 115, 33);
		contentPane.add(lblCloar);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

		});
	}
}
