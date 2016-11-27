package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class changeView extends JFrame {

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
					changeView frame = new changeView();
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
	public changeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change Price");
		lblNewLabel.setBounds(167, 13, 136, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblCommodityId = new JLabel("Commodity ID");
		lblCommodityId.setBounds(26, 82, 106, 18);
		contentPane.add(lblCommodityId);
		
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
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(243, 200, 113, 27);
		contentPane.add(btnCancel);
	}
}
