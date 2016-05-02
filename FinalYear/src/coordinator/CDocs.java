package coordinator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cdocs")
public class CDocs {
	private String name,subject,date,idlocation;

	

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
	@Column(name="idlocation")
	public String getLocation() {
		return idlocation;
	}

	public void setLocation(String location) {
		this.idlocation = location;
	}

	public CDocs(String name, String subject, String date, String idlocation) {
		super();
		this.name = name;
		this.subject = subject;
		this.date = date;
		this.idlocation=idlocation;
	}

	public CDocs() {
		super();
	}
	

}
