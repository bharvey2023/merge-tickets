
/**
 * The Class WorkOrder.
 */
public class WorkOrder implements Printable {
	
	private Employee employee;
	private Ticket ticket;
	private String createdAt;
	
	/**
	 * Instantiates a new work order.
	 *
	 * @param employee the employee
	 * @param ticket the ticket
	 * @param createdAt the created at
	 */
	public WorkOrder(Employee employee, Ticket ticket, String createdAt) {
		this.setCreatedAt(createdAt);
		this.setEmployee(employee);
		this.setTicket(ticket);
	}
	
	/**
	 * Gets the employee.
	 *
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	
	/**
	 * Sets the employee.
	 *
	 * @param employee the new employee
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	/**
	 * Gets the ticket.
	 *
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}
	
	/**
	 * Sets the ticket.
	 *
	 * @param ticket the new ticket
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
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
	 * Gets the file data.
	 *
	 * @return the file data
	 */
	@Override
	public String getFileData() {
		// TODO Auto-generated method stub
		return ticket.getFileData() + "," + createdAt + "," + employee.getFileData() ;
	}

}
