package com.visitingfaculty;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.student.Students;

import teacher.TNotices;

public class ViewStudentList extends JFrame {
	private JPanel p;
	private JTable tableNotice;
	
	private SessionFactory factory;
	public ViewStudentList(String title,SessionFactory f){
		super(title);
		
		factory=f;
		
		Session s=factory.openSession();
		
		String hql="from Students";
		Query q=s.createQuery(hql);
		
		List<Students> list=q.list();
		
		String records[][]=new String[list.size()][3];
		int r=0;
		for(Students rr : list){
			records[r][0]=rr.getName();
			records[r][1]=rr.getUrollno();
			r++;
			
		}
		String colnames[]={"Name","University Roll Number"};
		tableNotice =new JTable(records,colnames);
		add(new JScrollPane(tableNotice));
		
		pack();
		setVisible(true);
}


}
