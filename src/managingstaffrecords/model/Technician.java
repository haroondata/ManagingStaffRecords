package managingstaffrecords.model;

public class Technician extends MemberOfStaff {
    private String department;

	public Technician() {
		super();
	}
	
	public Technician(String first_name,String surname,String department) {
		super(first_name,surname);
		this.department = department;
		
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
