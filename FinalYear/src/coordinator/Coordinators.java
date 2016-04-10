package coordinator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coordinators")
public class Coordinators {
	
	private String name,email,mobno,userid,password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	@Id
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Coordinators(String name, String email, String mobno, String userid, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mobno = mobno;
		this.userid = userid;
		this.password = password;
	}

	public Coordinators() {
		super();
	}
	

}
