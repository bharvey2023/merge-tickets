/*
 * Author: Bryce Harvey N01508279
 * Course: COP3503
 * Project #: 3
 * Title: Merging documents with each respected tier
 * Due Date: 4/16/2024
 * 
 * Merge road speed and volume data to one file and output extra avgs at end
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Queue;

/**
 * The Class Project3.
 */
public class Project3 {

	public static String employeeFileName = "employee_data.csv";
	public static String tier1TicketFileName = "tier1_ticket_data.csv";
	public static String tier2TicketFileName = "tier2_ticket_data.csv";
	public static String workOrderFileName = "workorder_data.csv";
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static Queue<Ticket> tier1TicketList;
	public static Queue<Ticket> tier2TicketList;
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHandler.readEmployeesData(employeeFileName);

		tier1TicketList = FileHandler.readTicketData(tier1TicketFileName);
		tier2TicketList = FileHandler.readTicketData(tier2TicketFileName);
		createWorkOrders();


	}

	/**
	 * Creates the work orders.
	 */
	public static void createWorkOrders() {
		System.out.println("Creating Work Orders");

		//WorkOrder orders = new WorkOrder();

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date created = new Date();

		//int i = 0;

		while(!(tier2TicketList.isEmpty())) {

			for(Employee e : employeeList) {
				if(e instanceof Tier2Employee) {
					String curr = dateFormat.format(created);
					Ticket t = tier2TicketList.poll();
					WorkOrder work = new WorkOrder(e, t, curr);
					workOrderList.add(work);
				}

			}

			while(!(tier1TicketList.isEmpty())) {
				for(Employee e : employeeList) {
					if(e instanceof Employee) {
						String curr = dateFormat.format(created);
						Ticket t = tier1TicketList.poll();
						WorkOrder work = new WorkOrder(e, t, curr);
						workOrderList.add(work);
					}
				}
			}


		}

		FileHandler.writeData(workOrderFileName);


	}

}
