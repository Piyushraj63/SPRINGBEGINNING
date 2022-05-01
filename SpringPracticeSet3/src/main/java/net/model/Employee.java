package net.model;

public class Employee {
   
    private String m_strFname;
    private String m_strLname;
    private Address m_strAddress;
    
	public String getM_strFname() {
		return m_strFname;
	}
	public void setM_strFname(String m_strFname) {
		this.m_strFname = m_strFname;
	}
	public String getM_strLname() {
		return m_strLname;
	}
	public void setM_strLname(String m_strLname) {
		this.m_strLname = m_strLname;
	}
	public Address getM_strAddress() {
		return m_strAddress;
	}
	public void setM_strAddress(Address m_strAddress) {
		this.m_strAddress = m_strAddress;
	}
	@Override
	public String toString() {
		return "Employee [m_strFname=" + m_strFname + ", m_strLname=" + m_strLname + ", m_strAddress=" + m_strAddress + "]";
	}
   
	
   
	
}
