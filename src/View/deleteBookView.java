package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.BookController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class deleteBookView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBookName;
	private JTextField textFieldNumber;
	private JButton btnDelete;
	private JButton btnCancel;

	
	/**
	 * Create the frame.
	 */
	public deleteBookView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteCloth = new JLabel("Delete Book");
		lblDeleteCloth.setBounds(230, 13, 119, 28);
		contentPane.add(lblDeleteCloth);
		
		JLabel lblClothName = new JLabel("Book Name");
		lblClothName.setBounds(50, 77, 119, 37);
		contentPane.add(lblClothName);
		
		textFieldBookName = new JTextField();
		textFieldBookName.setBounds(199, 81, 209, 28);
		contentPane.add(textFieldBookName);
		textFieldBookName.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(50, 202, 72, 18);
		contentPane.add(lblNumber);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setBounds(199, 195, 209, 28);
		contentPane.add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textFieldBookName.getText();
				int number = Integer.parseInt(textFieldNumber.getText());
				try {
					new BookController().process_delNumber(name, number);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(106, 308, 113, 27);
		contentPane.add(btnDelete);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(295, 308, 113, 27);
		contentPane.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

			
			
		});
	}

}

