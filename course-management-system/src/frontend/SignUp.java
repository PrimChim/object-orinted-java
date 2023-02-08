package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class SignUp implements ActionListener{

	private JFrame frame;
	private JTextField uName;
	private JTextField email;
	private JTextField phoneno;
	private JComboBox<?> comboBox;
	private JComboBox<?> comboBox_1;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_4;
	private JLabel exist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}

	// inserting function
	
	private void insertIntoTable() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management", 
			    		"root", 
			    		"$$$lamjung$$$@@@");

			if(comboBox.getSelectedItem()=="Student") {
				Statement st = (Statement) con.createStatement();
				String exeQ = "insert into student(username, email,password,phone)"
						+ "values ('"+uName.getText()
						+ "','"+email.getText()
						+"','"+String.valueOf(passwordField.getPassword())
						+"','"+phoneno.getText()
						+"');";
				st.executeUpdate(exeQ);
				st.close();
				
				Statement st1 = (Statement) con.createStatement();
				String exeQ1 = "select student_id from student where username='"+uName.getText()+"';";
				ResultSet rs = st1.executeQuery(exeQ1);
				rs.next();
				int id = Integer.valueOf(rs.getString("student_id"));
				System.out.println(comboBox_1.getSelectedItem());
				if(comboBox_1.getSelectedItem().equals("BIBM")) {
					System.out.println(id);
					exeQ1 = "insert into student_activity values("+id+",1);";
					st1.executeUpdate(exeQ1);
				}else if(comboBox_1.getSelectedItem().equals("BIT")) {
					exeQ1 = "insert into student_activity values("+id+",2);";
					st1.executeUpdate(exeQ1);
				}
			}else if(comboBox.getSelectedItem()=="Admin") {
				Statement st = (Statement) con.createStatement();
				String exeQ = "insert into admin(username, email,password,phone)"
						+ "values ('"+uName.getText()
						+ "','"+email.getText()
						+"','"+String.valueOf(passwordField.getPassword())
						+"','"+phoneno.getText()
						+"');";
				st.executeUpdate(exeQ);
				st.close();
			}else {
				Statement st = (Statement) con.createStatement();
				String exeQ = "insert into instructor(username, email,password,phone)"
						+ "values ('"+uName.getText()
						+ "','"+email.getText()
						+"','"+String.valueOf(passwordField.getPassword())
						+"','"+phoneno.getText()
						+"');";
				st.executeUpdate(exeQ);
				st.close();
			}
		}catch(ClassNotFoundException | SQLException e1){
			System.out.println(e1);
		};
	}
	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("rawtypes")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel = new JLabel("Enter username");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		uName = new JTextField();
		uName.setFont(new Font("Verdana", Font.PLAIN, 12));
		uName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter email");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		email = new JTextField();
		email.setFont(new Font("Verdana", Font.PLAIN, 12));
		email.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter password");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JLabel lblNewLabel_3 = new JLabel("Enter phone number");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		phoneno = new JTextField();
		phoneno.setFont(new Font("Verdana", Font.PLAIN, 12));
		phoneno.setColumns(10);
		
		String phone = phoneno.getText().toString();
		System.out.println(phone);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Instructor", "Student"}));
		comboBox.addActionListener(this);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select cource:", "BIBM", "BIT"}));
		comboBox_1.setVisible(false);	   
		
		JButton SignUp = new JButton("Sign Up");
		SignUp.setBackground(Color.WHITE);
		SignUp.setFont(new Font("Verdana", Font.PLAIN, 12));
		SignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management", 
					    		"root", 
					    		"$$$lamjung$$$@@@");
					System.out.println("connection successful!!!");
					
					// checking if user already exists

					String mode = (String)comboBox.getSelectedItem();
					if(mode.equals("Admin")) {
						Statement st1 = (Statement) con.createStatement();
						String displayQ = "select*from admin where username = '"+uName.getText()+"';";
						
						ResultSet rs = st1.executeQuery(displayQ);
						if(rs.next()) {
							exist.setVisible(true);
						}else {
							exist.setVisible(false);
							insertIntoTable();
						}
					} else if(mode.equals("Student")) {
						Statement st1 = (Statement) con.createStatement();
						String displayA = "select*from student where username = '"+uName.getText()+"';";
						
						ResultSet rs = st1.executeQuery(displayA);
						if(rs.next()) {
							exist.setVisible(true);
						}else {
							exist.setVisible(false);
							insertIntoTable();
						}
					} else {
						Statement st1 = (Statement) con.createStatement();
						String displayQ = "select*from instructor where username = '"+uName.getText()+"';";
						
						ResultSet rs = st1.executeQuery(displayQ);
						if(rs.next()) {	
							exist.setVisible(true);
						}else {
							exist.setVisible(false);
							insertIntoTable();
						}
					}

				}catch(ClassNotFoundException | SQLException e1){
					System.out.println(e1);
				};
			}
		});
		
		JButton LogIn = new JButton("Log In");
		LogIn.setBackground(Color.ORANGE);
		LogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LogIn();
				frame.setVisible(false);
			}
		});
		LogIn.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		lblNewLabel_4 = new JLabel("Welcome to Sign Up Panel");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		exist = new JLabel("Username exists already");
		exist.setFont(new Font("Tahoma", Font.PLAIN, 8));
		exist.setForeground(Color.RED);
		exist.setVisible(false);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(95)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
								.addComponent(uName, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(email, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
								.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
								.addComponent(phoneno, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(SignUp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(LogIn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
								.addComponent(exist, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(87)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(exist)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addGap(6)
					.addComponent(uName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblNewLabel_1)
					.addGap(6)
					.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addGap(6)
					.addComponent(phoneno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LogIn)
						.addComponent(SignUp))
					.addGap(72))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100,1000,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			if(comboBox.getSelectedItem()=="Student") {
				comboBox_1.setVisible(true);
			}
			
		}
	}
}
