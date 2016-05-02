package coordinator;

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
import javax.swing.JOptionPane;
import javax.swing.border.SoftBevelBorder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.student.Students;

import teacher.Teachers;

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
public class EditCProfile {

	JFrame frame1;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;
	private JButton Save;
	String name,userid,email,mobno,dept,user;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditCProfile window = new EditCProfile();
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
	public EditCProfile() {
		initialize();
	}

	public EditCProfile(String x) {
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
		lblEmailId.setBounds(24, 188, 94, 14);
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
		textField_4.setBounds(169, 185, 228, 20);
		frame1.getContentPane().add(textField_4);
		
		lblNewLabel_1 = new JLabel("User Id:");
		lblNewLabel_1.setBounds(24, 83, 46, 14);
		frame1.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(169, 80, 149, 20);
		frame1.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		SessionFactory factory=createSessionFactory();
		Session s=factory.openSession();
		Object ob=s.load(Coordinators.class,new String(user));
		Coordinators tea=(Coordinators) ob;
		textField.setText(tea.getName());
		textField_2.setText(tea.getUserid());
		textField_3.setText(tea.getMobno());
		textField_4.setText(tea.getEmail());
		s.close();
		
		Save = new JButton("Save");
		Save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name=textField.getText();
				mobno=textField_3.getText();
				email=textField_4.getText();
				SessionFactory factory=createSessionFactory();
				Session s=factory.openSession();
				Transaction tr= s.beginTransaction();
				Object ob=s.load(Coordinators.class,new String(user));
				Coordinators c =(Coordinators) ob;
				c.setEmail(email);
				c.setMobno(mobno);
				c.setName(name);
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
