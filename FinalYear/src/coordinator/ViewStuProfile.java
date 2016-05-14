package coordinator;

import java.io.File;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.student.Students;

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
public class ViewStuProfile extends JFrame {

	JFrame frame1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
					ViewStuProfile window = new ViewStuProfile();
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
	public ViewStuProfile() {
		initialize();
	}
	
	public ViewStuProfile(String x){
		user=x;
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
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
		
		JLabel lblFathersName = new JLabel("Father's Name :");
		lblFathersName.setBounds(24, 80, 135, 14);
		frame1.getContentPane().add(lblFathersName);
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address :");
		lblPermanentAddress.setBounds(24, 130, 135, 14);
		frame1.getContentPane().add(lblPermanentAddress);
		
		JLabel lblPhoneNo = new JLabel("Phone No :");
		lblPhoneNo.setBounds(24, 180, 135, 14);
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
		textField.setBounds(169, 27, 236, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(169, 77, 236, 20);
		frame1.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(169, 127, 236, 20);
		frame1.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(169, 177, 151, 20);
		frame1.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(169, 227, 236, 20);
		frame1.getContentPane().add(textField_4);
		
		
		SessionFactory f=createSessionFactory();
		factory=f;
		Session s=factory.openSession();
		Object ob=s.load(Students.class,new String(user));
		Students stu=(Students) ob;
		textField.setText(stu.getName());
		textField_1.setText(stu.getFname());
		textField_2.setText(stu.getPresentadsress());
		textField_3.setText(stu.getSmobno());
		textField_4.setText(stu.getEmailid());
		picPath=stu.getPic();
		
		imgLabel= new JLabel("Profile Pic");
		imgLabel.setBounds(523, 69, 169, 171);
		frame1.getContentPane().add(imgLabel);
		imgLabel.setIcon(ResizeImage(picPath));
	}
	
	public ImageIcon ResizeImage(String ImagePath)
	{ 

		ImageIcon MyImage = new ImageIcon(ImagePath); 
		Image img = MyImage.getImage(); 
		Image newImg = img.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon image = new ImageIcon(newImg); 
		return image; 
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
