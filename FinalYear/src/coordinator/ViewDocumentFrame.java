package coordinator;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ViewDocumentFrame extends JFrame {

	private JPanel p;
	private JTable tableDocs;
	
	private SessionFactory factory;
	public ViewDocumentFrame(String title,SessionFactory f){
		super(title);
		
		factory=f;
		
		Session s=factory.openSession();
		
		String hql="from Documents";
		Query q=s.createQuery(hql);
		
		List<Documents> list=q.list();
		
		String records[][]=new String[list.size()][4];
		int r=0;
		for(Documents rr : list){
			records[r][0]=rr.getName();
			records[r][1]=rr.getSubject();
			records[r][2]=rr.getDate();
			r++;
			
		}
		String colnames[]={"Name","Subject","Date","Download"};
		tableDocs =new JTable(records,colnames);
		add(new JScrollPane(tableDocs));
		
		pack();
		setVisible(true);
}
	
}
