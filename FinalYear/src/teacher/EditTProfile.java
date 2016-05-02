package teacher;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import coordinator.Coordinators;
import coordinator.EditCProfile;

public class EditTProfile {
	JFrame frame1;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;
	private JButton Save;
	String name,email,mobno,dept,user;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditTProfile window = new EditTProfile();
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
	public EditTProfile() {
		initialize();
	}
	public EditTProfile(String x) {
		user=x;
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	
	@SuppressWarnings("static-access")
	void initialize() {
		frame1 = new JFrame("Edit Profile");
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
		textField.setBounds(169, 27, 149, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 134, 149, 20);
		frame1.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 227, 228, 20);
		frame1.getContentPane().add(textField_4);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setBounds(24, 183, 99, 14);
		frame1.getContentPane().add(lblDepartment);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 180, 149, 20);
		frame1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("User Id:");
		lblNewLabel_1.setBounds(24, 83, 46, 14);
		frame1.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(169, 80, 149, 20);
		textField_2.setEditable(false);
		frame1.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		SessionFactory factory=createSessionFactory();
		Session s=factory.openSession();
		Object ob=s.load(Teachers.class,new String(user));
		Teachers tea=(Teachers) ob;
		textField.setText(tea.getName());
		textField_1.setText(tea.getDepartment());
		textField_2.setText(tea.getUserid());
		textField_3.setText(tea.getMobno());
		textField_4.setText(tea.getEmail());
		s.close();
		
		Save = new JButton("Save");
		Save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name=textField.getText();
				dept=textField_1.getText();
				mobno=textField_3.getText();
				email=textField_4.getText();
				SessionFactory factory=createSessionFactory();
				Session s=factory.openSession();
				Transaction tr= s.beginTransaction();
				Object ob=s.load(Teachers.class,new String(user));
				Teachers t =(Teachers) ob;
				t.setDepartment(dept);
				t.setEmail(email);
				t.setMobno(mobno);
				t.setName(name);
				System.out.println("data inserted");
				tr.commit();
				s.close();
				factory.close();
				JOptionPane.showMessageDialog(null, "Your Data Has Been Updated Successfully");
				frame1.dispose();
			}
		});
		Save.setBounds(339, 343, 89, 23);
		frame1.getContentPane().add(Save);
		
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
