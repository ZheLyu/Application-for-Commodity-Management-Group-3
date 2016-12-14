package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.BookController;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;

public class addBookView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBookName;
	private JTextField textFieldISBN;
	private JTextField textFieldNumber;
	private JTextField textFieldPrice;
	private JTextField textFieldGenre;
	private JTextField textFieldSupplier;
	private JTextField textFieldId;
	JTextArea textArea;

	

	/**
	 * Create the frame.
	 */
	public addBookView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600,522);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldBookName = new JTextField();
		textFieldBookName.setBounds(136, 88, 133, 24);
		contentPane.add(textFieldBookName);
		textFieldBookName.setColumns(10);
		textArea = new JTextArea();
		textArea.setBounds(97, 312, 418, 38);
		contentPane.add(textArea);
		this.setVisible(true);
		JLabel lblAddCloth = new JLabel("Add  Book");
		lblAddCloth.setBounds(268, 13, 108, 18);
		contentPane.add(lblAddCloth);
		
		JLabel lblNewLabel = new JLabel("Book Name");
		lblNewLabel.setBounds(50, 90, 118, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumber = new JLabel("Isbn");
		lblNumber.setBounds(50, 152, 72, 18);
		contentPane.add(lblNumber);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setBounds(136, 149, 133, 24);
		contentPane.add(textFieldISBN);
		textFieldISBN.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textFieldBookName.getText();	
				String genre = textFieldGenre.getText();
				int ISBN = Integer.parseInt(textFieldISBN.getText());
				int number = Integer.parseInt(textFieldNumber.getText());
				int price = Integer.parseInt(textFieldPrice.getText());
				int Id = Integer.parseInt(textFieldId.getText());
				int sId = Integer.parseInt(textFieldSupplier.getText());
				if(number<=0||price<=0){
					textArea.setText("Wrong, try again !");
					
				}
				else{
				try {
					new BookController().process_add(name, genre,ISBN, price, number,Id,sId);
					textArea.setText("Add Successful !");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea.setText("Wrong, try again !");
				}
				}
			}
		});
		btnNewButton.setBounds(97, 363, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(373, 363, 113, 27);
		contentPane.add(btnCancel);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNumber_1 = new JLabel("Number");
		lblNumber_1.setBounds(50, 212, 72, 18);
		contentPane.add(lblNumber_1);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setBounds(136, 209, 133, 24);
		contentPane.add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(50, 293, 25, -7);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(50, 267, 72, 18);
		contentPane.add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBounds(135, 267, 134, 24);
		contentPane.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JLabel lblGnere = new JLabel("Genre");
		lblGnere.setBounds(303, 91, 72, 18);
		contentPane.add(lblGnere);
		
		textFieldGenre = new JTextField();
		textFieldGenre.setBounds(400, 88, 153, 24);
		contentPane.add(textFieldGenre);
		textFieldGenre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Supplier");
		lblNewLabel_2.setBounds(303, 152, 72, 18);
		contentPane.add(lblNewLabel_2);
		
		textFieldSupplier = new JTextField();
		textFieldSupplier.setBounds(400, 149, 153, 24);
		contentPane.add(textFieldSupplier);
		textFieldSupplier.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setBounds(303, 212, 88, 18);
		contentPane.add(lblNewLabel_3);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(400, 209, 153, 24);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		
	}
}
