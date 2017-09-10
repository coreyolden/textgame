package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JList;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Viewframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Viewframe frame = new Viewframe();
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
	public Viewframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.GREEN);
		
		JEditorPane InformationAndOptions = new JEditorPane();
		InformationAndOptions.setBounds(528, 16, 199, 454);
		contentPane.add(InformationAndOptions);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(36, 331, 430, 139);
		contentPane.add(textPane);
		
		JPanel Displayimage = new JPanel();
		Displayimage.setBounds(36, 30, 430, 239);
		contentPane.add(Displayimage);
		
		JButton Options = new JButton("Options");
		Options.setBounds(0, 0, 115, 29);
		contentPane.add(Options);
	}
}
