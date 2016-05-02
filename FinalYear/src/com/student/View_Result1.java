package com.student;

import java.io.File;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.swing.border.BevelBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class View_Result1 extends JFrame {

	private JFrame frame1;
	@SuppressWarnings("rawtypes")
	private JComboBox viewcomboBox;
	private JTextField sourceFileTextField;
	String user,destination,sem,myDate,folderLocation;
	static String fileName;
	Path sourcePath,destinationPath;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Result1 window = new View_Result1();
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
	public View_Result1() {
		initialize();
	}
	public View_Result1(String x) {
		user=x;
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	void initialize() {
		frame1 = new JFrame("Result ");
		frame1.getContentPane().setBackground(Color.WHITE);
				
//		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg1.png")))));
			
				
		frame1.setVisible(true);
		frame1.setBounds(100, 100, 794, 462);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblPic = new JLabel("View Marksheet");
		lblPic.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPic.setBounds(36, 215, 106, 14);
		frame1.getContentPane().add(lblPic);
		
		JButton btnBack = new JButton("Submit");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Result_Show a=new View_Result_Show();
			}
		});
		btnBack.setBounds(394, 211, 89, 23);
		frame1.getContentPane().add(btnBack);
		String s[]={"Select Semester","1","2","3","4","5","6","7","8"};
		viewcomboBox = new JComboBox(s);
		viewcomboBox.setBounds(189, 212, 125, 20);
		frame1.getContentPane().add(viewcomboBox);
		
		JLabel lblUpload = new JLabel("Upload Marksheet");
		lblUpload.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblUpload.setBounds(36, 36, 137, 14);
		frame1.getContentPane().add(lblUpload);
		
		sourceFileTextField = new JTextField();
		sourceFileTextField.setBounds(183, 33, 252, 20);
		frame1.getContentPane().add(sourceFileTextField);
		sourceFileTextField.setColumns(10);
		
		JComboBox upComboBox = new JComboBox(s);
		upComboBox.setBounds(518, 33, 137, 20);
		frame1.getContentPane().add(upComboBox);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();
		          jFileChooser.setDialogTitle("SAVE");
		          int status = jFileChooser.showOpenDialog(View_Result1.this);
		         jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "*.jpg","*.gif","*.png");
		          jFileChooser.addChoosableFileFilter(filter);
		          String filename = jFileChooser.getSelectedFile().getAbsolutePath();
					File file1 = new File(filename);
					fileName = file1.getName();
					System.out.print(fileName);
					if (status == JFileChooser.APPROVE_OPTION) {
						String selectedFilePath = jFileChooser.getSelectedFile().getAbsolutePath();
						sourceFileTextField.setText(selectedFilePath);
					}
					SessionFactory factory=createSessionFactory();
					Session s=factory.openSession();
					Object ob=s.load(Students.class,new String(user));
					Students stu=(Students) ob;
					folderLocation=stu.getFlocation();
					s.close();
					factory.close();
					System.out.println(folderLocation);
					
			}
		});
		btnBrowse.setBounds(225, 109, 89, 23);
		frame1.getContentPane().add(btnBrowse);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				sem = (String) upComboBox.getSelectedItem();
				System.out.println(sem);
				SessionFactory factory1=createSessionFactory();
				Session s1=factory1.openSession();
				SemMarksheet ob1 =new SemMarksheet();
				File sourceFile = new File(sourceFileTextField.getText());
				destination = folderLocation+"/"+ fileName;

				File destinationFile = new File(destination);
				sourcePath = sourceFile.toPath();
				destinationPath = destinationFile.toPath();
				myDate = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
				
				try {
					Files.copy(sourcePath, destinationPath);
					ob1.setName(user+fileName);
					ob1.setLocation(destination);
					ob1.setDate(myDate);
					ob1.setSem(sem);
					System.out.print("File Copied");
				} catch (IOException ex) {
					ex.printStackTrace();
					System.out.print("File NOt Copied");
				}
				Transaction tr= s1.beginTransaction();
				s1.save(ob1);
				System.out.println("data inserted");
				tr.commit();
				s1.close();
				factory1.close();
				
				JOptionPane.showMessageDialog(null, "File Uploaded Successfully");
				frame1.dispose();
			}
		});
		btnUpload.setBounds(394, 109, 89, 23);
		frame1.getContentPane().add(btnUpload);
		
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblOr.setBounds(194, 161, 46, 14);
		frame1.getContentPane().add(lblOr);		
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
