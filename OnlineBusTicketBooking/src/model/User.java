package model;

/**
 * @author Ideas2IT-sivaranjani
 *
 */
public class User {
<<<<<<< HEAD
	private int id;
	private String name;
	private String email;
	private double mobileNumber;
	private String password;
	
=======
        private int id;
        private String name;
        private String email;
        private double mobileNumber;
        private String password;
    
>>>>>>> 77437e3f65a03eaa487bad02719b5cc41984f2c7
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public double getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", password=" + password + "]";
	}
    
    
}
