package Staff;

public class Admin {

	
	public class Manager extends ClinicStaff{

		public Manager(String firstName, String surname, String title, int staffID, int salary) {
			super(firstName, surname, title, staffID, salary);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	
	public class Assistant extends ClinicStaff{
		
		
	public Assistant (String firstName, String surname, String title, int staffID, int salary) {
			super(firstName, surname, title, staffID, salary);
			// TODO Auto-generated constructor stub
		}

	}
	
	
	public class Receptionist extends ClinicStaff{

		public Receptionist(String firstName, String surname, String title, int staffID, int salary) {
			super(firstName, surname, title, staffID, salary);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	
	public class CustomerService extends ClinicStaff{

		public CustomerService(String firstName, String surname, String title, int staffID, int salary) {
			super(firstName, surname, title, staffID, salary);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	
}


