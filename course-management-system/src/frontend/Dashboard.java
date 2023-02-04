package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Dashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		splitPane.setLeftComponent(panel);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\dashboard.png"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JLabel lblNewLabel = new JLabel("Course Management System");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JButton btnNewButton_1 = new JButton("Courses");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\homework.png"));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JButton btnNewButton_2 = new JButton("Tutors");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\teacher.png"));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JButton btnNewButton_3 = new JButton("Students");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\graduation.png"));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JButton btnNewButton_4 = new JButton("Mail");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\email.png"));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JButton btnNewButton_5 = new JButton("Settings");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\settings.png"));
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JButton btnNewButton_6 = new JButton("Log Out");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\log-out.png"));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LogIn();
				frame.setVisible(false);
			}
		});
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JLabel iconLabel = new JLabel("");
		iconLabel.setIcon(new ImageIcon("C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\course.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(77)
							.addComponent(iconLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_5, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(iconLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(10)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
