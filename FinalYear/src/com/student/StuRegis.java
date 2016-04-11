package com.student;

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

@SuppressWarnings("unused")
public class StuRegis {

	JFrame frame1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
		private JTextField textField_33;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuRegis window = new StuRegis();
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
	public StuRegis() {
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
		
		JLabel lblMothersOccupation = new JLabel("Mother's Occupation :");
		lblMothersOccupation.setBounds(23, 191, 145, 14);
		panel.add(lblMothersOccupation);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth :");
		lblDateOfBirth.setBounds(23, 235, 112, 14);
		panel.add(lblDateOfBirth);
		
		JLabel lblNewLabel = new JLabel("Blood Group :\r\n");
		lblNewLabel.setBounds(23, 276, 112, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Present Address :");
		lblNewLabel_1.setBounds(23, 316, 112, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblUploadPic = new JLabel("Upload Pic");
		lblUploadPic.setBounds(449, 33, 133, 86);
		panel.add(lblUploadPic);
		
		JButton btnSaveContinue = new JButton("Save & Continue");
		btnSaveContinue.setBounds(504, 306, 153, 34);
		panel.add(btnSaveContinue);
		
		JLabel lblNewLabel_2 = new JLabel("Permanent Address :\r\n");
		lblNewLabel_2.setBounds(420, 180, 121, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(172, 30, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 64, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 102, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(172, 145, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(172, 188, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(172, 273, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		String[] date={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		JComboBox comboBox;
		comboBox= new JComboBox(date);
		comboBox.setBounds(172, 232, 46, 20);
		panel.add(comboBox);
		String[] mnth={"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox comboBox_1;
		comboBox_1= new JComboBox(mnth);
		comboBox_1.setBounds(213, 232, 45, 20);
		panel.add(comboBox_1);
		String[] yr={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003"};
		JComboBox comboBox_2 = new JComboBox(yr);
		comboBox_2.setBounds(258, 232, 58, 20);
		panel.add(comboBox_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(172, 313, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(546, 177, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex :");
		lblSex.setBounds(420, 235, 92, 14);
		panel.add(lblSex);
		String[] sex={"Male","Female"};
		@SuppressWarnings({ })
		JComboBox comboBox_3 = new JComboBox(sex);
		comboBox_3.setBounds(546, 232, 68, 20);
		panel.add(comboBox_3);
		
		JButton btnb = new JButton("Browse\r\n");
		btnb.setBounds(639, 67, 89, 23);
		panel.add(btnb);

		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.addTab("Academic", null, tabbedPane, null);
		
		JPanel panel22 = new JPanel();
		panel22.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane.addTab("10th ", null, panel22, null);
		panel22.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Name of  Examination :");
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
		
		JLabel lblNewLabel_23 = new JLabel("Upload Marksheet");
		lblNewLabel_23.setBounds(10, 313, 162, 14);
		panel22.add(lblNewLabel_23);
		
		textField_21 = new JTextField();
		textField_21.setBounds(182, 8, 86, 20);
		panel22.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(182, 50, 86, 20);
		panel22.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(182, 91, 86, 20);
		panel22.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(182, 140, 86, 20);
		panel22.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(182, 183, 86, 20);
		panel22.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBounds(182, 227, 86, 20);
		panel22.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(182, 271, 86, 20);
		panel22.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(182, 310, 86, 20);
		panel22.add(textField_28);
		textField_28.setColumns(10);
		
		JButton btnBrowse_2 = new JButton("Browse");
		btnBrowse_2.setBounds(292, 309, 89, 23);
		panel22.add(btnBrowse_2);
		
		JButton btnUpload_2 = new JButton("Upload");
		btnUpload_2.setBounds(402, 309, 89, 23);
		panel22.add(btnUpload_2);
		
		JButton btnNewButton = new JButton("Save & Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(554, 314, 158, 36);
		panel22.add(btnNewButton);
		
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
		
		JLabel lblNewLabel_15 = new JLabel("Upload Marksheet :");
		lblNewLabel_15.setBounds(10, 310, 120, 14);
		panel_1.add(lblNewLabel_15);
		
		textField_13 = new JTextField();
		textField_13.setBounds(181, 11, 86, 20);
		panel_1.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(181, 47, 86, 20);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(181, 88, 86, 20);
		panel_1.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(181, 131, 86, 20);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(181, 177, 86, 20);
		panel_1.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(181, 219, 86, 20);
		panel_1.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(181, 263, 86, 20);
		panel_1.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(181, 307, 86, 20);
		panel_1.add(textField_20);
		textField_20.setColumns(10);
		
		JButton btnUpload_1 = new JButton("Upload");
		btnUpload_1.setBounds(403, 306, 89, 23);
		panel_1.add(btnUpload_1);
		
		JButton btnBrowse_1 = new JButton("Browse");
		btnBrowse_1.setBounds(292, 306, 89, 23);
		panel_1.add(btnBrowse_1);
		
		JButton btnSaveContinue_2 = new JButton("Save & Continue");
		btnSaveContinue_2.setBounds(565, 320, 147, 36);
		panel_1.add(btnSaveContinue_2);
		
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
		
		JLabel lblNewLabel_7 = new JLabel("Upload Marksheet :");
		lblNewLabel_7.setBounds(10, 221, 138, 14);
		panel_2.add(lblNewLabel_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(205, 32, 105, 20);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(205, 75, 105, 20);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(205, 119, 105, 20);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(205, 168, 105, 20);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(205, 218, 105, 20);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(355, 217, 89, 23);
		panel_2.add(btnBrowse);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(471, 217, 89, 23);
		panel_2.add(btnUpload);
		
		JButton btnSaveContinue_1 = new JButton("Save & Continue");
		btnSaveContinue_1.setBounds(576, 283, 143, 39);
		panel_2.add(btnSaveContinue_1);
		
		JButton btnSkip = new JButton("Skip");
		btnSkip.setBounds(439, 291, 89, 23);
		panel_2.add(btnSkip);
		
		JPanel pane2 = new JPanel();
		pane2.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane.addTab("B.Tech", null, pane2, null);
		pane2.setLayout(null);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(UIManager.getColor("EditorPane.disabledBackground"));
		tabbedPane_1.addTab("Contact", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblStudentsPhoneNo = new JLabel("Student's Phone No :");
		lblStudentsPhoneNo.setBounds(21, 34, 130, 14);
		panel_4.add(lblStudentsPhoneNo);
		
		JLabel lblFathersPhoneNo = new JLabel("Father's Phone No :");
		lblFathersPhoneNo.setBounds(21, 70, 130, 14);
		panel_4.add(lblFathersPhoneNo);
		
		JLabel lblMothersPhoneNo = new JLabel("Mother's Phone No :");
		lblMothersPhoneNo.setBounds(21, 106, 130, 14);
		panel_4.add(lblMothersPhoneNo);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setBounds(21, 141, 113, 14);
		panel_4.add(lblEmailId);
		
		textField_29 = new JTextField();
		textField_29.setBounds(161, 31, 86, 20);
		panel_4.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(161, 67, 86, 20);
		panel_4.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(161, 103, 86, 20);
		panel_4.add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setBounds(161, 138, 86, 20);
		panel_4.add(textField_32);
		textField_32.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Save & Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(579, 318, 148, 43);
		panel_4.add(btnNewButton_1);
		
		
		
	}
}
