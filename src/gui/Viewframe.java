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
import javax.swing.JTextField;

public class Viewframe extends JFrame {

	private JPanel contentPane;
	private JTextField TypeOptionTextBox;

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
		contentPane.setBackground(new Color(51, 204, 102));
		
		JPanel Displayimage = new JPanel();
		Displayimage.setBounds(36, 16, 462, 299);
		contentPane.add(Displayimage);
		
		JTextArea ConsolLogBox = new JTextArea();
		ConsolLogBox.setText("System will output text here");
		ConsolLogBox.setBounds(36, 345, 462, 132);
		contentPane.add(ConsolLogBox);
		
		TypeOptionTextBox = new JTextField();
		TypeOptionTextBox.setText("Type here");
		TypeOptionTextBox.setBounds(538, 342, 146, 26);
		contentPane.add(TypeOptionTextBox);
		TypeOptionTextBox.setColumns(10);
		
		JTextArea healthTextBox = new JTextArea();
		healthTextBox.setText("Enemy health 10/15");
		healthTextBox.setBounds(513, 16, 230, 22);
		contentPane.add(healthTextBox);
		
		JTextArea PlayerHealthTextBox = new JTextArea();
		PlayerHealthTextBox.setText("Your health 10/15");
		PlayerHealthTextBox.setBounds(513, 54, 230, 22);
		contentPane.add(PlayerHealthTextBox);
		
		JTextArea NumberOfPotionsTextBox = new JTextArea();
		NumberOfPotionsTextBox.setText("Number of potions 5");
		NumberOfPotionsTextBox.setBounds(513, 92, 230, 22);
		contentPane.add(NumberOfPotionsTextBox);
		
		JTextArea OptionsTextBox = new JTextArea();
		OptionsTextBox.setText("Options:\r\nRun\r\nAttack\r\nDrink Potion");
		OptionsTextBox.setBounds(513, 143, 230, 172);
		contentPane.add(OptionsTextBox);
	}
}
