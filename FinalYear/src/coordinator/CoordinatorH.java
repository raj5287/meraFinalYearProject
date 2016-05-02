package coordinator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.student.Launcher;

import teacher.UploadDoc;

import javax.swing.JComboBox;


public class CoordinatorH {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoordinatorH window = new CoordinatorH();
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
	public CoordinatorH() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Logged in as::"+Launcher.set_User);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 827, 475);
		frame.setVisible(true);
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
				View_Profile p=new View_Profile(Launcher.set_User);
				
			}
		});
		btnProfile.setBounds(31, 27, 141, 23);
		frame.getContentPane().add(btnProfile);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			@SuppressWarnings("unused")
			View_Schedule a= new View_Schedule();
			}
		});
		btnSchedule.setBounds(31, 79, 141, 23);
		frame.getContentPane().add(btnSchedule);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
			//	LogIn li=new LogIn();
			//	li.initialize();
				JOptionPane.showMessageDialog(null, "Log Out");
				frame.dispose();
				
				
			}
		});
		btnLogout.setBounds(31, 363, 141, 23);
		frame.getContentPane().add(btnLogout);
		
		JButton btnNewButton_1 = new JButton("Upload ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//new Coo_upload();
			}
		});
		btnNewButton_1.setBounds(31, 310, 141, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("View Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(31, 171, 141, 23);
		frame.getContentPane().add(btnNewButton);
		String[] ss={"Student Info","Teacher Info","Visiting Faculty Info"};
		JComboBox comboBox = new JComboBox(ss);
		comboBox.setBounds(31, 127, 141, 20);
		frame.getContentPane().add(comboBox);
		
		String []s1={"Notice","Notes","Attendence","Seminar","Placement","Project"};
		JComboBox comboBox_1 = new JComboBox(s1);
		comboBox_1.setBounds(31, 219, 141, 20);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnViewDocuments = new JButton("View ");
		btnViewDocuments.setBounds(31, 260, 141, 23);
		frame.getContentPane().add(btnViewDocuments);
	}
}
