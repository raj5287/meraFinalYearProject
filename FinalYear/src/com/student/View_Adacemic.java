package com.student;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class View_Adacemic {

	private JFrame frame;
	private JTextField sem1;
	private JTextField sem2;
	private JTextField sem3;
	private JTextField sem4;
	private JTextField sem5;
	private JTextField sem6;
	private JTextField sem7;
	private JTextField sem8;
	private JTextField dNou;	//name of university for diploma
	private JTextField dStream;	//stream for diploma
	private JTextField dYop;	//year of passing for diploma
	private JTextField dPer;	//marks in diploma
	private JTextField twNoe;	//name of examination for twelfth
	private JTextField twYop;	//year of passing for twelfth
	private JTextField twBoard;	//board of passing for twelfth
	private JTextField twSname;	//name of school for twelfth
	private JTextField twMos;	//medium of study in twelfth
	private JTextField twSper;	//standard marks in twelfth
	private JTextField twAper;	//actual marks in twelfth
	private JTextField tNoe;	//name of examination for tenth
	private JTextField tYop;	//year of passing for twelfth
	private JTextField tBoard;	//board of passing for twelfth
	private JTextField tSname;	//name of school for twelfth
	private JTextField tMos;	//medium of study in twelfth
	private JTextField tSper;	//standard marks in twelfth
	private JTextField tAper;	//actual marks in twelfth
	String user;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Adacemic window = new View_Adacemic();
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
	public View_Adacemic() {
		initialize();
	}
	public View_Adacemic(String x){
		user=x;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Academic Info");
		frame.setBounds(100, 100, 873, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 778, 423);
		frame.setVisible(true);
		frame.getContentPane().add(tabbedPane_1);
		tabbedPane_1.addTab("Academic", null, tabbedPane, null);
		
		JPanel panel22 = new JPanel();
		panel22.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane.addTab("10th ", null, panel22, null);
		panel22.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Name of Examination :");
		lblNewLabel_16.setBounds(10, 11, 173, 14);
		panel22.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Year of Passing :");
		lblNewLabel_17.setBounds(10, 53, 162, 14);
		panel22.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Board :\r\n");
		lblNewLabel_18.setBounds(10, 94, 162, 14);
		panel22.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("School Name :");
		lblNewLabel_19.setBounds(10, 143, 162, 14);
		panel22.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Medium of Study :");
		lblNewLabel_20.setBounds(10, 186, 162, 14);
		panel22.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Standard (%) :");
		lblNewLabel_21.setBounds(10, 230, 162, 14);
		panel22.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Actual (%) :");
		lblNewLabel_22.setBounds(10, 274, 162, 14);
		panel22.add(lblNewLabel_22);
		
		tNoe = new JTextField();
		tNoe.setEditable(false);
		tNoe.setBounds(182, 8, 151, 20);
		panel22.add(tNoe);
		tNoe.setColumns(10);
		
		tYop = new JTextField();
		tYop.setEditable(false);
		tYop.setBounds(182, 50, 151, 20);
		panel22.add(tYop);
		tYop.setColumns(10);
		
		tBoard = new JTextField();
		tBoard.setEditable(false);
		tBoard.setBounds(182, 91, 151, 20);
		panel22.add(tBoard);
		tBoard.setColumns(10);
		
		tSname = new JTextField();
		tSname.setEditable(false);
		tSname.setBounds(182, 140, 151, 20);
		panel22.add(tSname);
		tSname.setColumns(10);
		
		tMos = new JTextField();
		tMos.setEditable(false);
		tMos.setBounds(182, 183, 151, 20);
		panel22.add(tMos);
		tMos.setColumns(10);
		
		tSper = new JTextField();
		tSper.setEditable(false);
		tSper.setBounds(182, 227, 60, 20);
		panel22.add(tSper);
		tSper.setColumns(10);
		
		tAper = new JTextField();
		tAper.setEditable(false);
		tAper.setBounds(182, 271, 60, 20);
		panel22.add(tAper);
		tAper.setColumns(10);
		
		JButton btnContinue1 = new JButton("Continue");
		btnContinue1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			
			}
		});
		btnContinue1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnContinue1.setBounds(554, 314, 158, 36);
		panel22.add(btnContinue1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane.addTab("12th", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Name of Examination :");
		lblNewLabel_8.setBounds(10, 11, 161, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Year of Passing :");
		lblNewLabel_9.setBounds(10, 50, 120, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Board :");
		lblNewLabel_10.setBounds(10, 91, 120, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("School Name :");
		lblNewLabel_11.setBounds(10, 134, 120, 14);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Medium of Study :");
		lblNewLabel_12.setBounds(10, 180, 120, 14);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Standard (%) :");
		lblNewLabel_13.setBounds(10, 222, 120, 14);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Actual (%) :");
		lblNewLabel_14.setBounds(10, 266, 120, 14);
		panel_1.add(lblNewLabel_14);
		
		twNoe = new JTextField();
		twNoe.setEditable(false);
		twNoe.setBounds(181, 11, 152, 20);
		panel_1.add(twNoe);
		twNoe.setColumns(10);
		
		twYop = new JTextField();
		twYop.setEditable(false);
		twYop.setBounds(181, 47, 152, 20);
		panel_1.add(twYop);
		twYop.setColumns(10);
		
		twBoard = new JTextField();
		twBoard.setEditable(false);
		twBoard.setBounds(181, 88, 152, 20);
		panel_1.add(twBoard);
		twBoard.setColumns(10);
		
		twSname = new JTextField();
		twSname.setEditable(false);
		twSname.setBounds(181, 131, 152, 20);
		panel_1.add(twSname);
		twSname.setColumns(10);
		
		twMos = new JTextField();
		twMos.setEditable(false);
		twMos.setBounds(181, 177, 152, 20);
		panel_1.add(twMos);
		twMos.setColumns(10);
		
		twSper = new JTextField();
		twSper.setEditable(false);
		twSper.setBounds(181, 219, 60, 20);
		panel_1.add(twSper);
		twSper.setColumns(10);
		
		twAper = new JTextField();
		twAper.setEditable(false);
		twAper.setBounds(181, 263, 60, 20);
		panel_1.add(twAper);
		twAper.setColumns(10);
		
		JButton btnContinue2 = new JButton("Continue");
		btnContinue2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(2);				
			}
		});
		btnContinue2.setBounds(565, 320, 147, 36);
		panel_1.add(btnContinue2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane.addTab("Diploma", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Name of University :");
		lblNewLabel_3.setBounds(10, 35, 138, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Stream :");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 78, 138, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Year of Passing :");
		lblNewLabel_5.setBounds(10, 122, 138, 14);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Marks(%) :");
		lblNewLabel_6.setBounds(10, 171, 138, 14);
		panel_2.add(lblNewLabel_6);
		
		dNou = new JTextField();
		dNou.setEditable(false);
		dNou.setBounds(205, 32, 160, 20);
		panel_2.add(dNou);
		dNou.setColumns(10);
		
		dStream = new JTextField();
		dStream.setEditable(false);
		dStream.setBounds(205, 75, 160, 20);
		panel_2.add(dStream);
		dStream.setColumns(10);
		
		dYop = new JTextField();
		dYop.setEditable(false);
		dYop.setBounds(205, 119, 80, 20);
		panel_2.add(dYop);
		dYop.setColumns(10);
		
		dPer = new JTextField();
		dPer.setEditable(false);
		dPer.setBounds(205, 168, 80, 20);
		panel_2.add(dPer);
		dPer.setColumns(10);
		
		JButton btnContinue_1 = new JButton("Continue");
		btnContinue_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(3);
				
			}
		});
		btnContinue_1.setBounds(576, 283, 143, 39);
		panel_2.add(btnContinue_1);
		
		JPanel pane2 = new JPanel();
		pane2.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane.addTab("B.Tech", null, pane2, null);
		pane2.setLayout(null);
		
		JButton btnContinue_2 = new JButton("Close ");
		btnContinue_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
			}
		});
		btnContinue_2.setBounds(595, 310, 117, 35);
		pane2.add(btnContinue_2);
		

		JLabel lblCurrentYear = new JLabel("Current Year");
		lblCurrentYear.setBounds(21, 11, 97, 14);
		pane2.add(lblCurrentYear);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(104, 8, 86, 20);
		pane2.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblSem1 = new JLabel("Sem 1 :");
		lblSem1.setBounds(21, 52, 46, 14);
		pane2.add(lblSem1);
		
		sem1 = new JTextField();
		sem1.setEditable(false);
		sem1.setBounds(104, 49, 86, 20);
		pane2.add(sem1);
		sem1.setColumns(10);
		
		JLabel lblSem2 = new JLabel("Sem 2 :");
		lblSem2.setBounds(21, 116, 46, 14);
		pane2.add(lblSem2);
		
		sem2 = new JTextField();
		sem2.setEditable(false);
		sem2.setBounds(104, 113, 86, 20);
		pane2.add(sem2);
		sem2.setColumns(10);
		
		JLabel lblSem3 = new JLabel("Sem 3 :");
		lblSem3.setBounds(21, 174, 46, 14);
		pane2.add(lblSem3);
		
		sem3 = new JTextField();
		sem3.setEditable(false);
		sem3.setBounds(104, 171, 86, 20);
		pane2.add(sem3);
		sem3.setColumns(10);
		
		JLabel lblSem4 = new JLabel("Sem 4:");
		lblSem4.setBounds(21, 241, 46, 14);
		pane2.add(lblSem4);
		
		sem4 = new JTextField();
		sem4.setEditable(false);
		sem4.setBounds(104, 238, 86, 20);
		pane2.add(sem4);
		sem4.setColumns(10);
		
		JLabel lblSem5 = new JLabel("Sem 5 :");
		lblSem5.setBounds(286, 52, 46, 14);
		pane2.add(lblSem5);
		
		sem5 = new JTextField();
		sem5.setEditable(false);
		sem5.setBounds(399, 49, 86, 20);
		pane2.add(sem5);
		sem5.setColumns(10);
		
		JLabel lblSem6 = new JLabel("Sem 6 :");
		lblSem6.setBounds(286, 116, 46, 14);
		pane2.add(lblSem6);
		
		sem6 = new JTextField();
		sem6.setEditable(false);
		sem6.setBounds(399, 113, 86, 20);
		pane2.add(sem6);
		sem6.setColumns(10);
		
		JLabel lblSem7 = new JLabel("Sem 7 :");
		lblSem7.setBounds(286, 174, 46, 14);
		pane2.add(lblSem7);
		
		sem7 = new JTextField();
		sem7.setEditable(false);
		sem7.setBounds(399, 171, 86, 20);
		pane2.add(sem7);
		sem7.setColumns(10);
		
		JLabel lblSem8 = new JLabel("Sem 8 :");
		lblSem8.setBounds(286, 241, 46, 14);
		pane2.add(lblSem8);
		
		sem8 = new JTextField();
		sem8.setEditable(false);
		sem8.setBounds(399, 238, 86, 20);
		pane2.add(sem8);
		sem8.setColumns(10);
		
		SessionFactory factory=createSessionFactory();
		Session s=factory.openSession();
		Object ob=s.load(Students.class,new String(user));
		Students stu=(Students) ob;
		tNoe.setText(stu.getTnoe());
		tYop.setText(stu.getTyop());
		tBoard.setText(stu.getTboard());
		tSname.setText(stu.getTsname());
		tMos.setText(stu.getTmos());
		tSper.setText(stu.getTsper());
		tAper.setText(stu.getTactper());
		twNoe.setText(stu.getTwnoe());
		twYop.setText(stu.getTwyop());
		twBoard.setText(stu.getTwboard());
		twSname.setText(stu.getTwsname());
		twMos.setText(stu.getTwmos());
		twSper.setText(stu.getTwsper());
		twAper.setText(stu.getTwactper());
		dNou.setText(stu.getDnou());
		dStream.setText(stu.getStream());
		dYop.setText(stu.getDyop());
		dPer.setText(stu.getDsper());
		sem1.setText(stu.getMarks1());
		sem2.setText(stu.getMarks2());
		sem3.setText(stu.getMarks3());
		sem4.setText(stu.getMarks4());
		sem5.setText(stu.getMarks5());
		sem6.setText(stu.getMarks6());
		sem7.setText(stu.getMarks7());
		sem8.setText(stu.getMarks8());
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//new EditAcademicInfo(createSessionFactory());
			}
		});
		btnEdit.setBounds(396, 310, 89, 35);
		pane2.add(btnEdit);
		
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
