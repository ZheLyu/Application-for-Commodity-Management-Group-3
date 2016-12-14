package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;





import model.LoginModel;
import model.addAdmin;

import javax.swing.JTextArea;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	private JTextArea textArea;
    public String password;
    public String ad;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(183, 13, 94, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Administrator");
		lblNewLabel_1.setBounds(40, 87, 104, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(40, 150, 72, 18);
		contentPane.add(lblNewLabel_2);
	   
		
		textField = new JTextField();
		textField.setBounds(159, 84, 147, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		textArea = new JTextArea();
	    textArea.setForeground(Color.RED);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(69, 40, 281, 35);
		contentPane.add(textArea);
		textField_1 = new JPasswordField();
		textField_1.setBounds(159, 147, 147, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(69, 200, 113, 27);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ad=textField.getText();
				password=textField_1.getText();
				LoginModel mo= new LoginModel();
				//addAdmin add=new addAdmin();
				mo.setAd(ad);
				mo.setPassword(password);
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！");
				//add.setAd(ad);
				//add.setPassword(password);
				try {
					//add.query();
					if(mo.query()==true){
						MainView m= new MainView();
						m.setVisible(true);
						dispose();
					}
					else{
					
						textArea.setText("Wrong user name or password, please try again!");
						
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(237, 200, 113, 27);
		contentPane.add(btnCancel);
		
	
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		

	}
}
