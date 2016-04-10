package com.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="students")
public class Students {
	
	
	private String emailid, password,name,gender,fname,foccupation, mname,dob,presentadsress, permaddress,pic;
	private String smobno,fmobno,uregno,urollno;
	//tenth details
	private String tnoe,tyop,tboard,tsname,tmos,tsper,tactper;
	//twelfth details
	private String twnoe,twyop,twboard,twsname,twmos,twsper,twactper;
	//diploma details
	private String dnou,stream,dyop,dsper;
	//b.tech details
	private int marks1,marks2,marks3,marks4,marks5,marks6,marks7,marks8;
	
	@Id
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFoccupation() {
		return foccupation;
	}
	public void setFoccupation(String foccupation) {
		this.foccupation = foccupation;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPresentadsress() {
		return presentadsress;
	}
	public void setPresentadsress(String presentadsress) {
		this.presentadsress = presentadsress;
	}
	public String getPermaddress() {
		return permaddress;
	}
	public void setPermaddress(String permaddress) {
		this.permaddress = permaddress;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getSmobno() {
		return smobno;
	}
	public void setSmobno(String smobno) {
		this.smobno = smobno;
	}
	public String getFmobno() {
		return fmobno;
	}
	public void setFmobno(String fmobno) {
		this.fmobno = fmobno;
	}
	public String getTnoe() {
		return tnoe;
	}
	public void setTnoe(String tnoe) {
		this.tnoe = tnoe;
	}
	public String getTyop() {
		return tyop;
	}
	public void setTyop(String tyop) {
		this.tyop = tyop;
	}
	public String getTboard() {
		return tboard;
	}
	public void setTboard(String tboard) {
		this.tboard = tboard;
	}
	public String getTsname() {
		return tsname;
	}
	public void setTsname(String tsname) {
		this.tsname = tsname;
	}
	public String getTmos() {
		return tmos;
	}
	public void setTmos(String tmos) {
		this.tmos = tmos;
	}
	public String getTsper() {
		return tsper;
	}
	public void setTsper(String tsper) {
		this.tsper = tsper;
	}
	public String getTactper() {
		return tactper;
	}
	public void setTactper(String tactper) {
		this.tactper = tactper;
	}
	public String getTwnoe() {
		return twnoe;
	}
	public void setTwnoe(String twnoe) {
		this.twnoe = twnoe;
	}
	public String getTwyop() {
		return twyop;
	}
	public void setTwyop(String twyop) {
		this.twyop = twyop;
	}
	public String getTwboard() {
		return twboard;
	}
	public void setTwboard(String twboard) {
		this.twboard = twboard;
	}
	public String getTwsname() {
		return twsname;
	}
	public void setTwsname(String twsname) {
		this.twsname = twsname;
	}
	public String getTwmos() {
		return twmos;
	}
	public void setTwmos(String twmos) {
		this.twmos = twmos;
	}
	public String getTwsper() {
		return twsper;
	}
	public void setTwsper(String twsper) {
		this.twsper = twsper;
	}
	public String getTwactper() {
		return twactper;
	}
	public void setTwactper(String twactper) {
		this.twactper = twactper;
	}
	public String getDnou() {
		return dnou;
	}
	public void setDnou(String dnou) {
		this.dnou = dnou;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getDyop() {
		return dyop;
	}
	public void setDyop(String dyop) {
		this.dyop = dyop;
	}
	public String getDsper() {
		return dsper;
	}
	public void setDsper(String dsper) {
		this.dsper = dsper;
	}
	public String getUregno() {
		return uregno;
	}
	public void setUregno(String uregno) {
		this.uregno = uregno;
	}
	public String getUrollno() {
		return urollno;
	}
	public void setUrollno(String urollno) {
		this.urollno = urollno;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public int getMarks4() {
		return marks4;
	}
	public void setMarks4(int marks4) {
		this.marks4 = marks4;
	}
	public int getMarks5() {
		return marks5;
	}
	public void setMarks5(int marks5) {
		this.marks5 = marks5;
	}
	public int getMarks6() {
		return marks6;
	}
	public void setMarks6(int marks6) {
		this.marks6 = marks6;
	}
	public int getMarks7() {
		return marks7;
	}
	public void setMarks7(int marks7) {
		this.marks7 = marks7;
	}
	public int getMarks8() {
		return marks8;
	}
	public void setMarks8(int marks8) {
		this.marks8 = marks8;
	}
	public Students(String emailid, String password, String name, String gender, String fname, String foccupation,
			String mname, String dob, String presentadsress, String permaddress, String pic, String smobno, String fmobno,
			String tnoe, String tyop, String tboard, String tsname, String tmos, String tsper, String tactper,
			String twnoe, String twyop, String twboard, String twsname, String twmos, String twsper, String twactper,
			String dnou, String stream, String dyop, String dsper, String uregno, String urollno, int marks1, int marks2,
			int marks3, int marks4, int marks5, int marks6, int marks7, int marks8) {
		super();
		this.emailid = emailid;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.fname = fname;
		this.foccupation = foccupation;
		this.mname = mname;
		this.dob = dob;
		this.presentadsress = presentadsress;
		this.permaddress = permaddress;
		this.pic = pic;
		this.smobno = smobno;
		this.fmobno = fmobno;
		this.tnoe = tnoe;
		this.tyop = tyop;
		this.tboard = tboard;
		this.tsname = tsname;
		this.tmos = tmos;
		this.tsper = tsper;
		this.tactper = tactper;
		this.twnoe = twnoe;
		this.twyop = twyop;
		this.twboard = twboard;
		this.twsname = twsname;
		this.twmos = twmos;
		this.twsper = twsper;
		this.twactper = twactper;
		this.dnou = dnou;
		this.stream = stream;
		this.dyop = dyop;
		this.dsper = dsper;
		this.uregno = uregno;
		this.urollno = urollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.marks4 = marks4;
		this.marks5 = marks5;
		this.marks6 = marks6;
		this.marks7 = marks7;
		this.marks8 = marks8;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
