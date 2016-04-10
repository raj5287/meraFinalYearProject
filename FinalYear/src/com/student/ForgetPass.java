package com.student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ForgetPass {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgetPass window = new ForgetPass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
					/*sanfnsakfl*/
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ForgetPass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("rawtypes")
	private void initialize() {
		frame = new JFrame("Forget Password");
		frame.setBounds(100, 100, 802, 462);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblMotherMaidenName = new JLabel("Mother' Maiden Name :");
		lblMotherMaidenName.setBounds(27, 34, 185, 14);
		frame.getContentPane().add(lblMotherMaidenName);
		
		textField = new JTextField();
		textField.setBounds(250, 31, 163, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(55, 85, 358, 20);
		frame.getContentPane().add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(55, 132, 358, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblQ = new JLabel("Q");
		lblQ.setBounds(22, 88, 23, 14);
		frame.getContentPane().add(lblQ);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(27, 135, 19, 14);
		frame.getContentPane().add(lblA);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(582, 323, 119, 33);
		frame.getContentPane().add(btnNewButton);
	}

}
