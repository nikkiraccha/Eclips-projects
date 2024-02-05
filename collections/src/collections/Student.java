package collections;

public class Student {
	
	private int sid;
	private String sname;
	private String email;
	private long mobile;
	
	//setters
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public void setSname(String sname)
	{
		this.sname= sname;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setMobile(long mobile)
	{
		this.mobile=mobile;
	}
	
	//getters
	
	public int getSid()
	{
		return sid;
	}
	public String getSname()
	{
		return sname;
	}
	public String getEmail()
	{
		return email;
	}
	public long getMobile()
	{
		return mobile;
	}

}
