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
public class View_Result1 {

	private JFrame frame1;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	
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
	 * @wbp.parser.entryPoint
	 */
	public View_Result1() {
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
		
		JLabel lblPic = new JLabel("Semester ");
		lblPic.setBounds(23, 24, 81, 14);
		frame1.getContentPane().add(lblPic);
		
		JButton btnBack = new JButton("Submit");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Result_Show a=new View_Result_Show();
			}
		});
		btnBack.setBounds(79, 89, 89, 23);
		frame1.getContentPane().add(btnBack);
		String s[]={"I","II","III","IV","V","VI","VII","VII"};
		comboBox = new JComboBox(s);
		comboBox.setBounds(100, 21, 68, 20);
		frame1.getContentPane().add(comboBox);
		
		
		
		
		
	}
}
