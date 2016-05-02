package teacher;

import java.io.File;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.student.Students;

import coordinator.EditCProfile;

import javax.swing.border.BevelBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class View_Profile {

	JFrame frame1;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;
	private SessionFactory factory;
	static String picPath;
	JLabel imgLabel ;
	String user;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Profile window = new View_Profile();
				window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View_Profile() {
		initialize();
	}
	public View_Profile(String x){
		user=x;
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	
	@SuppressWarnings("static-access")
	void initialize() {
		frame1 = new JFrame("Profile");
		frame1.getContentPane().setBackground(Color.WHITE);
				
//		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg1.png")))));
			
				
		frame1.setVisible(true);
		frame1.setBounds(100, 100, 794, 462);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(24, 30, 135, 14);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblPhoneNo = new JLabel("Phone No :");
		lblPhoneNo.setBounds(24, 137, 110, 14);
		frame1.getContentPane().add(lblPhoneNo);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setBounds(24, 230, 135, 14);
		frame1.getContentPane().add(lblEmailId);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame1.dispose();
			}
		});
		btnBack.setBounds(563, 343, 89, 23);
		frame1.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(169, 27, 149, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(169, 134, 149, 20);
		frame1.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(169, 227, 189, 20);
		frame1.getContentPane().add(textField_4);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setBounds(24, 183, 99, 14);
		frame1.getContentPane().add(lblDepartment);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(169, 180, 149, 20);
		frame1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("User Id:");
		lblNewLabel_1.setBounds(30, 83, 46, 14);
		frame1.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(169, 80, 86, 20);
		frame1.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		SessionFactory f=createSessionFactory();
		factory=f;
		Session s=factory.openSession();
		Object ob=s.load(Teachers.class,new String(user));
		Teachers tea=(Teachers) ob;
		textField.setText(tea.getName());
		textField_1.setText(tea.getDepartment());
		textField_2.setText(tea.getUserid());
		textField_3.setText(tea.getMobno());
		textField_4.setText(tea.getEmail());
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new EditTProfile(user);
				frame1.dispose();
			}
		});
		btnEdit.setBounds(336, 343, 89, 23);
		frame1.getContentPane().add(btnEdit);		
		
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
