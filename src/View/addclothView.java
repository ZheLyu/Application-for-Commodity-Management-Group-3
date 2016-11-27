package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class addclothView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addclothView frame = new addclothView();
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
	public addclothView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650,500);
		contentPane = new JPanel();
		contentPane.setToolTipText("Size");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(153, 74, 167, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddCloth = new JLabel("Add  Cloth");
		lblAddCloth.setBounds(268, 13, 108, 18);
		contentPane.add(lblAddCloth);
		
		JLabel lblNewLabel = new JLabel("Cloth Name");
		lblNewLabel.setBounds(50, 76, 118, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumber = new JLabel("Cloth ID");
		lblNumber.setBounds(50, 136, 72, 18);
		contentPane.add(lblNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 133, 167, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(89, 344, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(367, 344, 113, 27);
		contentPane.add(btnCancel);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(2);
			}
		});
		
		JLabel lblNumber_1 = new JLabel("Number");
		lblNumber_1.setBounds(50, 201, 72, 18);
		contentPane.add(lblNumber_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(153, 198, 167, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(50, 293, 25, -7);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(50, 262, 72, 18);
		contentPane.add(lblPrice);
		
		textField_3 = new JTextField();
		textField_3.setBounds(153, 259, 167, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Size");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"XXSmall", "XSmall", "Small", "Medium", "Large", "Xlarge", "XXlarge", "XXXLarge"}));
		comboBox.setBounds(488, 74, 80, 24);
		contentPane.add(comboBox);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(386, 77, 51, 18);
		contentPane.add(lblSize);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(386, 136, 72, 18);
		contentPane.add(lblColor);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"WHITE", "YELLOW", "RED", "GRAY", "GREEN", "BLACK", "BLUE", "OTHERS"}));
		comboBox_1.setBounds(488, 133, 80, 24);
		contentPane.add(comboBox_1);
		
		JLabel lblSupplier = new JLabel("Supplier");
		lblSupplier.setBounds(367, 201, 72, 18);
		contentPane.add(lblSupplier);
		
		textField_4 = new JTextField();
		textField_4.setBounds(453, 198, 129, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSupplierId = new JLabel("Supplier ID");
		lblSupplierId.setBounds(367, 268, 103, 18);
		contentPane.add(lblSupplierId);
		
		textField_5 = new JTextField();
		textField_5.setBounds(453, 265, 129, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		this.setVisible(true);
	}
}
