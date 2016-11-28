package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.AddClothController;
import model.Cloth;
import model.Model;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;



import Control.QueryTableController;

public class addclothView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldClothName;
	private JTextField textFieldClothId;
	private JTextField textFieldNumber;
	private JTextField textFieldPrice;
	private JTextField textFieldSupplier;
	private JTextField textFieldSupplierId;
	private JComboBox comboBoxSize;
	private JComboBox comboBoxcolor;
	Model model;
	
	/**
	 * Launch the application.
	 */
	/**
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
	}*/

	
	/**
	 * Create the frame.
	 */
	public addclothView(Model m) {
		this.model = m;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650,500);
		contentPane = new JPanel();
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String clothName =  textFieldClothName.getText();
				int clothId = Integer.parseInt(textFieldClothId.getText());
				int number = Integer.parseInt(textFieldNumber.getText());
				int price = Integer.parseInt(textFieldPrice.getText());
				String supplier = textFieldSupplier.getText();
				int supplierId = Integer.parseInt(textFieldSupplierId.getText()) ;
				String color = null;
				String size = null;

				try {
					new AddClothController(model.getCloth(), addclothView.this).process(color, size, clothName, clothId);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(89, 344, 113, 27);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				QueryTableController q=new QueryTableController();
				try {
					q.process1();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(367, 344, 113, 27);
		contentPane.add(btnCancel);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
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
		
		JComboBox comboBoxSize = new JComboBox();
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
		
		JComboBox comboBoxcolor = new JComboBox();
		comboBoxcolor.setModel(new DefaultComboBoxModel(new String[] {"WHITE", "YELLOW", "RED", "GRAY", "GREEN", "BLACK", "BLUE", "OTHERS"}));
		comboBoxcolor.setBounds(488, 133, 80, 24);
		contentPane.add(comboBoxcolor);
		
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
		this.setVisible(true);
	}

	public void showResult() {
		// TODO Auto-generated method stub
		
	}
}
