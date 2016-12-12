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

public class quickAddView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public String id;
	public String number;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quickAddView frame = new quickAddView();
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
	public quickAddView() {
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
		JLabel lblDeleteCloth = new JLabel("Quick Add");
		lblDeleteCloth.setBounds(230, 13, 166, 28);
		contentPane.add(lblDeleteCloth);
		
		JLabel lblClothName = new JLabel("ID");
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
		
		JButton btnDelete = new JButton("Add");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id=textField.getText();
				number=textField_1.getText();
				if(id.isEmpty()||number.isEmpty())
					textArea.setText("Wrong, try again!");
				else{
					if(Integer.parseInt(number)<=0||Integer.parseInt(id)<999||Integer.parseInt(id)>3999)
						textArea.setText("Wrong, try again!");
					else{
				System.out.println("*******");
				modifyStationery del= new modifyStationery(id,number);
				try {
					del.addStationeryQuery6();
					textArea.setText("Add Successful!");
					
				} catch (Exception e1) {
					e1.printStackTrace();
					textArea.setText("Wrong, try again!");
				}
				}}
			}
				
		});
		btnDelete.setBounds(84, 318, 145, 27);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(345, 318, 135, 27);
		contentPane.add(btnCancel);
		
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

		});
	}
}


