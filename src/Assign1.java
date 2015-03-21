// import statements
import java.util.Scanner;
/**
 * This class loops options to allow a user to enter activities into a planner. Used
 * with the OurDate, OurTime, Event, and Planner classes.
 * @author Richard Barney
 * @version 1.0.0 January 2013
 */
public class Assign1 {
	/**
	 * main method as required by JVM.
	 * @param  args   standard command line parameters as a string array.
	 */
	public static void main(String[] args) {
		Planner activity = new Planner();
		OurDate date = new OurDate();
		OurTime time = new OurTime();
		Scanner input = new Scanner(System.in);
		int option = 1; // integer for menu selection
		System.out.println("Welcome to your Activity Planner!");
		
		while (option != 0) { // while option is valid, loop menu
			do {
				System.out.println("Enter 1 to add an activity to your planner  Enter 2 to display activities for a day"
								  +"\nEnter 3 to display activities for a week    Enter 4 to delete an event"
								  +"\nEnter 0 to quit");
				option = input.nextInt();
			} while (option < 0 || option > 4);
			switch(option) {
				case 1: // 1 adds an activity to the planner
					activity.inputActivity();
					break;
				case 2: // 2 displays activities for one day
					date.inputFromKeyboard();
					activity.displayOneDay(date);
					break;
				case 3: // 3 displays activities for seven days
					date.inputFromKeyboard();
					activity.displaySevenDays(date);
					break;
				case 4: // 4 deletes an event at a date and time
					date.inputFromKeyboard();
					time.inputFromKeyboard();
					activity.deleteEvent(date, time);
					break;
			}
		} // end looping thru menu
	
		if (option == 0) { // 0 ends program
			System.out.print("Goodbye.");
		}
	} // end method main
} // end class Assign1