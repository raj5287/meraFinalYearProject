package coordinator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ViewStudentData extends JFrame {

	private JFrame frame;
	private JTextField txtNmae;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudentData window = new ViewStudentData();
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
	public ViewStudentData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 827, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(182, 0, 629, 436);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		Image img=new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(435, 79, 283, 244);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Academic Info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(59, 233, 110, 23);
		panel.add(btnNewButton);
		
		JButton btnPersonalInfo = new JButton("Personal Info");
		btnPersonalInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPersonalInfo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPersonalInfo.setBounds(59, 160, 110, 23);
		panel.add(btnPersonalInfo);
		
		JButton btnNewButton_1 = new JButton("Other Info");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(59, 300, 110, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(59, 363, 110, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblI = new JLabel("image");
		lblI.setBounds(266, 11, 138, 156);
		panel.add(lblI);
		
		txtNmae = new JTextField();
		txtNmae.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtNmae.setText("Nmae");
		txtNmae.setBounds(59, 41, 172, 20);
		panel.add(txtNmae);
		txtNmae.setColumns(10);
	}
}
