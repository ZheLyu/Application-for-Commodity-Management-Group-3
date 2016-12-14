package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import Control.QueryTableController;

public class showAllBook extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public showAllBook() throws Exception {
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

		textArea.append("\t************************************************************************************************************************************\n");
		textArea.append("\t id \t title \t  \t price \t number \t supplier \n");
		textArea.append("\t************************************************************************************************************************************\n");

		textArea.append(qu.process2());
		textArea.append("/n");
		
	}
}
