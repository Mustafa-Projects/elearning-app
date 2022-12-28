package in.ashokit;

public class Passenger {
	private String fname;
	private String lname;
	private Long phno;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", lname=" + lname + ", phno=" + phno + "]";
	}
	

}
