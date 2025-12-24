package managingstaffrecords.model;

public class Manager extends MemberOfStaff {
	private String managerDepartment;
    private double bonus;
    private String responsibilityLevel; 
    private int grade;
    private double managedBudget;
    
    public Manager() {
        super();
    }
    public Manager(String firstName, String surname, String managerDepartment,double bonus,String responsibilityLevel,int grade,double managedBudget ) {
        super(firstName, surname);
        this.managerDepartment = managerDepartment;
        this.bonus = bonus;
        this.responsibilityLevel = responsibilityLevel; 
        this.grade = grade;
        this.managedBudget = managedBudget;
    }
	public String getManagerDepartment() {
		return managerDepartment;
	}
	public void setManagerDepartment(String managerDepartment) {
		this.managerDepartment = managerDepartment;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getResponsibilityLevel() {
		return responsibilityLevel;
	}
	public void setResponsibilityLevel(String responsibilityLevel) {
		this.responsibilityLevel = responsibilityLevel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getManagedBudget() {
		return managedBudget;
	}
	public void setManagedBudget(double managedBudget) {
		this.managedBudget = managedBudget;
	}

}
