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

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

@SuppressWarnings("unused")
public class Stu_Regis extends JFrame {

	private JFrame frame1;
	private JTextField name;	//student's name
	private JTextField fName;	//father's name
	private JTextField fOccup;	//father's occupation
	private JTextField mName;	//mother's name
	private JTextField presentAdd;	//present address of student
	private JTextField perAdd;	//permanent address of student
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
	private JTextField sPhnno;	//student's mobile number
	private JTextField fPhnno;	//father's mobile number
	private JTextField Email;	//student's email id
	private JTextField uRegno;	//university registration number
	private JTextField uRollno;	//university roll number
	private JTextField Sem1;	//marks in 1st semester
	private JTextField Sem2;	//marks in 2nd semester
	private JTextField Sem3;	//marks in 3rd semester
	private JTextField textField;	//marks in 4rth semester
	private JTextField Sem5;	//marks in 5th semester
	private JTextField Sem6;	//marks in 6th semester
	private JTextField Sem7;	//marks in 7th semester
	private JTextField Sem8;	//marks in 8th semester
    private JPasswordField password;
	private JPasswordField cnfpass;
	JLabel lblUploadPic ;
	String sname,fname,foccp,mname,sgender,dob,presentadd,permadd,pic,destination;
	String tnoe,tyop,tboard,tsname,tmos,tsper,tactper;
	String twnoe,twyop,twboard,twsname,twmos,twsper,twactper;
	String dnou,dstream,dyop,dper;
	String email,pass;
	String smobno,fmobno,uregno,urollno,curyear;
	String marks1,marks2,marks3,marks4,marks5,marks6,marks7,marks8;
	private JTextField sourceFileTextField;
	static String fileName;
	private JTextField userID;
	Path sourcePath,destinationPath;
	
	public ImageIcon ResizeImage(String ImagePath)
	{ 

		ImageIcon MyImage = new ImageIcon(ImagePath); 
		Image img = MyImage.getImage(); 
		Image newImg = img.getScaledInstance(lblUploadPic.getWidth(), lblUploadPic.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon image = new ImageIcon(newImg); 
		return image; 
	} 
/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stu_Regis window = new Stu_Regis();
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
	public Stu_Regis() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	void initialize() {
		frame1 = new JFrame("Registration");
				
//		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg1.png")))));
			
				
		frame1.setVisible(true);
		frame1.setBounds(100, 100, 794, 462);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 778, 423);
		frame1.getContentPane().add(tabbedPane_1);
		
		String[] date={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		JComboBox day;
		String[] mnth={"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox month;
		String[] yr={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003"};
		String[] sex={"Male","Female"};
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane_1.addTab("Personal", null, panel, null);
		panel.setLayout(null);
		JLabel lbl7 = new JLabel("Name :");
		lbl7.setBounds(23, 33, 46, 14);
		panel.add(lbl7);
		
		JLabel lblFathersName = new JLabel("Father's Name :");
		lblFathersName.setBounds(23, 67, 153, 14);
		panel.add(lblFathersName);
		
		JLabel lblFathersOccupation = new JLabel("Father's Occupation :");
		lblFathersOccupation.setBounds(23, 105, 145, 14);
		panel.add(lblFathersOccupation);
		
		JLabel lblMothersName = new JLabel("Mother's Name :");
		lblMothersName.setBounds(23, 148, 112, 14);
		panel.add(lblMothersName);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth :");
		lblDateOfBirth.setBounds(23, 235, 112, 14);
		panel.add(lblDateOfBirth);
		
		JLabel lblNewLabel_1 = new JLabel("Present Address :");
		lblNewLabel_1.setBounds(23, 280, 112, 14);
		panel.add(lblNewLabel_1);
		
		lblUploadPic = new JLabel("Upload Pic");
		lblUploadPic.setBounds(417, 33, 133, 129);
		panel.add(lblUploadPic);
		
		sourceFileTextField = new JTextField();
		sourceFileTextField.setBounds(598, 87, 153, 20);
		panel.add(sourceFileTextField);
		sourceFileTextField.setColumns(10);
		
		
		JButton btnbrowse = new JButton("Browse\r\n");
		btnbrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnbrowse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser jFileChooser = new JFileChooser();
		          jFileChooser.setDialogTitle("SAVE");
		          int status = jFileChooser.showOpenDialog(Stu_Regis.this);
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
						lblUploadPic.setIcon(ResizeImage(selectedFilePath));
					}
		          
		          else if(status == JFileChooser.CANCEL_OPTION){
		              System.out.println("No File Select");
		          }
			}
			});
		btnbrowse.setBounds(639, 127, 89, 23);
		panel.add(btnbrowse);
		
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(588, 326, 153, 34);
		panel.add(btnContinue);
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(1);
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Permanent Address :\r\n");
		lblNewLabel_2.setBounds(23, 336, 121, 14);
		panel.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setBounds(172, 30, 158, 20);
		panel.add(name);
		name.setColumns(10);
		
		fName = new JTextField();
		fName.setBounds(172, 64, 158, 20);
		panel.add(fName);
		fName.setColumns(10);
		
		fOccup = new JTextField();
		fOccup.setBounds(172, 102, 158, 20);
		panel.add(fOccup);
		fOccup.setColumns(10);
		
		mName = new JTextField();
		mName.setBounds(172, 145, 158, 20);
		panel.add(mName);
		mName.setColumns(10);
		day= new JComboBox(date);
		day.setBounds(172, 232, 46, 20);
		panel.add(day);
				
		month= new JComboBox(mnth);
		month.setBounds(213, 232, 45, 20);
		panel.add(month);		
		
		JComboBox year = new JComboBox(yr);
		year.setBounds(258, 232, 58, 20);
		panel.add(year);
		
		presentAdd = new JTextField();
		presentAdd.setBounds(172, 277, 363, 20);
		panel.add(presentAdd);
		presentAdd.setColumns(10);
		
		perAdd = new JTextField();
		perAdd.setBounds(172, 333, 363, 20);
		panel.add(perAdd);
		perAdd.setColumns(10);
		
		JLabel lblSex = new JLabel("Gender :");
		lblSex.setBounds(23, 193, 92, 14);
		panel.add(lblSex);
		@SuppressWarnings({ })
		JComboBox gender = new JComboBox(sex);
		gender.setBounds(172, 190, 68, 20);
		panel.add(gender);
		String sgender = (String) gender.getSelectedItem();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
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
		tNoe.setBounds(182, 8, 151, 20);
		panel22.add(tNoe);
		tNoe.setColumns(10);
		
		tYop = new JTextField();
		tYop.setBounds(182, 50, 151, 20);
		panel22.add(tYop);
		tYop.setColumns(10);
		
		tBoard = new JTextField();
		tBoard.setBounds(182, 91, 151, 20);
		panel22.add(tBoard);
		tBoard.setColumns(10);
		
		tSname = new JTextField();
		tSname.setBounds(182, 140, 151, 20);
		panel22.add(tSname);
		tSname.setColumns(10);
		
		tMos = new JTextField();
		tMos.setBounds(182, 183, 151, 20);
		panel22.add(tMos);
		tMos.setColumns(10);
		
		tSper = new JTextField();
		tSper.setBounds(182, 227, 60, 20);
		panel22.add(tSper);
		tSper.setColumns(10);
		
		tAper = new JTextField();
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
		twNoe.setBounds(181, 11, 152, 20);
		panel_1.add(twNoe);
		twNoe.setColumns(10);
		
		twYop = new JTextField();
		twYop.setBounds(181, 47, 152, 20);
		panel_1.add(twYop);
		twYop.setColumns(10);
		
		twBoard = new JTextField();
		twBoard.setBounds(181, 88, 152, 20);
		panel_1.add(twBoard);
		twBoard.setColumns(10);
		
		twSname = new JTextField();
		twSname.setBounds(181, 131, 152, 20);
		panel_1.add(twSname);
		twSname.setColumns(10);
		
		twMos = new JTextField();
		twMos.setBounds(181, 177, 152, 20);
		panel_1.add(twMos);
		twMos.setColumns(10);
		
		twSper = new JTextField();
		twSper.setBounds(181, 219, 60, 20);
		panel_1.add(twSper);
		twSper.setColumns(10);
		
		twAper = new JTextField();
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
		dNou.setBounds(205, 32, 160, 20);
		panel_2.add(dNou);
		dNou.setColumns(10);
		
		dStream = new JTextField();
		dStream.setBounds(205, 75, 160, 20);
		panel_2.add(dStream);
		dStream.setColumns(10);
		
		dYop = new JTextField();
		dYop.setBounds(205, 119, 80, 20);
		panel_2.add(dYop);
		dYop.setColumns(10);
		
		dPer = new JTextField();
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
		
		JButton btnSkip = new JButton("Skip");
		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(3);	
			}
		});
		btnSkip.setBounds(439, 291, 89, 23);
		panel_2.add(btnSkip);
		
		JPanel pane2 = new JPanel();
		pane2.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane.addTab("B.Tech", null, pane2, null);
		pane2.setLayout(null);
		
		JLabel lblUniversityRegistrationNo = new JLabel("University Registration No :");
		lblUniversityRegistrationNo.setBounds(10, 28, 180, 14);
		pane2.add(lblUniversityRegistrationNo);
		
		JLabel lblUniversityRollNo = new JLabel("University Roll No :");
		lblUniversityRollNo.setBounds(10, 72, 151, 14);
		pane2.add(lblUniversityRollNo);
		
		uRegno = new JTextField();
		uRegno.setBounds(200, 25, 141, 20);
		pane2.add(uRegno);
		uRegno.setColumns(10);
		
		uRollno = new JTextField();
		uRollno.setText("");
		uRollno.setBounds(200, 69, 141, 20);
		pane2.add(uRollno);
		uRollno.setColumns(10);
		
		JLabel lblSem = new JLabel("Sem 1 :");
		lblSem.setBounds(10, 123, 46, 14);
		pane2.add(lblSem);
		
		Sem1 = new JTextField();
		Sem1.setBounds(114, 120, 86, 20);
		pane2.add(Sem1);
		Sem1.setColumns(10);
		
		JLabel lblSem_1 = new JLabel("Sem 2 :");
		lblSem_1.setBounds(10, 158, 46, 14);
		pane2.add(lblSem_1);
		
		Sem2 = new JTextField();
		Sem2.setBounds(114, 155, 86, 20);
		pane2.add(Sem2);
		Sem2.setColumns(10);
		
		JLabel lblSem_2 = new JLabel("Sem 3 :");
		lblSem_2.setBounds(10, 192, 46, 14);
		pane2.add(lblSem_2);
		
		Sem3 = new JTextField();
		Sem3.setBounds(114, 186, 86, 20);
		pane2.add(Sem3);
		Sem3.setColumns(10);
		
		JLabel lblSem_3 = new JLabel("Sem 4 :");
		lblSem_3.setBounds(10, 224, 46, 14);
		pane2.add(lblSem_3);
		
		textField = new JTextField();
		textField.setBounds(114, 217, 86, 20);
		pane2.add(textField);
		textField.setColumns(10);
		
		JLabel lblSem_4 = new JLabel("Sem 5 :");
		lblSem_4.setBounds(305, 123, 46, 14);
		pane2.add(lblSem_4);
		
		Sem5 = new JTextField();
		Sem5.setBounds(393, 120, 86, 20);
		pane2.add(Sem5);
		Sem5.setColumns(10);
		
		JLabel lblSem_5 = new JLabel("Sem 6 :");
		lblSem_5.setBounds(305, 158, 46, 14);
		pane2.add(lblSem_5);
		
		Sem6 = new JTextField();
		Sem6.setBounds(393, 155, 86, 20);
		pane2.add(Sem6);
		Sem6.setColumns(10);
		
		JLabel lblSem_6 = new JLabel("Sem 7 :");
		lblSem_6.setBounds(305, 192, 46, 14);
		pane2.add(lblSem_6);
		
		Sem7 = new JTextField();
		Sem7.setBounds(393, 189, 86, 20);
		pane2.add(Sem7);
		Sem7.setColumns(10);
		
		JLabel lblSem_7 = new JLabel("Sem 8 :");
		lblSem_7.setBounds(305, 224, 46, 14);
		pane2.add(lblSem_7);
		
		Sem8 = new JTextField();
		Sem8.setBounds(393, 221, 86, 20);
		pane2.add(Sem8);
		Sem8.setColumns(10);
		
		JLabel lblCurrentSemester = new JLabel("Current Year:");
		lblCurrentSemester.setBounds(444, 28, 94, 14);
		pane2.add(lblCurrentSemester);
		
		String[] currentyear={"1","2","3","4"};
		JComboBox comboBox = new JComboBox(currentyear);
		comboBox.setBounds(558, 25, 39, 20);
		pane2.add(comboBox);
		
				
		JButton btnContinue_2 = new JButton("Continue ");
		btnContinue_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane_1.setSelectedIndex(2);
				}
		});
		btnContinue_2.setBounds(586, 287, 117, 35);
		pane2.add(btnContinue_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane_1.addTab("Area of Interest", null, panel_3, null);
		panel_3.setLayout(null);
		
		JCheckBox chckbxSports = new JCheckBox("Sports");
		chckbxSports.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		chckbxSports.setBounds(22, 37, 97, 23);
		panel_3.add(chckbxSports);
		
		JCheckBox chckbxDance = new JCheckBox("Dance");
		chckbxDance.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		chckbxDance.setBounds(22, 78, 97, 23);
		panel_3.add(chckbxDance);
		
		JCheckBox chckbxSinging = new JCheckBox("Singing");
		chckbxSinging.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		chckbxSinging.setBounds(22, 120, 97, 23);
		panel_3.add(chckbxSinging);
		
		JCheckBox chckbxPainting = new JCheckBox("Painting");
		chckbxPainting.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		chckbxPainting.setBounds(22, 165, 97, 23);
		panel_3.add(chckbxPainting);
		
		JCheckBox chckbxWriting = new JCheckBox("Writing");
		chckbxWriting.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		chckbxWriting.setBounds(222, 165, 97, 23);
		panel_3.add(chckbxWriting);
		
		JCheckBox chckbxActing = new JCheckBox("Acting");
		chckbxActing.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		chckbxActing.setBounds(222, 37, 97, 23);
		panel_3.add(chckbxActing);
		
		JCheckBox chckbxTechnical = new JCheckBox("Technical");
		chckbxTechnical.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		chckbxTechnical.setBounds(222, 78, 97, 23);
		panel_3.add(chckbxTechnical);
		
		JCheckBox chckbxOrganizerOfEvents = new JCheckBox("Organizer of Events");
		chckbxOrganizerOfEvents.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		chckbxOrganizerOfEvents.setBounds(222, 120, 143, 23);
		panel_3.add(chckbxOrganizerOfEvents);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tabbedPane_1.setSelectedIndex(3);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(557, 323, 157, 39);
		panel_3.add(btnNewButton);
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane_1.addTab("Login Details", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblStudentsPhoneNo = new JLabel("Student's Phone No :");
		lblStudentsPhoneNo.setBounds(21, 34, 130, 14);
		panel_4.add(lblStudentsPhoneNo);
		
		JLabel lblFathersPhoneNo = new JLabel("Father's Phone No :");
		lblFathersPhoneNo.setBounds(21, 70, 130, 14);
		panel_4.add(lblFathersPhoneNo);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setBounds(21, 108, 113, 14);
		panel_4.add(lblEmailId);
		
		sPhnno = new JTextField();
		sPhnno.setBounds(161, 31, 100, 20);
		panel_4.add(sPhnno);
		sPhnno.setColumns(10);
		
		fPhnno = new JTextField();
		fPhnno.setBounds(161, 67, 100, 20);
		panel_4.add(fPhnno);
		fPhnno.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(161, 105, 200, 20);
		panel_4.add(Email);
		Email.setColumns(10);
		
		JLabel lblUserId = new JLabel("User Id:");
		lblUserId.setBounds(21, 161, 46, 14);
		panel_4.add(lblUserId);
		
		userID = new JTextField();
		userID.setText("");
		userID.setBounds(161, 158, 162, 20);
		panel_4.add(userID);
		userID.setColumns(10);
		
                
        JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setBounds(21, 212, 100, 14);
		panel_4.add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(161, 209, 100, 20);
		panel_4.add(password);
		password.setColumns(10);
                
        JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setBounds(21, 255, 130, 14);
		panel_4.add(lblConfirmPassword);
		
		cnfpass = new JPasswordField();
		cnfpass.setBounds(161, 252, 100, 20);
		panel_4.add(cnfpass);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				sname=name.getText();
				fname=fName.getText();
				foccp=fOccup.getText();
				mname=mName.getText();
				presentadd=presentAdd.getText();
				permadd=perAdd.getText();
				String day1 = (String) day.getSelectedItem();//getting day
				String month1 = (String) month.getSelectedItem();//getting month
				String year1 = (String) year.getSelectedItem();//getting year
				dob=day1+month1+year1;//set it in db
				
				tnoe=tNoe.getText();
				tyop=tYop.getText();
				tboard=tBoard.getText();
				tsname=tSname.getText();
				tmos=tMos.getText();
				tsper=(tSper.getText());
				tactper=(tAper.getText());
				
				twnoe=twNoe.getText();
				twyop=twYop.getText();
				twboard=twBoard.getText();
				twsname=twSname.getText();
				twmos=twMos.getText();
				twsper=(twSper.getText());
				twactper=(twAper.getText());
				
				dnou=dNou.getText();
				dyop=dYop.getText();
				dstream=dStream.getText();
				dper=(dPer.getText());
			
				uregno=(uRegno.getText());
				urollno=(uRollno.getText());
				curyear = (String) comboBox.getSelectedItem();
				marks1=(Sem1.getText());
				marks2=(Sem2.getText());
				marks3=(Sem3.getText());
				marks4=(textField.getText());
				marks5=(Sem5.getText());
				marks6 =(Sem5.getText());
				marks7=(Sem7.getText());
				marks8=(Sem8.getText());
			
				
				String userid=userID.getText();
				email=Email.getText();
				smobno=(sPhnno.getText());
				fmobno=(fPhnno.getText());
				String folderLocation="E:/"+userid;
				new File(folderLocation).mkdir();
				File sourceFile = new File(sourceFileTextField.getText());
				destination = "E:/"+userid+"/" + fileName;

				File destinationFile = new File(destination);
				sourcePath = sourceFile.toPath();
				destinationPath = destinationFile.toPath();
				
				try {
					Files.copy(sourcePath, destinationPath);
					System.out.print("File Copied");
				} catch (IOException ex) {
					ex.printStackTrace();
					System.out.print("File NOt Copied");
				}
					String pass=new String (password.getPassword());
				//adding data to database
				SessionFactory factory=createSessionFactory();
				Session s=factory.openSession();
				Students ob =new Students();
				ob.setUserid(userid);
				ob.setEmailid(email);
				ob.setPassword(pass);
				ob.setName(sname);
				ob.setGender(sgender);
				ob.setFname(fname);
				ob.setFoccupation(foccp);
				ob.setMname(mname);
				ob.setDob(dob);
				ob.setPresentadsress(presentadd);
				ob.setPermaddress(permadd);
				ob.setPic(destination);
				ob.setSmobno(smobno);
				ob.setFmobno(fmobno);
				ob.setTnoe(tnoe);
				ob.setTyop(tyop);
				ob.setTboard(tboard);
				ob.setTsname(tsname);
				ob.setTmos(tmos);
				ob.setTsper(tsper);
				ob.setTactper(tactper);
				ob.setTwnoe(twnoe);
				ob.setTwyop(twyop);
				ob.setTwboard(tboard);
				ob.setTwsname(twsname);
				ob.setTwmos(twmos);
				ob.setTwsper(twsper);
				ob.setTwactper(twactper);
				ob.setDnou(dnou);
				ob.setStream(dstream);
				ob.setDyop(dyop);
				ob.setDsper(dper);
				ob.setUregno(uregno);
				ob.setUrollno(urollno);
				ob.setCuryear(curyear);
				ob.setMarks1(marks1);
				ob.setMarks2(marks2);
				ob.setMarks3(marks3);
				ob.setMarks4(marks4);
				ob.setMarks5(marks5);
				ob.setMarks6(marks6);
				ob.setMarks7(marks7);
				ob.setMarks8(marks8);
				ob.setFlocation(folderLocation);
				
				Transaction tr= s.beginTransaction();
				s.save(ob);
				System.out.println("data inserted");
				tr.commit();
				s.close();
				factory.close();
				
				JOptionPane.showMessageDialog(null, "Registered Successfully");
				frame1.dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(579, 318, 148, 43);
		panel_4.add(btnNewButton_1);
		
		
		
		
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
