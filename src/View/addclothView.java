package View;

import java.awt.BorderLayout;
import java.awt.Color;
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





import Control.ClothController;
import Control.QueryTableController;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class addclothView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldClothName;
	private JTextField textFieldClothId;
	private JTextField textFieldNumber;
	private JTextField textFieldPrice;
	private JTextField textFieldSupplier;
	private JTextField textFieldSupplierId;
	private JComboBox comboBoxSize;
	private JComboBox comboBoxColor;
	JTextArea textArea;


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
		contentPane.setBackground(Color.WHITE);
		contentPane.setToolTipText("Size");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldClothName = new JTextField();
		textFieldClothName.setBounds(153, 74, 167, 24);
		contentPane.add(textFieldClothName);
		textFieldClothName.setColumns(10);
		
		
		JLabel lblAddCloth = new JLabel("Add  Cloth");
		lblAddCloth.setBounds(268, 13, 108, 18);
		contentPane.add(lblAddCloth);
		
		JLabel lblNewLabel = new JLabel("Cloth Name");
		lblNewLabel.setBounds(50, 76, 118, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumber = new JLabel("Cloth ID");
		lblNumber.setBounds(50, 136, 72, 18);
		contentPane.add(lblNumber);
		
		textFieldClothId = new JTextField();
		textFieldClothId.setBounds(153, 133, 167, 24);
		contentPane.add(textFieldClothId);
		textFieldClothId.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(89, 344, 113, 27);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener(){
			/**public void actionPerformed(ActionEvent e) {
				QueryTableController q=new QueryTableController();
				try {
					q.process1();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}*/

			public void actionPerformed(ActionEvent e){

				//String size = "XXSmall";
				//String color = "red";
				


				try {				String type = textFieldClothName.getText();
				String size = comboBoxSize.getSelectedItem().toString();
				String color = comboBoxColor.getSelectedItem().toString();
					int IdCloth = Integer.parseInt(textFieldClothId.getText());
				int number = Integer.parseInt(textFieldNumber.getText());
				int price = Integer.parseInt(textFieldPrice.getText());
				int supplierId = Integer.parseInt(textFieldSupplierId.getText());
					new ClothController().process_add(color, type, size, IdCloth, supplierId, price, number);
					textArea.setText("Successfully Add");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea.setText("Illegal Add!");
				}
			}
			
			
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(367, 344, 113, 27);
		contentPane.add(btnCancel);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNumber_1 = new JLabel("Number");
		lblNumber_1.setBounds(50, 201, 72, 18);
		contentPane.add(lblNumber_1);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setBounds(153, 198, 167, 24);
		contentPane.add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(50, 293, 25, -7);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(50, 262, 72, 18);
		contentPane.add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBounds(153, 259, 167, 24);
		contentPane.add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		comboBoxSize = new JComboBox();
		comboBoxSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxSize.setToolTipText("Size");
		comboBoxSize.setModel(new DefaultComboBoxModel(new String[] {"XXSmall", "XSmall", "Small", "Medium", "Large", "Xlarge", "XXlarge", "XXXLarge"}));
		comboBoxSize.setBounds(488, 74, 80, 24);
		contentPane.add(comboBoxSize);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(386, 77, 51, 18);
		contentPane.add(lblSize);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(386, 136, 72, 18);
		contentPane.add(lblColor);
		
	
		JLabel lblSupplier = new JLabel("Supplier");
		lblSupplier.setBounds(367, 201, 72, 18);
		contentPane.add(lblSupplier);
		
		textFieldSupplier = new JTextField();
		textFieldSupplier.setBounds(453, 198, 129, 24);
		contentPane.add(textFieldSupplier);
		textFieldSupplier.setColumns(10);
		
		JLabel lblSupplierId = new JLabel("Supplier ID");
		lblSupplierId.setBounds(367, 268, 103, 18);
		contentPane.add(lblSupplierId);
		
		textFieldSupplierId = new JTextField();
		textFieldSupplierId.setBounds(453, 265, 129, 24);
		contentPane.add(textFieldSupplierId);
		textFieldSupplierId.setColumns(10);
		
		comboBoxColor = new JComboBox();
		comboBoxColor.setModel(new DefaultComboBoxModel(new String[] {"WHITE", "BLUE", "BLACK", "RED", "GREEN", "GRAY", "YELLOW"}));
		comboBoxColor.setBounds(488, 133, 80, 24);
		contentPane.add(comboBoxColor);
		
		textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setForeground(Color.RED);
		textArea.setBounds(233, 375, 204, 37);
		contentPane.add(textArea);
		this.setVisible(true);
	}
}
