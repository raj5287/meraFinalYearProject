package coordinator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notices")
public class Notices {
	private String name,subject,date;

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

	public Notices(String name, String subject, String date) {
		super();
		this.name = name;
		this.subject = subject;
		this.date = date;
	}

	public Notices() {
		super();
	}
	

}
