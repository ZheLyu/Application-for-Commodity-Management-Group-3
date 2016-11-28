package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Model;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainView extends JFrame {
	JLabel lblNewLabel_1 = new JLabel("V 1.0.04");

	private JPanel contentPane;
	Model model;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Model m = new Model();
					MainView frame = new MainView(m);
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
	public MainView(Model m) {
		this.model = m;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Commodity Management");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(254, 13, 413, 56);
		contentPane.add(lblNewLabel);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addItem("cloth");
		comboBox.addItem("book");
		comboBox.addItem("others");
		contentPane.add(comboBox);
		this.setVisible(true);
		comboBox.setBounds(28, 48, 95, 38);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem()=="cloth"){
					addclothView addcloth= new addclothView(model);
					addcloth.setVisible(true);}
				if(comboBox.getSelectedItem()=="book"){
						addBookView addBook= new addBookView();
						addBook.setVisible(true);}
				if(comboBox.getSelectedItem()=="others"){
							addStationeryView addStationery= new addStationeryView();
							addStationery.setVisible(true);
					
				}
			 
			}
		});
		btnNewButton.setBounds(0, 104, 121, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Change");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeView change=new changeView();
				change.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(0, 223, 121, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(comboBox.getSelectedItem()=="cloth"){
						deleteClothView deletecloth= new deleteClothView();
						deletecloth.setVisible(true);}
					if(comboBox.getSelectedItem()=="book"){
							deleteBookView deleteBook= new deleteBookView();
							deleteBook.setVisible(true);}
					if(comboBox.getSelectedItem()=="others"){
								deleteStationeryView deleteStationery= new deleteStationeryView();
								deleteStationery.setVisible(true);
						
					}
			}
		});
		btnNewButton_2.setBounds(0, 337, 121, 56);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Find");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findView find=new findView();
				find.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(0, 446, 121, 56);
		contentPane.add(btnNewButton_3);
		

		lblNewLabel_1.setBounds(542, 84, 81, 18);
		contentPane.add(lblNewLabel_1);
	}

}


