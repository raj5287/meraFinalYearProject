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
public class View_Fee {

	private static final String RAWTYPES = "rawtypes";
	private JFrame frame1;
	private JButton btnSubmit;
	private JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Fee window = new View_Fee();
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
	public View_Fee() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	
	@SuppressWarnings("static-access")
	void initialize() {
		frame1 = new JFrame("Fee");
		frame1.getContentPane().setBackground(Color.WHITE);
				
//		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg1.png")))));
			
				
		frame1.setVisible(true);
		frame1.setBounds(100, 100, 794, 462);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		String stream[]={"IT","CSE","CIVIL","ME","ECE","EI"};
		String yr[]={"1","2","3","4"};
		String sem[]={"I","II","III","IV","V","VI","VII","VII"};
		
		btnSubmit = new JButton("Close");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});
		btnSubmit.setBounds(655, 374, 89, 23);
		frame1.getContentPane().add(btnSubmit);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 758, 364);
		frame1.getContentPane().add(lblNewLabel);
		
		
		
		
		
	}
}
