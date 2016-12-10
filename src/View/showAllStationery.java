package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import Control.QueryTableController;

public class showAllStationery extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {


					showAllStationery frame = new showAllStationery();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public showAllStationery() throws Exception {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(5, 5, 900, 600);
		contentPane.add(textArea);
		QueryTableController qu= new QueryTableController();
		textArea.append("\t******************************************************************************************************************\n");
		textArea.append("\t id \t name \t  \t price \t number \t supplier \n");
		textArea.append("\t******************************************************************************************************************\n");


		textArea.append(qu.process1());
		textArea.append("/n");
		
	}
}
