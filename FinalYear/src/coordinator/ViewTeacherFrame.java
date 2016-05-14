package coordinator;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import teacher.Teachers;

public class ViewTeacherFrame extends JFrame {
	private JPanel p;
	private JTable tableNotice;
	
	private SessionFactory factory;
	public ViewTeacherFrame(String title,SessionFactory f){
		super(title);
		
		factory=f;
		
		Session s=factory.openSession();
		
		String hql="from Teachers";
		Query q=s.createQuery(hql);
		
		List<Teachers> list=q.list();
		
		String records[][]=new String[list.size()][4];
		int r=0;
		for(Teachers rr : list){
			records[r][0]=rr.getName();
			records[r][1]=rr.getEmail();
			records[r][2]=rr.getMobno();
			records[r][3]=rr.getDepartment();
			r++;
			
		}
		String colnames[]={"Name","Email","Mobile No","Department"};
		tableNotice =new JTable(records,colnames);
		add(new JScrollPane(tableNotice));
		
		pack();
		setVisible(true);
}

}
