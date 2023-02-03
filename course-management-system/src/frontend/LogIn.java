package frontend;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LogIn {

	private JFrame frame;
	private JTextField userName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
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
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		JLabel uNameLabel = new JLabel("Username:");
		uNameLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JLabel PasswordLabel = new JLabel("Password:");
		PasswordLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		userName = new JTextField();
		userName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JLabel userMode = new JLabel("Select User:");
		userMode.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Insturctor", "Student"}));
		
		JButton LogInButton = new JButton("Log In");
		LogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management", 
					    		"root", 
					    		"$$$lamjung$$$@@@");
					System.out.println("connection successful!!!");
					
					if(comboBox.getSelectedItem()=="Student") {
						Statement st = (Statement) con.createStatement();
						String displayQ = "select*from student where username = '"+userName.getText()+"';";
						
						ResultSet rs = st.executeQuery(displayQ);
						if(rs.next()) {					
							if(rs.getString("password").equals(String.valueOf(passwordField.getPassword()))) {
								new Dashboard();
								frame.setVisible(false);
							}else {
								System.out.println("something wrong");
							}
						}else {
							System.out.println("user not found");
						}
						st.close();	
					}else if(comboBox.getSelectedItem()=="Admin") {
						Statement st = (Statement) con.createStatement();
						String displayQ = "select*from admin where username = '"+userName.getText()+"';";
						
						ResultSet rs = st.executeQuery(displayQ);
						if(rs.next()) {					
							if(rs.getString("password").equals(String.valueOf(passwordField.getPassword()))) {
								new Dashboard();
								frame.setVisible(false);
							}else {
								System.out.println("something wrong");
							}
						}else {
							System.out.println("user not found");
						}
						st.close();	
					} else {
						Statement st = (Statement) con.createStatement();
						String displayQ = "select*from admin where username = '"+userName.getText()+"';";
						
						ResultSet rs = st.executeQuery(displayQ);
						if(rs.next()) {					
							if(rs.getString("password").equals(String.valueOf(passwordField.getPassword()))) {
								new Dashboard();
								frame.setVisible(false);
							}else {
								System.out.println("something wrong");
							}
						}else {
							System.out.println("user not found");
						}
						st.close();	
					}


				}catch(ClassNotFoundException | SQLException e1){
					System.out.println(e1);
				};
			}
		});
		LogInButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JButton CreateNewButton = new JButton("Create New Account Instead");
		CreateNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		CreateNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		CreateNewButton.setBorderPainted(false);
		CreateNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUp();
				frame.setVisible(false);
			}
		});
		CreateNewButton.setForeground(Color.BLUE);
		CreateNewButton.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel = new JLabel("Welcome to Log In Pannel");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(94)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(83)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(LogInButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(CreateNewButton, Alignment.LEADING))))
					.addContainerGap(93, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(79)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
						.addComponent(userMode, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(uNameLabel, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
						.addComponent(PasswordLabel, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
						.addComponent(userName, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
					.addGap(79))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(84)
					.addComponent(userMode, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(uNameLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(userName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(PasswordLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(LogInButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(CreateNewButton)
					.addContainerGap(116, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 400, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}