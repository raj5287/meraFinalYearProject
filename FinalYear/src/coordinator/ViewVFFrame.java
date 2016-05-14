package coordinator;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.visitingfaculty.VFaculty;

import teacher.Teachers;

public class ViewVFFrame extends JFrame {
	private JPanel p;
	private JTable tableNotice;
	
	private SessionFactory factory;
	public ViewVFFrame(String title,SessionFactory f){
		super(title);
		
		factory=f;
		
		Session s=factory.openSession();
		
		String hql="from VFaculty";
		Query q=s.createQuery(hql);
		
		List<VFaculty> list=q.list();
		
		String records[][]=new String[list.size()][3];
		int r=0;
		for(VFaculty rr : list){
			records[r][0]=rr.getName();
			records[r][1]=rr.getEmail();
			records[r][2]=rr.getMobno();
			r++;
			
		}
		String colnames[]={"Name","Email","Mobile No"};
		tableNotice =new JTable(records,colnames);
		add(new JScrollPane(tableNotice));
		
		pack();
		setVisible(true);
}

}
