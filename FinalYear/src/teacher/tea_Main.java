package teacher;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tea_Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tea_Main window = new tea_Main();
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
	public tea_Main() {
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
		panel.setBounds(165, 0, 646, 436);
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
		btnProfile.setBounds(31, 27, 102, 23);
		frame.getContentPane().add(btnProfile);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			@SuppressWarnings("unused")
			View_Schedule a= new View_Schedule();
			}
		});
		btnSchedule.setBounds(31, 70, 102, 23);
		frame.getContentPane().add(btnSchedule);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		@SuppressWarnings("unused")
		View_Result1 a=new View_Result1();
			}
		});
		btnResult.setBounds(31, 119, 102, 23);
		frame.getContentPane().add(btnResult);
		
		JButton btnFee = new JButton("Fee");
		btnFee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			@SuppressWarnings("unused")
			View_Fee f=new View_Fee();
			}
		});
		btnFee.setBounds(31, 305, 102, 23);
		frame.getContentPane().add(btnFee);
		
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
		btnLogout.setBounds(31, 358, 102, 23);
		frame.getContentPane().add(btnLogout);
		
		JButton btnDocuments = new JButton("Documents");
		btnDocuments.setBounds(31, 216, 102, 23);
		frame.getContentPane().add(btnDocuments);
		
		JButton btnNotice = new JButton("Notice");
		btnNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNotice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			@SuppressWarnings("unused")
			View_Notice a= new View_Notice();
			}
		});
		btnNotice.setBounds(31, 167, 102, 23);
		frame.getContentPane().add(btnNotice);
		
		JButton btnupload = new JButton("Upload");
		btnupload.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			@SuppressWarnings("unused")
			tea_upload_doc c=new tea_upload_doc();
			}
		});
		btnupload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnupload.setBounds(31, 262, 102, 23);
		frame.getContentPane().add(btnupload);
	}
}
