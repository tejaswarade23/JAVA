package Date;

public class dateMain {
	       
		public static void main(String[] args) {
			Date d1 = new Date();
			Date d2 = new Date();
			
			int choice;
			
			do {
				System.out.println("\n---------DATE MENU---------");
				System.out.println("1. Set Date");
				System.out.println("2. Add Days");
				System.out.println("3. Add Month");
				System.out.println("4. Add Years");
				System.out.println("5. Compare Date");
				System.out.println("6. Display Date");
				System.out.println("7. Exit");
				System.out.println("Enter Choice: ");
				
				choice = ConsoleInput.getInt();
				
				if(choice == 1) {
					
					System.out.println("Enter Day: ");
					int d = ConsoleInput.getInt();
					
					System.out.println("Enter Month: ");
					int m = ConsoleInput.getInt();
					
					System.out.println("Enter Year: ");
					int y = ConsoleInput.getInt();
					
					d1.setDate(d,m,y);
				}
				else if (choice == 2) {
					System.out.println("Enter Days to Add: ");
					int days = ConsoleInput.getInt();
					
					d1.addDays(days);
					System.out.println("Days Added");
				}
				else if (choice == 3) {
					System.out.println("Enter Months to Add: ");
					int months = ConsoleInput.getInt();
					
					d1.addDays(months);
					System.out.println("Months Added");
			    }
				else if (choice == 4) {
					System.out.println("Enter Years to Add: ");
					int Years = ConsoleInput.getInt();
					
					d1.addDays(Years);
					System.out.println("Years Added");
				}
				else if (choice == 5) {
					System.out.println("Enter Second Date: ");
					
					System.out.println("Day: ");
					int d = ConsoleInput.getInt();
					
					System.out.println("Month: ");
					int m = ConsoleInput.getInt();
					
					System.out.println("Year: ");
					int y = ConsoleInput.getInt();			
					
					d2.setDate (d,m,y);
					Date.compareDates(d1,d2);
				}
				else if (choice == 6) {
					d1.display();
				}
				else if (choice == 7) {
					System.out.println("Exiting Program");
				}
				else {
					System.out.println("Invalid Choice");
				}
			}	while (choice != 7);
		}
	}






















