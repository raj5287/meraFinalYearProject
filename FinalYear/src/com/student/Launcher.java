
package com.student;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.IOException;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.UIManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class Launcher extends JFrame {

	private JFrame frame;
	
	private JPasswordField pf1;
	String us;
	int count=0,flag=0,f;
	private JTextField tf1;
	private SessionFactory factory;
	public static String set_User;
	static Launcher window;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Launcher();
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
	public Launcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "static-access", "rawtypes", "unchecked" }) void initialize() {
	    frame = new JFrame("SIS");
		
		frame.setFont(new Font("Times New Roman", Font.BOLD, 48));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 720, 480);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("TECHNO INDIA");
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 48));
		lbl1.setBounds(10, 11, 500, 97);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setBackground(Color.WHITE);
		Image img=new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		lbl3.setIcon(new ImageIcon(img));
		lbl3.setBounds(10, 145, 411, 285);
		frame.getContentPane().add(lbl3);
		
		JLabel lbl2 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/ticon.png")).getImage();
		lbl2.setIcon(new ImageIcon(img1));
		lbl2.setBounds(571, 11, 112, 97);
		frame.getContentPane().add(lbl2);
		
		String[] fname = {"Admin","HOD","Coordinator","Teacher","Student"};
		
		JComboBox comboBox1;
		comboBox1= new JComboBox(fname);
		comboBox1.setBackground(Color.WHITE);
		comboBox1.setBounds(541, 145, 142, 32);
		frame.getContentPane().add(comboBox1);
		
		pf1 = new JPasswordField("");
		pf1.setBounds(541, 241, 142, 32);
		frame.getContentPane().add(pf1);
		
		JLabel lbl4 = new JLabel("Login As");
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl4.setBounds(427, 145, 93, 32);
		frame.getContentPane().add(lbl4);
		
		JLabel lbl5 = new JLabel("Password");
		lbl5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl5.setBounds(427, 241, 83, 32);
		frame.getContentPane().add(lbl5);
		
		JButton btn1 = new JButton("Login");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.addActionListener((evt)-> {
			
			
			String userid=tf1.getText();
			String pass=new String (pf1.getPassword());
			
			SessionFactory f=createSessionFactory();
			factory=f;
			Session s=factory.openSession();
			String hql="from Students";
			Query q=s.createQuery(hql);
			
			List<Students> list=q.list();
			
			String records[][]=new String[list.size()][2];
			int r=0;
			for(Students rr : list){
				records[r][0]=rr.getEmailid();
				records[r][1]=rr.getPassword();
				if(userid.equals(records[r][0]) && pass.equals(records[r][1])){
					flag=1;
					set_User=userid;
					System.out.println("Login successful");
					//create the object of next window here
					new Stu_Main();
					System.out.println("avb");
					
				}
				else{
						System.out.println("Login not successful");
						r++;
					}
			}
			
		});
		btn1.setBounds(431, 323, 103, 32);
		frame.getContentPane().add(btn1);
		
		JLabel lbl6 = new JLabel("Forgot Password??");
		lbl6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 ForgetPass a = new ForgetPass();
				        
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lbl6.setForeground(new java.awt.Color(240, 100, 80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl6.setForeground(new java.awt.Color(0, 0, 0));
			}
		});
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setBounds(486, 378, 130, 14);
		frame.getContentPane().add(lbl6);
		
		JButton btn2 = new JButton("Close");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(571, 323, 93, 32);
		frame.getContentPane().add(btn2);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserId.setBounds(427, 200, 83, 30);
		frame.getContentPane().add(lblUserId);
		
		tf1 = new JTextField();
		tf1.setBounds(540, 200, 143, 32);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblRegisterHere = new JLabel("Register Here !!!");
		lblRegisterHere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Stu_Regis sr=new Stu_Regis();
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblRegisterHere.setForeground(new java.awt.Color(240, 100, 80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblRegisterHere.setForeground(new java.awt.Color(0, 0, 0));
			}
		});
		lblRegisterHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterHere.setBounds(496, 403, 103, 14);
		frame.getContentPane().add(lblRegisterHere);
		
	}
	/*@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		if(!tf1.getText().equals("")){
            if(!pf1.getText().equals("")){
               // getConnection();
            }else{JOptionPane.showMessageDialog(null, "Enter Password");}
        }else{JOptionPane.showMessageDialog(null, "Enter User Name");}
    }*/
	
	
	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	            configuration.getProperties()).build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    return sessionFactory;
	}
}