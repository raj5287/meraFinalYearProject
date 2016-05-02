package teacher;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tnotices")
public class TNotices {
	private String name,subject,date,location;

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

	public TNotices(String name, String subject, String date, String location) {
		super();
		this.name = name;
		this.subject = subject;
		this.date = date;
		this.location = location;
	}

	public TNotices() {
		super();
	}
	

}
