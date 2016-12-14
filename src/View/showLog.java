package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import Control.QueryTableController;
import model.QueryTable;

public class showLog extends JFrame {

	private JPanel contentPane;
	JTextArea textArea ;


	/**
	 * Create the frame.
	 */
	public showLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		QueryTableController qu=new QueryTableController();
		
		textArea = new JTextArea();
		
			try {
				textArea.append(qu.processLog());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		textArea.setBounds(0, 0, 586, 471);
		contentPane.add(textArea);
	}

}
