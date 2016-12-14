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

public class changeView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String id;
	private String price;
	JTextArea textArea;
	

	/**
	 * Create the frame.
	 */
	public changeView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change Price");
		lblNewLabel.setBounds(167, 13, 136, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblCommodityId = new JLabel("Commodity ID");
		lblCommodityId.setBounds(26, 82, 106, 18);
		contentPane.add(lblCommodityId);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.RED);
		textArea.setBounds(68, 45, 288, 24);
		contentPane.add(textArea);
		textField = new JTextField();
		textField.setBounds(158, 79, 158, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewPrice = new JLabel("New Price");
		lblNewPrice.setBounds(26, 144, 72, 18);
		contentPane.add(lblNewPrice);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 141, 158, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(55, 200, 113, 27);
		contentPane.add(btnChange);
		btnChange.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				id=textField.getText();
				price = textField_1.getText();
				if(id==null||Integer.parseInt(price)<0)
					textArea.setText("Wrong, try again!");
				else{
				modifyStationery del= new modifyStationery();
				del.modifyPrice(id, price);
				try {
					del.addQuery7();
					textArea.setText("Change Successful!");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea.setText("Wrong, try again!");
				}
				}
			
			}
			
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			});
		
		btnCancel.setBounds(243, 200, 113, 27);
		contentPane.add(btnCancel);
		
		
	}
}
