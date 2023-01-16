package tutorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraphicalUser {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphicalUser window = new GraphicalUser();
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
	public GraphicalUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Herald Application");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUp();
				frame.setVisible(false);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Our Courses");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Bsc(Hons) Computer Science");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JTextArea txtrBeginningYourCollege = new JTextArea();
		txtrBeginningYourCollege.setLineWrap(true);
		txtrBeginningYourCollege.setBackground(SystemColor.menu);
		txtrBeginningYourCollege.setText("Beginning your college journey is a very personal and sacred experience that encompases a wide range of events compounding towards your growth. Herald college kathmandu(HCK) provides the best UK University education ad most affordable fees.");
		
		JButton btnNewButton_1 = new JButton("Sign In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("sign in clicked");
				new SignIn();
				frame.setVisible(false);
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("More Info...");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("More info clicked...");
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
									.addComponent(btnNewButton)
									.addGap(18)
									.addComponent(btnNewButton_1))
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtrBeginningYourCollege, 0, 0, Short.MAX_VALUE))))))
					.addGap(47))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(26)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrBeginningYourCollege, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
