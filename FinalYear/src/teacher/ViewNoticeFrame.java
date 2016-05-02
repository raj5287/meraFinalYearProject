package teacher;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ViewNoticeFrame extends JFrame {
	private JPanel p;
	private JTable tableNotice;
	
	private SessionFactory factory;
	public ViewNoticeFrame(String title,SessionFactory f){
		super(title);
		
		factory=f;
		
		Session s=factory.openSession();
		
		String hql="from TNotices";
		Query q=s.createQuery(hql);
		
		List<TNotices> list=q.list();
		
		String records[][]=new String[list.size()][3];
		int r=0;
		for(TNotices rr : list){
			records[r][0]=rr.getName();
			records[r][1]=rr.getSubject();
			records[r][2]=rr.getDate();
			r++;
			
		}
		String colnames[]={"Name","Subject","Date"};
		tableNotice =new JTable(records,colnames);
		add(new JScrollPane(tableNotice));
		
		pack();
		setVisible(true);
}

}
