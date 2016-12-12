package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import Control.QueryTableController;
import javax.swing.ImageIcon;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Toolkit;

public class MainView extends JFrame {
	JLabel lblNewLabel_1 = new JLabel("V 1.0.09");

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\dell\\Desktop\\\u521B\u610F\u5927\u7406\u77F3\u7EB9\u7406\u80CC\u666F\u77E2\u91CF\u7D20\u6750.png.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Commodity Management");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(254, 13, 413, 56);
		contentPane.add(lblNewLabel);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.addItem("cloth");
		comboBox.addItem("book");
		comboBox.addItem("others");
		contentPane.add(comboBox);
		this.setVisible(true);
		comboBox.setBounds(38, 46, 95, 38);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Commodity storage");
		btnNewButton.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem()=="cloth"){
					addclothView addcloth= new addclothView();
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
		btnNewButton.setBounds(38, 119, 169, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Commodity Change");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeView change=new changeView();
				change.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(38, 223, 169, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Commodity Delete");
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
		btnNewButton_2.setBounds(38, 324, 169, 56);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Find by Attribute");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem()=="cloth"){
					findClothView findcloth= new findClothView();
					findcloth.setVisible(true);}
				if(comboBox.getSelectedItem()=="book"){
						findBookView findBook= new findBookView();
						findBook.setVisible(true);}
				if(comboBox.getSelectedItem()=="others"){
							findStationeryView findStationery= new findStationeryView();
							findStationery.setVisible(true);
				}	
			}
		});
		btnNewButton_3.setBounds(38, 433, 169, 56);
		contentPane.add(btnNewButton_3);
		

		lblNewLabel_1.setBounds(542, 84, 81, 18);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_4 = new JButton("Show All Book");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try {
					showAllBook show=new showAllBook();
					show.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
                

 				
			}
		});
		btnNewButton_4.setBounds(369, 119, 169, 56);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Show All Cloth");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  try {
						showAllCloth show=new showAllCloth();
						show.setVisible(true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
			}
		});
		btnNewButton_5.setBounds(369, 223, 169, 56);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Show All Stationery");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  try {
						showAllStationery show=new showAllStationery();
						show.setVisible(true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});

	
		btnNewButton_6.setBounds(369, 324, 169, 56);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Add User");
		btnNewButton_7.setBounds(624, 485, 115, 38);
		contentPane.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				  try {
						addAdminView show=new addAdminView();
						show.setVisible(true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			
		});
		
		JButton btnNewButton_8 = new JButton("Cancel");
		btnNewButton_8.setBounds(753, 485, 115, 38);
		contentPane.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btnNewButton_9 = new JButton("Search by Range");
		btnNewButton_9.setBounds(369, 433, 169, 56);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem()=="cloth"){
					findClothRange findcloth= new findClothRange();
					findcloth.setVisible(true);}
				if(comboBox.getSelectedItem()=="book"){
						findBookRange findBook= new findBookRange();
						findBook.setVisible(true);}
				if(comboBox.getSelectedItem()=="others"){
							findStationeryRange findStationery= new findStationeryRange();
							findStationery.setVisible(true);
				}	
			}
		});
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Quick Storage");
		btnNewButton_10.setBounds(636, 122, 169, 50);
		btnNewButton_10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				  try {
						quickAddView show=new quickAddView();
						show.setVisible(true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			
		});
		contentPane.add(btnNewButton_10);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, comboBox, btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, lblNewLabel_1, btnNewButton_4, btnNewButton_5, btnNewButton_6, btnNewButton_7}));
	}
}


