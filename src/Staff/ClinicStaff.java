package Staff;


public abstract class ClinicStaff {
	
	private String firstName;
	private String surname;
	private String title;
	private final int staffID;
	protected int salary;
	
	

	public ClinicStaff(String firstName, String surname, String title, int staffID, int salary) {

		this.firstName = firstName;
		this.surname = surname;
		this.title = title;
		this.staffID = staffID;
		this.salary = 1;
		
	}

}
