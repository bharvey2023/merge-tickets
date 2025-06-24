
/**
 * The Class Customer.
 */
public class Customer extends Person {
	
	private String customerId;
	private String accountNumber;
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param address the address
	 * @param phoneNumber the phone number
	 * @param email the email
	 * @param customerId the customer id
	 * @param accountNumber the account number
	 */
	public Customer(String firstName, String lastName, String address, String phoneNumber, String email, String customerId, String accountNumber) {
		super(firstName, lastName, address, phoneNumber, email);
		this.setAccountNumber(accountNumber);
		this.setCustomerId(customerId);
	}

	/**
	 * Gets the customer id.
	 *
	 * @return the customer id
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the customer id.
	 *
	 * @param customerId the new customer id
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * Gets the account number.
	 *
	 * @return the account number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Sets the account number.
	 *
	 * @param accountNumber the new account number
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Gets the file data.
	 *
	 * @return the file data
	 */
	@Override
	public String getFileData() {
		return  getCustomerId() + "," + super.getFileData();
	}
}
