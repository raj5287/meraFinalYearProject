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

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.student.Launcher;
import com.student.Students;
import com.student.ViewProfile;
import com.student.View_Adacemic;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class ViewStudentData extends JFrame {

	private JFrame frame;
	private JTextField txtName;
	JLabel lblI;
	static String setUser;

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
		frame = new JFrame("Student Info");
		frame.setBounds(100, 100, 827, 475);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.WHITE);
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
				new View_Adacemic(setUser);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(59, 233, 110, 23);
		panel.add(btnNewButton);
		
		JButton btnPersonalInfo = new JButton("Personal Info");
		btnPersonalInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewStuProfile(setUser);
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
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBounds(59, 363, 110, 23);
		panel.add(btnNewButton_2);
		
		lblI= new JLabel("image");
		lblI.setBounds(266, 11, 138, 156);
		panel.add(lblI);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtName.setBounds(59, 41, 172, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		int u=0;
		if(SearchStudent.searchBy.equals("Name"))
		{
			u=1;
		}
		else if(SearchStudent.searchBy.equals("University")){
			u=2;
		}
		
		SessionFactory factory=createSessionFactory();
		
		
		switch(u){
			case 1:
				Session s=factory.openSession();
				String hql="from Students";
				Query q=s.createQuery(hql);
				List<Students> list=q.list();
				
				String records[][]=new String[list.size()][2];
				int r=0;
				for(Students rr : list){
					records[r][0]=rr.getUserid();
					records[r][1]=rr.getName();
					if(SearchStudent.studentSearch.equals(records[r][1])){
						setUser = records[r][0];
					}
				}
			case 2:
				Session s1=factory.openSession();
				String hql1="from Students";
				Query q1=s1.createQuery(hql1);
				List<Students> list1=q1.list();
				
				String records1[][]=new String[list1.size()][2];
				int p=0;
				for(Students pp : list1){
					records1[p][0]=pp.getEmailid();
					records1[p][1]=pp.getUrollno();
					if(SearchStudent.studentSearch.equals(records1[p][1])){
						setUser = records1[p][0];
					}
				}
		}	
		Session s2=factory.openSession();
		Object ob=s2.load(Students.class,new String(setUser));
		Students stu=(Students) ob;
		txtName.setText(stu.getName());
		String picPath=stu.getPic();
		lblI.setIcon(ResizeImage(picPath));
		
		
	}
	    public ImageIcon ResizeImage(String ImagePath)
		{ 

			ImageIcon MyImage = new ImageIcon(ImagePath); 
			Image img = MyImage.getImage(); 
			Image newImg = img.getScaledInstance(lblI.getWidth(), lblI.getHeight(), Image.SCALE_SMOOTH); 
			ImageIcon image = new ImageIcon(newImg); 
			return image; 
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
