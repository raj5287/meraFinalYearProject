package com.student;
import coordinator.ViewDocumentFrame;
import coordinator.ViewNoticeFrame;

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

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

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
public class Stu_Main {

	private JFrame frame1;
	private SessionFactory factory;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stu_Main window = new Stu_Main();
				window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Stu_Main() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	
	@SuppressWarnings("static-access")
	void initialize() {
		frame1 = new JFrame("SIS ");
		frame1.getContentPane().setBackground(Color.WHITE);
				
//		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg1.png")))));
			
				
		frame1.setVisible(true);
		frame1.setBounds(100, 100, 818, 489);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 188, 450);
		frame1.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ViewProfile p=new ViewProfile();
			}
		});
		btnProfile.setBounds(39, 26, 103, 23);
		panel.add(btnProfile);
		
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				View_Schedule a= new View_Schedule();
			}
		});
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSchedule.setBounds(39, 72, 103, 23);
		panel.add(btnSchedule);
		
		JButton btnResult = new JButton("Result");
		btnResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				View_Result1 a=new View_Result1();
			}
		});
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnResult.setBounds(39, 117, 103, 23);
		panel.add(btnResult);
		
		JButton btnNotice = new JButton("Notice");
		btnNotice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SessionFactory factory=createSessionFactory();
				ViewNoticeFrame a= new ViewNoticeFrame("Notices",factory);
			}
		});
		btnNotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNotice.setBounds(39, 165, 103, 23);
		panel.add(btnNotice);
		
		JButton btnMap = new JButton("Map");
		btnMap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				View_Map a =new View_Map();
			}
		});
		btnMap.setBounds(39, 218, 103, 23);
		panel.add(btnMap);
		
		JButton btnDocuments = new JButton("Documents");
		btnDocuments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SessionFactory factory=createSessionFactory();
				ViewDocumentFrame a= new ViewDocumentFrame("Documents",factory);
				
			}
		});
		btnDocuments.setBounds(39, 268, 103, 23);
		panel.add(btnDocuments);
		
		JButton btnFee = new JButton("Fee");
		btnFee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				View_Fee f=new View_Fee();
			}
		});
		btnFee.setBounds(39, 315, 103, 23);
		panel.add(btnFee);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Launcher li=new Launcher();
				li.initialize();
				JOptionPane.showMessageDialog(null, "Log Out");
				JFrame frame = null;
				frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
			}
		});
		btnLogout.setBounds(39, 370, 103, 23);
		panel.add(btnLogout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(186, 0, 606, 450);
		frame1.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(109, 80, 341, 256);
		panel_1.add(lblNewLabel);	
		
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
