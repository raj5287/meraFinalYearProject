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
public class View_Schedule {

	private JFrame frame1;
	
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
	public View_Schedule() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	
	@SuppressWarnings("static-access")
	void initialize() {
		frame1 = new JFrame("Routine ");
		frame1.getContentPane().setBackground(Color.WHITE);
				
//		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg1.png")))));
			
				
		frame1.setVisible(true);
		frame1.setBounds(100, 100, 794, 462);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblPic = new JLabel("Pic");
		lblPic.setBounds(10, 11, 758, 347);
		frame1.getContentPane().add(lblPic);
		
		JButton btnBack = new JButton("Close");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();;
			}
		});
		btnBack.setBounds(635, 369, 89, 23);
		frame1.getContentPane().add(btnBack);
		
		
		
		
		
	}
}
