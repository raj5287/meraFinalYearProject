package coordinator;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;

public class SearchStudent {

	private JFrame frame;
	private JTextField studentName;
	static String searchBy;
	static String sem,studentSearch ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchStudent window = new SearchStudent();
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
	public SearchStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 12));
		frame.setBounds(100, 100, 744, 417);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		studentName = new JTextField();
		studentName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		studentName.setBounds(361, 23, 133, 20);
		frame.getContentPane().add(studentName);
		studentName.setColumns(10);
		
		JLabel lblEnterStudentName = new JLabel("Enter Student name or University Roll No");
		lblEnterStudentName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEnterStudentName.setBounds(99, 23, 212, 20);
		frame.getContentPane().add(lblEnterStudentName);
		
		JRadioButton rdbtnName = new JRadioButton("Name");
		rdbtnName.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				searchBy="Name";
			}
		});
		rdbtnName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnName.setBounds(184, 86, 109, 23);
		frame.getContentPane().add(rdbtnName);
		rdbtnName.setSelected(true);
		
		JRadioButton rdbtnUniversityRollNo = new JRadioButton("University Roll No");
		rdbtnUniversityRollNo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				searchBy="University";
			}
		});
		rdbtnUniversityRollNo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnUniversityRollNo.setBounds(361, 86, 133, 23);
		frame.getContentPane().add(rdbtnUniversityRollNo);
		
		ButtonGroup group = new ButtonGroup();
	    group.add(rdbtnName);
	    group.add(rdbtnUniversityRollNo);
	    
	    rdbtnName.setMnemonic(KeyEvent.VK_C);
	    rdbtnUniversityRollNo.setMnemonic(KeyEvent.VK_M);
	    
	    
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(searchBy);
				new ViewStudentData();
			}
		});
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSearch.setBounds(249, 181, 200, 50);
		frame.getContentPane().add(btnSearch);
		
		String[] semester={"1","2","3","4","5","6","7","8"};
		JComboBox comboBox = new JComboBox(semester);
		comboBox.setBounds(603, 23, 46, 20);
		frame.getContentPane().add(comboBox);
		sem= (String) comboBox.getSelectedItem();
		studentSearch=studentName.getText();
		
		JLabel lblSem = new JLabel("Sem");
		lblSem.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSem.setBounds(528, 26, 46, 14);
		frame.getContentPane().add(lblSem);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
