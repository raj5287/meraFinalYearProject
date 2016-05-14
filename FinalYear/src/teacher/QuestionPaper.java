package teacher;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questionpaper")
public class QuestionPaper {
	
	private String name,subject,date,location,userid;

	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public QuestionPaper(String name, String subject, String date, String location, String userid) {
		super();
		this.name = name;
		this.subject = subject;
		this.date = date;
		this.location = location;
		this.userid = userid;
	}

	public QuestionPaper() {
		super();
	}

}
