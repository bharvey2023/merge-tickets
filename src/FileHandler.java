import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * The Class FileHandler.
 */
public class FileHandler {

	/**
	 * Write data to workorderfile.
	 *
	 * @param wOFile the workorder file name.
	 */
	public static void writeData(String wOFile)  {
		
		logger("Creating Work Orders");
		System.out.println("Writing Work Orders");
		logger("Writing Work Orders");

		PrintWriter out;
		try {
			out = new PrintWriter(Project3.workOrderFileName);

			out.println("customer_id,customer_first_name,customer_last_name,ticket_id,ticket_createdAt,workorder_createdAt,employee_id,employee_first_name,employee_last_name,clocked_in,certification");

			for(WorkOrder e : Project3.workOrderList) {
				out.println(e.getFileData());
				logger(e.getFileData());
			}

			System.out.println("Done! Exiting now.");
			logger("Done! Exiting now.");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	/**
	 * Read employees data.
	 *
	 * @param empFile the emp file
	 */
	public static void readEmployeesData(String empFile) {
		
		System.out.println("Loading Employee Data");
		logger("Loading Employee Data");
		
		File emp = new File(empFile);

		try {
			Scanner in = new Scanner(emp);

			in.nextLine();

			while(in.hasNextLine()) {
				String grabEmp = in.nextLine();

				String[] order = grabEmp.split(",");

				if(order[8].equalsIgnoreCase("tier1")) {

					Employee emp1 = new Employee(order[1], order[2], order[5], order[3], order[4], order[0], order[6], order[7]);
					Project3.employeeList.add(emp1);

				}
				else {

					Employee emp2 = new Tier2Employee(order[1], order[2], order[5], order[3], order[4], order[0], order[6], order[7], order[9]);
					Project3.employeeList.add(emp2);

				}
			}


			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not found");
		}

	}

	/**
	 * Read ticket data.
	 *
	 * @param ticketfile the ticketfile
	 * @return the linked list
	 */
	public static LinkedList<Ticket> readTicketData(String ticketfile){
		
		System.out.println("Loading Ticket Data");
		logger("Loading Ticket Data");

		Queue<Ticket> ticData = new LinkedList<Ticket>();

		File tick = new File(ticketfile);

		try {
			Scanner in = new Scanner(tick);

			in.nextLine();

			while(in.hasNextLine()) {

				String grabTick = in.nextLine();

				String[] order = grabTick.split(",");

				Customer cusInfo = new Customer(order[1], order[2], order[3], order[4], order[5], order[0], order[6]);

				Ticket bothTier = new Ticket(cusInfo, order[8], order[7]);

				ticData.add(bothTier);
			}


			in.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not found");
		}

		return (LinkedList<Ticket>) ticData;

	}

	/**
	 * Logs the data to a log file.
	 *
	 * @param log the log
	 */
	private static void logger(String log) {
		
		try {
			FileWriter logIt = new FileWriter("log.txt", true);
			PrintWriter logg = new PrintWriter(logIt);
			
			logg.println("log: " + log);
			
			logg.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
