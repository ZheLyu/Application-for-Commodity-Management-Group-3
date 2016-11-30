package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import Control.QueryTableController;
import javax.swing.JScrollBar;

public class findClothView extends JFrame {

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
					findClothView frame = new findClothView();
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
	public findClothView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find Cloth");
		lblNewLabel.setBounds(203, 13, 143, 42);
		contentPane.add(lblNewLabel);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 185, 700, 232);
		contentPane.add(textArea);
		//JScrollPane Scroll = new JScrollPane();
		//Scroll.setViewportView(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Cloth Id");
		lblNewLabel_1.setBounds(44, 73, 72, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cloth Name");
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
			    if(textField.getText().isEmpty()){
					try {
						textArea.append(qu.process5());
						textArea.append("\n");
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(textField_1.getText().isEmpty()){
					try {
						textArea.append(qu.process7());
						textArea.append("\n");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else{
					try {
						textArea.append(qu.process7());
						textArea.append("\n");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBounds(428, 51, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(428, 123, 113, 27);
		contentPane.add(btnNewButton_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(0, 185, 21, 232);
		contentPane.add(scrollBar);
	}
}
