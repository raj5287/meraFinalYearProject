package teacher;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.student.Launcher;

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
import javax.swing.JComboBox;

public class TeacherHome {

	private JFrame frame;
	int u=0;

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
			JOptionPane.showMessageDialog(null, "Log Out");
				frame.dispose();
				
				
			}
		});
		btnLogout.setBounds(31, 341, 113, 23);
		frame.getContentPane().add(btnLogout);
		
		JButton btnNewButton_1 = new JButton("Upload");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new UploadDoc();
			}
		});
		btnNewButton_1.setBounds(31, 194, 113, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnStudentInfo = new JButton("Student Info");
		btnStudentInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SearchStudent();
				System.out.println("MOuse Clicked");
			}
		});
		btnStudentInfo.setBounds(31, 133, 113, 23);
		frame.getContentPane().add(btnStudentInfo);
		
		String[] view={"Attendance Sheet","Notices","Notes"};
		JComboBox comboBox = new JComboBox(view);
		comboBox.setBounds(31, 249, 113, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String viewing = (String) comboBox.getSelectedItem();
				if(viewing.equals("Attendance Sheet"))
        		{
        			u=1;
        		}
        		else if(viewing.equals("Notices")){
        			u=2;
        		}
        		else if(viewing.equals("Notes")){
        			u=3;
        		}
				System.out.println(u);
				switch(u){
					case 1:
						new ViewAttendanceFrame("Attendance Sheet",createSessionFactory());
						break;
					case 2:
						new ViewNoticeFrame("Notice",createSessionFactory());
						break;
					case 3:
						new ViewNotesFrame("Notes",createSessionFactory());
						break;
				}
			}
		});
		btnNewButton.setBounds(31, 291, 113, 23);
		frame.getContentPane().add(btnNewButton);
	}
	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	            configuration.getProperties()).build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    return sessionFactory;
	}
}
