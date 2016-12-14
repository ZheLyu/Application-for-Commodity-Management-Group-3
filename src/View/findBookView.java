package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import Control.QueryTableController;

public class findBookView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					findBookView frame = new findBookView();
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
	public findBookView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 573, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find Book");
		lblNewLabel.setBounds(203, 13, 143, 42);
		contentPane.add(lblNewLabel);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 185, 555, 232);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Book Id");
		lblNewLabel_1.setBounds(44, 73, 72, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Book Name");
		lblNewLabel_2.setBounds(44, 127, 80, 18);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(142, 70, 225, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 124, 225, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QueryTableController qu= new QueryTableController();
				qu.setId(textField.getText());
				qu.setName(textField_1.getText());
				if(textField_1.getText().isEmpty()&&textField.getText().isEmpty()){
					textArea.setText("Wrong input!");
				}
				else if(textField.getText().isEmpty()){
					try {
						String re=qu.process12();
						if(re=="[]"){
							textArea.append("Not exist, please try again!");
						    textArea.append("\n");	
						}
						else {textArea.append(re);
						   textArea.append("\n");}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(textField_1.getText().isEmpty()){
					try {
						String re=qu.process8();
						if(re=="[]"){
							textArea.append("Not exist, please try again!");
						    textArea.append("\n");	
						}
						else {textArea.append(re);
						   textArea.append("\n");}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				else {
					try {
						String re=qu.process8();
						if(re=="[]"){
							textArea.append("Not exist, please try again!");
						    textArea.append("\n");	
						}
						else {textArea.append(re);
						   textArea.append("\n");}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						
					}
				   textArea.append("\n");
					
				}
			}
		});

		btnNewButton.setBounds(428, 51, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(428, 123, 113, 27);
		contentPane.add(btnNewButton_1);
	}
}
