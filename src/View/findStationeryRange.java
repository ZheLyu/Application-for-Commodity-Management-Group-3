package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import Control.QueryTableController;

public class findStationeryRange extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextArea textArea;

	

	/**
	 * Create the frame.
	 */
	public findStationeryRange() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 660, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 85, 86, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Search Stationery by  Range");
		lblNewLabel.setBounds(208, 10, 203, 24);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("<=Price<=");
		label.setBounds(262, 87, 72, 18);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(399, 85, 86, 24);
		contentPane.add(textField);
		
		textArea = new JTextArea();
		textArea.setBounds(30, 242, 580, 205);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(59, 183, 113, 27);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QueryTableController qu= new QueryTableController();
				String price1=textField.getText();
				String price2=textField_1.getText();
				if(price1.isEmpty()||price2.isEmpty()){
					textArea.setText("Wrong input!");
				}
				else if(Integer.parseInt(price1)<=0||Integer.parseInt(price2)<=0){
					textArea.setText("Wrong input!");
					
				}
				else{
				qu.setPrice1(price1);
				qu.setPrice2(price2);
				
				try {
					textArea.setText("");
					textArea.append("\t********************************************************************************************************************\n");
					textArea.append("\t id \t name \t  \t price  \t number  \n");
					textArea.append("\t********************************************************************************************************************\n");
					textArea.append(qu.process15());
					textArea.append("\n");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
				
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(417, 183, 113, 27);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
