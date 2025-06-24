
/**
 * The Class Ticket.
 */
public class Ticket implements Printable {
	
	private Customer customer;
	private String createdAt;
	private String ticketId;
	
	/**
	 * Instantiates a new ticket.
	 *
	 * @param customer the customer
	 * @param createdAt the created at
	 * @param ticketId the ticket id
	 */
	public Ticket(Customer customer, String createdAt, String ticketId) {
		this.setCreatedAt(createdAt);
		this.setCustomer(customer);
		this.setTicketId(ticketId);
	}
	
	
	/**
	 * Gets the file data.
	 *
	 * @return the file data
	 */
	@Override
	public String getFileData() {
		// TODO Auto-generated method stub
		return customer.getFileData() + "," + ticketId + "," + createdAt;
	}


	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}


	/**
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	/**
	 * Gets the created at.
	 *
	 * @return the created at
	 */
	public String getCreatedAt() {
		return createdAt;
	}


	/**
	 * Sets the created at.
	 *
	 * @param createdAt the new created at
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	/**
	 * Gets the ticket id.
	 *
	 * @return the ticket id
	 */
	public String getTicketId() {
		return ticketId;
	}


	/**
	 * Sets the ticket id.
	 *
	 * @param ticketId the new ticket id
	 */
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	
	
	
}
