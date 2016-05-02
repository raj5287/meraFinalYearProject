package coordinator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cnotices")
public class CNotices {
	private String name,subject,date,Location;

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
		return Location;
	}

	public void setLocation(String Location) {
		this.Location = Location;
	}

	public CNotices(String name, String subject, String date,String Location) {
		super();
		this.name = name;
		this.subject = subject;
		this.date = date;
		this.Location = Location;
	}

	public CNotices() {
		super();
	}
	

}
