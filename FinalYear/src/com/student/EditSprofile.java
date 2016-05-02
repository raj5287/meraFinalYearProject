package com.student;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
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

import teacher.Teachers;

public class EditSprofile {

	private JFrame frame1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private SessionFactory factory;
	static String picPath;
	JLabel imgLabel ;
	String user;
	private JButton Save;
	String name,fname,email,smobno,presentAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditSprofile window = new EditSprofile();
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
	public EditSprofile() {
		initialize();
	}
	public EditSprofile(String x){
		user=x;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame("Edit Profile");
		frame1.setVisible(true);
		frame1.setBounds(100, 100, 794, 462);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(24, 30, 135, 14);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblFathersName = new JLabel("Father's Name :");
		lblFathersName.setBounds(24, 80, 135, 14);
		frame1.getContentPane().add(lblFathersName);
		
		JLabel lblPermanentAddress = new JLabel("Present Address :");
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
		textField.setBounds(169, 27, 236, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 77, 236, 20);
		frame1.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 127, 236, 20);
		frame1.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 177, 151, 20);
		frame1.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
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
		s.close();
		
		imgLabel= new JLabel("Profile Pic");
		imgLabel.setBounds(523, 69, 169, 171);
		frame1.getContentPane().add(imgLabel);
		imgLabel.setIcon(ResizeImage(picPath));
		
		Save = new JButton("Save");
		Save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name=textField.getText();
				fname=textField_1.getText();
				presentAddress=textField_2.getText();
				smobno=textField_3.getText();
				email=textField_4.getText();
				SessionFactory factory=createSessionFactory();
				Session s=factory.openSession();
				Transaction tr= s.beginTransaction();
				Object ob=s.load(Students.class,new String(user));
				Students stu=(Students) ob;
				stu.setName(name);
				stu.setEmailid(email);
				stu.setSmobno(smobno);
				stu.setFname(fname);
				stu.setPresentadsress(presentAddress);
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