package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Dashboard {

	private CardLayout cl_rightPanel;

	private JFrame frame;
	private JTextField txtPritam;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard(null, null);
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
	public Dashboard(String usermode, String uName) {
		initialize(usermode, uName);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String usermode, String uName) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);

		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(Color.WHITE);
		splitPane.setLeftComponent(sidePanel);

		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.WHITE);
		splitPane.setRightComponent(rightPanel);
		rightPanel.setLayout(new CardLayout(0, 0));

		cl_rightPanel = (CardLayout) (rightPanel.getLayout());

		JPanel DashboardPannel = new JPanel();
		DashboardPannel.setBackground(Color.WHITE);
		rightPanel.add(DashboardPannel, "name_162405953000");

		JLabel dsh = new JLabel("Dashboard");
		dsh.setFont(new Font("Verdana", Font.PLAIN, 12));

		JSeparator separator_2 = new JSeparator();

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();

		JPanel panel_2 = new JPanel();
		GroupLayout gl_DashboardPannel = new GroupLayout(DashboardPannel);
		gl_DashboardPannel.setHorizontalGroup(gl_DashboardPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DashboardPannel.createSequentialGroup().addGroup(gl_DashboardPannel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_DashboardPannel.createSequentialGroup().addContainerGap()
								.addGroup(gl_DashboardPannel.createParallelGroup(Alignment.LEADING)
										.addComponent(dsh, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 355,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_DashboardPannel.createSequentialGroup().addGap(28).addGroup(gl_DashboardPannel
								.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_DashboardPannel.createSequentialGroup()
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 157,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(panel_1,
												GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_DashboardPannel.setVerticalGroup(gl_DashboardPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DashboardPannel.createSequentialGroup().addContainerGap().addComponent(dsh)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(26)
						.addGroup(gl_DashboardPannel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(53, Short.MAX_VALUE)));
		DashboardPannel.setLayout(gl_DashboardPannel);

		JPanel CoursesPannel = new JPanel();
		CoursesPannel.setBackground(Color.WHITE);
		rightPanel.add(CoursesPannel, "name_180654390901");

		JLabel crss = new JLabel("Courses");
		crss.setFont(new Font("Verdana", Font.PLAIN, 12));

		JSeparator separator_2_1 = new JSeparator();
		GroupLayout gl_CoursesPannel = new GroupLayout(CoursesPannel);
		gl_CoursesPannel.setHorizontalGroup(gl_CoursesPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CoursesPannel.createSequentialGroup().addContainerGap()
						.addGroup(gl_CoursesPannel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(crss, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 61,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(separator_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 355,
										Short.MAX_VALUE))
						.addContainerGap(20, Short.MAX_VALUE)));
		gl_CoursesPannel.setVerticalGroup(gl_CoursesPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CoursesPannel.createSequentialGroup().addContainerGap().addComponent(crss)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(separator_2_1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(327, Short.MAX_VALUE)));
		CoursesPannel.setLayout(gl_CoursesPannel);

		JPanel InstructorsPannel = new JPanel();
		InstructorsPannel.setBackground(Color.WHITE);
		rightPanel.add(InstructorsPannel, "name_191777514200");

		JLabel ttr = new JLabel("Tutors");
		ttr.setFont(new Font("Verdana", Font.PLAIN, 12));

		JScrollPane scrollPane = new JScrollPane();

		JSeparator separator_2_1_1 = new JSeparator();
		
		JButton insertInstructors = new JButton("Add Instructor");
		insertInstructors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Add("Admin");
			}
		});
		insertInstructors.setBackground(Color.WHITE);
		insertInstructors.setFont(new Font("Verdana", Font.PLAIN, 9));
		
		JButton insertInstructors_1 = new JButton("Edit Instructor");
		insertInstructors_1.setFont(new Font("Verdana", Font.PLAIN, 9));
		insertInstructors_1.setBackground(Color.WHITE);
		
		JButton insertInstructors_2 = new JButton("Delete Instructor");
		insertInstructors_2.setFont(new Font("Verdana", Font.PLAIN, 9));
		insertInstructors_2.setBackground(Color.WHITE);
		GroupLayout gl_InstructorsPannel = new GroupLayout(InstructorsPannel);
		gl_InstructorsPannel.setHorizontalGroup(
			gl_InstructorsPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_InstructorsPannel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_InstructorsPannel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
						.addComponent(ttr, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_InstructorsPannel.createSequentialGroup()
							.addComponent(insertInstructors)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(insertInstructors_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(insertInstructors_2, 0, 0, Short.MAX_VALUE))
						.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_InstructorsPannel.setVerticalGroup(
			gl_InstructorsPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_InstructorsPannel.createSequentialGroup()
					.addContainerGap()
					.addComponent(ttr)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_InstructorsPannel.createParallelGroup(Alignment.BASELINE)
						.addComponent(insertInstructors)
						.addComponent(insertInstructors_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(insertInstructors_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
					.addContainerGap())
		);

		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(new Object[] { "ID", "Instructor", "Email" }, 0));

		table.getColumnModel().getColumn(0).setPreferredWidth(23);
		table.getColumnModel().getColumn(0).setMinWidth(23);
		table.getColumnModel().getColumn(0).setMaxWidth(23);
		scrollPane.setViewportView(table);
		InstructorsPannel.setLayout(gl_InstructorsPannel);

		JPanel StudentsPannel = new JPanel();
		StudentsPannel.setBackground(Color.WHITE);
		rightPanel.add(StudentsPannel, "name_194332880800");

		JLabel stdnt = new JLabel("Students");
		stdnt.setFont(new Font("Verdana", Font.PLAIN, 12));
		GroupLayout gl_StudentsPannel = new GroupLayout(StudentsPannel);
		gl_StudentsPannel.setHorizontalGroup(gl_StudentsPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_StudentsPannel.createSequentialGroup().addContainerGap()
						.addComponent(stdnt, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(300, Short.MAX_VALUE)));
		gl_StudentsPannel.setVerticalGroup(gl_StudentsPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_StudentsPannel.createSequentialGroup().addContainerGap().addComponent(stdnt)
						.addContainerGap(335, Short.MAX_VALUE)));
		StudentsPannel.setLayout(gl_StudentsPannel);

		JPanel SettingsPannel = new JPanel();
		SettingsPannel.setBackground(Color.WHITE);
		rightPanel.add(SettingsPannel, "name_180654390900");

		JLabel Stngs = new JLabel("Settings");
		Stngs.setFont(new Font("Verdana", Font.PLAIN, 12));

		JSeparator separator = new JSeparator();

		JLabel GeneralInfo = new JLabel("General Info");
		GeneralInfo.setFont(new Font("Verdana", Font.PLAIN, 11));

		JSeparator separator_1 = new JSeparator();

		// sql queries
		String email = null;
		String phone = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management", "root",
					"$$$lamjung$$$@@@");

			Statement st = (Statement) con.createStatement();
			String displayQ = "select*from " + usermode + " where username = '" + uName + "';";
			ResultSet rs = st.executeQuery(displayQ);
			if (rs.next()) {
				email = rs.getString("email");
				phone = rs.getString("phone");
				st.close();
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e1) {
			System.out.println(e1);
		}
		;

		JLabel Username = new JLabel("Username");
		Username.setFont(new Font("Verdana", Font.PLAIN, 11));

		txtPritam = new JTextField();
		txtPritam.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtPritam.setText(uName);
		txtPritam.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 11));

		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField.setText(email);
		textField.setColumns(10);

		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Verdana", Font.PLAIN, 11));

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		textField_1.setText(phone);
		textField_1.setColumns(10);

		JLabel GeneralInfo_1 = new JLabel("Security & Login");
		GeneralInfo_1.setFont(new Font("Verdana", Font.PLAIN, 11));

		JSeparator separator_1_1 = new JSeparator();

		JButton ChangeDetails = new JButton("Change Details");
		ChangeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management",
							"root", "$$$lamjung$$$@@@");

					Statement st2 = (Statement) con1.createStatement();
					String query = "select*from " + usermode + " where username = '" + uName + "';";

					ResultSet rs1 = st2.executeQuery(query);

					rs1.next();
					if (rs1.getString("phone").equals(textField_1.getText())) {
						JOptionPane.showMessageDialog(ChangeDetails, "Phone number already used!!!");
					} else if (rs1.getString("email").equals(textField.getText())) {
						JOptionPane.showMessageDialog(ChangeDetails, "Email already used!!!");
					} else if (rs1.getString("username").equals(txtPritam.getText())) {
						JOptionPane.showMessageDialog(ChangeDetails, "Username already used!!!");
					} else {
						String exeQ = "update " + usermode
								+ " set username =  ? , email = ?, phone =? where username = ?;";

						PreparedStatement preparedStmt = con1.prepareStatement(exeQ);
						preparedStmt.setString(1, txtPritam.getText());
						preparedStmt.setString(2, textField.getText());
						preparedStmt.setString(3, textField_1.getText());
						preparedStmt.setString(4, uName);

						preparedStmt.executeUpdate();
						JOptionPane.showMessageDialog(ChangeDetails, "Updated successfully!!!");
					}

				} catch (ClassNotFoundException | SQLException e1) {
					System.out.println(e1);
				}
				;
			}
		});
		ChangeDetails.setBackground(Color.WHITE);
		ChangeDetails.setFont(new Font("Verdana", Font.PLAIN, 11));

		JLabel lblNewLabel_1 = new JLabel("Old Password");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 11));

		JLabel lblNewLabel_1_1 = new JLabel("New Password");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));

		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Verdana", Font.PLAIN, 11));

		JButton ChangeDetails_1 = new JButton("Change Password");
		ChangeDetails_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management",
							"root", "$$$lamjung$$$@@@");

					Statement st = (Statement) con.createStatement();
					String displayQ = "select*from " + usermode + " where username = '" + uName + "';";

					ResultSet rs = st.executeQuery(displayQ);
					if (rs.next()) {
						if (rs.getString("password").equals(String.valueOf(passwordField.getPassword()))) {
							st.close();

							String exeQ = "update " + usermode + " set password =  ? where username = ?;";

							PreparedStatement preparedStmt = con.prepareStatement(exeQ);
							preparedStmt.setString(1, String.valueOf(passwordField_1.getPassword()));
							preparedStmt.setString(2, uName);

							preparedStmt.executeUpdate();
							JOptionPane.showMessageDialog(ChangeDetails_1, "Password change successful.");
						} else {
							JOptionPane.showMessageDialog(ChangeDetails_1, "Entered wrong old password");
						}
					}

				} catch (ClassNotFoundException | SQLException e1) {
					System.out.println(e1);
				}
				;
			}
		});
		ChangeDetails_1.setBackground(Color.WHITE);
		ChangeDetails_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		GroupLayout gl_SettingsPannel = new GroupLayout(SettingsPannel);
		gl_SettingsPannel.setHorizontalGroup(gl_SettingsPannel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SettingsPannel.createSequentialGroup().addContainerGap().addGroup(gl_SettingsPannel
						.createParallelGroup(Alignment.LEADING)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
						.addComponent(Stngs, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(GeneralInfo, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(ChangeDetails)
						.addGroup(gl_SettingsPannel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(separator_1_1, Alignment.LEADING).addComponent(GeneralInfo_1,
										Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
						.addGroup(gl_SettingsPannel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_SettingsPannel.createSequentialGroup()
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 87,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(passwordField))
								.addGroup(
										Alignment.LEADING,
										gl_SettingsPannel.createSequentialGroup()
												.addComponent(lblPhoneNo, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField_1))
								.addGroup(Alignment.LEADING,
										gl_SettingsPannel.createSequentialGroup()
												.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField))
								.addGroup(Alignment.LEADING, gl_SettingsPannel.createSequentialGroup()
										.addGroup(gl_SettingsPannel.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(Username, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(separator_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														72, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(txtPritam,
												GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_SettingsPannel.createSequentialGroup()
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 87,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(passwordField_1,
										GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addComponent(ChangeDetails_1)).addContainerGap()));
		gl_SettingsPannel
				.setVerticalGroup(gl_SettingsPannel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_SettingsPannel.createSequentialGroup().addGap(14).addComponent(Stngs)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(GeneralInfo)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_SettingsPannel.createParallelGroup(Alignment.BASELINE)
										.addComponent(Username).addComponent(txtPritam, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_SettingsPannel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_SettingsPannel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPhoneNo, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(ChangeDetails)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(GeneralInfo_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(separator_1_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_SettingsPannel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_SettingsPannel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 15,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 21,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(ChangeDetails_1,
										GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(44, Short.MAX_VALUE)));
		SettingsPannel.setLayout(gl_SettingsPannel);

		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_rightPanel.show(rightPanel, "name_162405953000");
			}
		});
		btnNewButton.setIcon(new ImageIcon(
				"C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\dashboard.png"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));

		JLabel lblNewLabel = new JLabel("Course Management System");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));

		JButton btnNewButton_1 = new JButton("Courses");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_rightPanel.show(rightPanel, "name_180654390901");

			}
		});
		btnNewButton_1.setIcon(new ImageIcon(
				"C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\homework.png"));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));

		JButton btnNewButton_2 = new JButton("Instructors");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_rightPanel.show(rightPanel, "name_191777514200");

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management",
							"root", "$$$lamjung$$$@@@");
					System.out.println("connection successful!!!");
					Statement st = (Statement) con.createStatement();

					DefaultTableModel model = (DefaultTableModel) table.getModel();

					String displayQ = "SELECT * FROM instructor";
					ResultSet res = st.executeQuery(displayQ);
					while (res.next()) {
						String id = res.getString("instructor_id");
						String insName = res.getString("username");
						String emailDb = res.getString("email");

						model.addRow(new Object[] { id, insName, emailDb });

					}

				} catch (ClassNotFoundException | SQLException e1) {
					System.out.println(e1);
				}
				;
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(
				"C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\teacher.png"));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 12));

		JButton btnNewButton_3 = new JButton("Students");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_rightPanel.show(rightPanel, "name_194332880800");
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(
				"C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\graduation.png"));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 12));

		JButton btnNewButton_4 = new JButton("Mail");
		btnNewButton_4.setIcon(new ImageIcon(
				"C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\email.png"));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 12));

		JButton btnNewButton_5 = new JButton("Settings");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_rightPanel.show(rightPanel, "name_180654390900");
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(
				"C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\settings.png"));
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 12));

		JButton btnNewButton_6 = new JButton("Log Out");
		btnNewButton_6.setIcon(new ImageIcon(
				"C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\log-out.png"));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LogIn();
				frame.setVisible(false);
			}
		});
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Verdana", Font.PLAIN, 12));

		JLabel iconLabel = new JLabel("");
		iconLabel.setIcon(new ImageIcon(
				"C:\\Users\\ACER NITRP-5\\Desktop\\EclipseJava\\object-orinted\\course-management-system\\img\\course.png"));
		GroupLayout gl_sidePanel = new GroupLayout(sidePanel);
		gl_sidePanel.setHorizontalGroup(gl_sidePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_sidePanel.createSequentialGroup()
						.addGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_sidePanel.createSequentialGroup().addContainerGap()
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
								.addGroup(gl_sidePanel.createSequentialGroup().addGap(77).addComponent(iconLabel))
								.addGroup(gl_sidePanel.createSequentialGroup().addGap(22)
										.addGroup(gl_sidePanel.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnNewButton, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_1, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_2, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_3, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_4, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_5, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_6, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap()));
		gl_sidePanel.setVerticalGroup(gl_sidePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_sidePanel.createSequentialGroup().addContainerGap()
						.addComponent(iconLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblNewLabel).addGap(18)
						.addComponent(btnNewButton).addGap(10)
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
						.addContainerGap(28, Short.MAX_VALUE)));
		sidePanel.setLayout(gl_sidePanel);

		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
