package tutorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Detail {

	private JFrame frame;
	private JPanel panelRight;
	private CardLayout cl_panelRight = new CardLayout(0,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Detail window = new Detail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Detail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel panelLeft = new JPanel();
		splitPane.setLeftComponent(panelLeft);
		panelLeft.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton = new JButton("BIBM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_panelRight.show(panelRight,"name_6939235228600");
			}
		});
		panelLeft.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("IMBA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_panelRight.show(panelRight,"name_6971512726900");
			}
		});
		panelLeft.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_panelRight.show(panelRight,"name_6953092821200");
			}
		});
		panelLeft.add(btnNewButton_2);
		
		panelRight = new JPanel();
		splitPane.setRightComponent(panelRight);
		panelRight.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("IMBA");
		panelRight.add(lblNewLabel_1, "name_6971512726900");
		
		JLabel lblNewLabel = new JLabel("BIBM");
		panelRight.add(lblNewLabel, "name_6939235228600");
		
		JLabel label = new JLabel("BIT");
		panelRight.add(label, "name_6953092821200");
	}

}
