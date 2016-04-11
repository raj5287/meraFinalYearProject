package com.hod;

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
public class View_Profile {

	JFrame frame1;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Profile window = new View_Profile();
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
	public View_Profile() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	
	@SuppressWarnings("static-access")
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
		
		JLabel lblPhoneNo = new JLabel("Phone No :");
		lblPhoneNo.setBounds(24, 99, 135, 14);
		frame1.getContentPane().add(lblPhoneNo);
		
		JLabel lblEmailId = new JLabel("Email ID :");
		lblEmailId.setBounds(24, 230, 135, 14);
		frame1.getContentPane().add(lblEmailId);
		
		JLabel lblPic = new JLabel("Pic");
		lblPic.setBounds(563, 55, 123, 102);
		frame1.getContentPane().add(lblPic);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(563, 343, 89, 23);
		frame1.getContentPane().add(btnBack);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(169, 27, 86, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(169, 96, 86, 20);
		frame1.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(169, 227, 86, 20);
		frame1.getContentPane().add(textField_4);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setBounds(24, 166, 123, 14);
		frame1.getContentPane().add(lblDepartment);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(169, 163, 86, 20);
		frame1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		
		
	}
}
