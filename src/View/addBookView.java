package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class addBookView extends JFrame {

	private JPanel contentPane;
	private JTextField tfBookNumber;
	private JTextField tfIsbn;
	private JTextField tfNumber;
	private JTextField tfPrice;
	private JTextField tfGenre;
	private JTextField tfSupplier;
	private JTextField tfSupplierId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addBookView frame = new addBookView();
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
	public addBookView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718,580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfBookNumber = new JTextField();
		tfBookNumber.setBounds(136, 88, 133, 24);
		contentPane.add(tfBookNumber);
		tfBookNumber.setColumns(10);
		
		JLabel lblAddCloth = new JLabel("Add  Book");
		lblAddCloth.setBounds(268, 13, 108, 18);
		contentPane.add(lblAddCloth);
		
		JLabel lblNewLabel = new JLabel("Book Name");
		lblNewLabel.setBounds(50, 90, 118, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumber = new JLabel("Isbn");
		lblNumber.setBounds(50, 152, 72, 18);
		contentPane.add(lblNumber);
		
		tfIsbn = new JTextField();
		tfIsbn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Isbn = tfIsbn.getText();
			}
		});
		tfIsbn.setBounds(136, 149, 133, 24);
		contentPane.add(tfIsbn);
		tfIsbn.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfIsbn.getText(); 
		
			}
		});
		btnNewButton.setBounds(97, 363, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(373, 363, 113, 27);
		contentPane.add(btnCancel);

		
		JLabel lblNumber_1 = new JLabel("Number");
		lblNumber_1.setBounds(50, 212, 72, 18);
		contentPane.add(lblNumber_1);
		
		tfNumber = new JTextField();
		tfNumber.setBounds(136, 209, 133, 24);
		contentPane.add(tfNumber);
		tfNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(50, 293, 25, -7);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(50, 267, 72, 18);
		contentPane.add(lblPrice);
		
		tfPrice = new JTextField();
		tfPrice.setBounds(135, 267, 134, 24);
		contentPane.add(tfPrice);
		tfPrice.setColumns(10);
		
		JLabel lblGnere = new JLabel("Genre");
		lblGnere.setBounds(303, 91, 72, 18);
		contentPane.add(lblGnere);
		
		tfGenre = new JTextField();
		tfGenre.setBounds(400, 88, 153, 24);
		contentPane.add(tfGenre);
		tfGenre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Supplier");
		lblNewLabel_2.setBounds(303, 152, 72, 18);
		contentPane.add(lblNewLabel_2);
		
		tfSupplier = new JTextField();
		tfSupplier.setBounds(400, 149, 153, 24);
		contentPane.add(tfSupplier);
		tfSupplier.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Supplier ID");
		lblNewLabel_3.setBounds(303, 212, 88, 18);
		contentPane.add(lblNewLabel_3);
		
		tfSupplierId = new JTextField();
		tfSupplierId.setBounds(400, 209, 153, 24);
		contentPane.add(tfSupplierId);
		tfSupplierId.setColumns(10);
		this.setVisible(true);
	}
}
