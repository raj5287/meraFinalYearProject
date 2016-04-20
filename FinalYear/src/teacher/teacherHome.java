package teacher;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import coordinator.SearchStudent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TeacherHome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherHome window = new TeacherHome();
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
	public TeacherHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("SIS");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 827, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(182, 0, 629, 436);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		Image img=new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(157, 79, 283, 244);
		panel.add(lblNewLabel);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
		
				@SuppressWarnings("unused")
				View_Profile p=new View_Profile();
				
			}
		});
		btnProfile.setBounds(31, 27, 113, 23);
		frame.getContentPane().add(btnProfile);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			@SuppressWarnings("unused")
			View_Schedule a= new View_Schedule();
			}
		});
		btnSchedule.setBounds(31, 79, 113, 23);
		frame.getContentPane().add(btnSchedule);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
			//	LogIn li=new LogIn();
			//	li.initialize();
				JOptionPane.showMessageDialog(null, "Log Out");
				frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
				
				
			}
		});
		btnLogout.setBounds(31, 324, 113, 23);
		frame.getContentPane().add(btnLogout);
		
		JButton btnDocuments = new JButton("Upload Documents");
		btnDocuments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new UploadDoc();
			}
		});
		btnDocuments.setBounds(31, 257, 113, 23);
		frame.getContentPane().add(btnDocuments);
		
		JButton btnNewButton_1 = new JButton("Upload Notice");
		btnNewButton_1.setBounds(31, 195, 113, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnStudentInfo = new JButton("Student Info");
		btnStudentInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SearchStudent();
				System.out.println("MOuse Clicked");
			}
		});
		btnStudentInfo.setBounds(31, 132, 113, 23);
		frame.getContentPane().add(btnStudentInfo);
	}
}
