
/**
 * The Class Tier2Employee.
 */
public class Tier2Employee extends Employee {
	
	private String certification;
	
	/**
	 * Instantiates a new tier 2 employee.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param address the address
	 * @param phoneNumber the phone number
	 * @param email the email
	 * @param employeeId the employee id
	 * @param clockedIn the clocked in
	 * @param hiredDate the hired date
	 * @param certification the certification
	 */
	public Tier2Employee(String firstName, String lastName, String address, String phoneNumber, String email,
			String employeeId, String clockedIn, String hiredDate, String certification) {
		super(firstName, lastName, address, phoneNumber, email, employeeId, clockedIn, hiredDate);
		// TODO Auto-generated constructor stub
		this.setCert(certification);
	}
	
	/**
	 * Sets the certification.
	 *
	 * @param certification the new certification
	 */
	public void setCert(String certification) {
		this.certification = certification;
	}
	
	/**
	 * Gets the certification
	 *
	 * @return the certification
	 */
	public String getCert() {
		return certification;
	}
	
	/**
	 * Gets the file data.
	 *
	 * @return the file data
	 */
	@Override
	public String getFileData() {
		return super.getFileData() + "," + certification;
	}
	
}
