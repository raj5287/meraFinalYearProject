package teacher;

import java.io.File;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.SoftBevelBorder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.student.Students;

import coordinator.CDocs;
import coordinator.SearchStudent;

import javax.swing.border.BevelBorder;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("unused")
public class UploadDoc extends JFrame {

	private JFrame frame1;
	private JTextField sourceFileTextField;
	String fname,user;
	private JTextField textField;
	static String addTo = "";
	int u = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UploadDoc window = new UploadDoc();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public UploadDoc() {
		initialize();
	}
	public UploadDoc(String x) {
		user=x;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	@SuppressWarnings("static-access")
	void initialize() {
		frame1 = new JFrame("Upload File ");
		frame1.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		frame1.setVisible(true);
		frame1.getContentPane().setBackground(Color.WHITE);

		// frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new
		// File("bg1.png")))));

		frame1.setVisible(true);
		frame1.setBounds(100, 100, 794, 462);
		frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);

		sourceFileTextField = new JTextField();
		sourceFileTextField.setBounds(32, 193, 156, 20);
		frame1.getContentPane().add(sourceFileTextField);
		sourceFileTextField.setColumns(10);

		textField = new JTextField();
		textField.setBounds(152, 41, 312, 20);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblEnterTheSubject = new JLabel("Enter The Subject");
		lblEnterTheSubject.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEnterTheSubject.setBounds(32, 40, 113, 23);
		frame1.getContentPane().add(lblEnterTheSubject);

		JRadioButton rdbtnAttendance = new JRadioButton("Attendance");
		rdbtnAttendance.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addTo = "Attendance";
				System.out.println(addTo);
			}
		});
		rdbtnAttendance.setBounds(67, 121, 109, 23);
		frame1.getContentPane().add(rdbtnAttendance);

		JRadioButton rdbtnNotice = new JRadioButton("Notice");
		rdbtnNotice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addTo = "Notice";
				System.out.println(addTo);
			}
		});
		rdbtnNotice.setBounds(234, 121, 109, 23);
		frame1.getContentPane().add(rdbtnNotice);

		JRadioButton rdbtnNotes = new JRadioButton("Notes");
		rdbtnNotes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addTo = "Notes";
				System.out.println(addTo);
			}
		});
		rdbtnNotes.setBounds(419, 121, 109, 23);
		frame1.getContentPane().add(rdbtnNotes);

		JRadioButton rdbtnQuestionPaper = new JRadioButton("Question Paper");
		rdbtnQuestionPaper.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addTo = "Question Paper";
				System.out.println(addTo);
			}
		});
		rdbtnQuestionPaper.setBounds(593, 121, 109, 23);
		frame1.getContentPane().add(rdbtnQuestionPaper);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnAttendance);
		group.add(rdbtnNotice);
		group.add(rdbtnNotes);
		group.add(rdbtnQuestionPaper);

		JButton btnBack = new JButton("Close");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});
		btnBack.setBounds(635, 369, 89, 23);
		frame1.getContentPane().add(btnBack);

		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBrowse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();
				int status = jFileChooser.showOpenDialog(UploadDoc.this);
				String filename = jFileChooser.getSelectedFile().getAbsolutePath();
				File file1 = new File(filename);
				fname = file1.getName();
				System.out.print(fname);
				if (status == JFileChooser.APPROVE_OPTION) {
					String selectedFilePath = jFileChooser.getSelectedFile().getAbsolutePath();
					sourceFileTextField.setText(selectedFilePath);
				}
			}
		});
		btnBrowse.setBounds(234, 192, 89, 23);
		frame1.getContentPane().add(btnBrowse);

		JButton btnUpload = new JButton("Upload");
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnUpload.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Enter The Subject");
				}
				File sourceFile = new File(sourceFileTextField.getText());
				String destination = "E:/" + fname;

				File destinationFile = new File(destination);
				Path sourcePath = sourceFile.toPath();
				Path destinationPath = destinationFile.toPath();
				if (addTo.equals("Attendance")) {
					u = 1;
				} else if (addTo.equals("Notice")) {
					u = 2;
				} else if (addTo.equals("Notes")) {
					u = 3;
				} else if (addTo.equals("Question Paper")) {
					u = 4;
				}

				System.out.println(u);
				switch (u) {
				case 1:
					try {
						if (sourceFileTextField.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Select a file");
							break;
						}
						String myDate = java.text.DateFormat.getDateTimeInstance()
								.format(Calendar.getInstance().getTime());
						String subject = textField.getText();
						// database code
						SessionFactory factory = createSessionFactory();
						Session s = factory.openSession();
						TAttendance ob = new TAttendance();
						ob.setName(fname);
						ob.setDate(myDate);
						ob.setSubject(subject);
						ob.setLocation(destination);
						Transaction tr = s.beginTransaction();
						s.save(ob);
						System.out.println("data inserted");
						tr.commit();
						s.close();
						factory.close();

						Files.copy(sourcePath, destinationPath);
						System.out.print("File Copied");
						JOptionPane.showMessageDialog(null, "Uploaded Successfully");
						frame1.dispose();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				case 2:
					try {
						if (sourceFileTextField.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Select a file");
							break;
						}
						String myDate = java.text.DateFormat.getDateTimeInstance()
								.format(Calendar.getInstance().getTime());
						String subject = textField.getText();
						// database code
						SessionFactory factory = createSessionFactory();
						Session s = factory.openSession();
						TNotices ob = new TNotices();
						ob.setName(fname);
						ob.setDate(myDate);
						ob.setSubject(subject);
						ob.setLocation(destination);
						Transaction tr = s.beginTransaction();
						s.save(ob);
						System.out.println("data inserted");
						tr.commit();
						s.close();
						factory.close();

						Files.copy(sourcePath, destinationPath);
						System.out.print("File Copied");
						JOptionPane.showMessageDialog(null, "Uploaded Successfully");
						frame1.dispose();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				case 3:
					try {
						if (sourceFileTextField.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Select a file");
							break;
						}
						String myDate = java.text.DateFormat.getDateTimeInstance()
								.format(Calendar.getInstance().getTime());
						String subject = textField.getText();
						// database code
						SessionFactory factory = createSessionFactory();
						Session s = factory.openSession();
						TDocs ob = new TDocs();
						ob.setName(fname);
						ob.setDate(myDate);
						ob.setSubject(subject);
						ob.setLocation(destination);
						Transaction tr = s.beginTransaction();
						s.save(ob);
						System.out.println("data inserted");
						tr.commit();
						s.close();
						factory.close();

						Files.copy(sourcePath, destinationPath);
						System.out.print("File Copied");
						JOptionPane.showMessageDialog(null, "Uploaded Successfully");
						frame1.dispose();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				case 4:
					try {
						if (sourceFileTextField.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Select a file");
							break;
						}
						String myDate = java.text.DateFormat.getDateTimeInstance()
								.format(Calendar.getInstance().getTime());
						String subject = textField.getText();
						// database code
						SessionFactory factory = createSessionFactory();
						Session s = factory.openSession();
						QuestionPaper ob = new QuestionPaper();
						ob.setName(fname);
						ob.setDate(myDate);
						ob.setSubject(subject);
						ob.setLocation(destination);
						ob.setUserid(user);
						Transaction tr = s.beginTransaction();
						s.save(ob);
						System.out.println("data inserted");
						tr.commit();
						s.close();
						factory.close();

						Files.copy(sourcePath, destinationPath);
						System.out.print("File Copied");
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				default:
					JOptionPane.showMessageDialog(null, "Select a Category");
				}

			}
		});
		btnUpload.setBounds(375, 192, 89, 23);
		frame1.getContentPane().add(btnUpload);

	}

	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}
}
