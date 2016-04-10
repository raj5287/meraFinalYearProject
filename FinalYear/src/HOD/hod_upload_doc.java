package HOD;

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
public class hod_upload_doc {

	private JFrame frame1;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hod_upload_doc window = new hod_upload_doc();
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
	public hod_upload_doc() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */

	@SuppressWarnings("static-access")
	void initialize() {
		frame1 = new JFrame("Upload File ");
		frame1.getContentPane().setBackground(Color.WHITE);
				
//		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg1.png")))));
			
				
		frame1.setVisible(true);
		frame1.setBounds(100, 100, 794, 462);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Close");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});
		btnBack.setBounds(635, 369, 89, 23);
		frame1.getContentPane().add(btnBack);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(230, 15, 89, 23);
		frame1.getContentPane().add(btnBrowse);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(372, 15, 89, 23);
		frame1.getContentPane().add(btnUpload);
		
		textField = new JTextField();
		textField.setBounds(26, 16, 156, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		
	}
}
