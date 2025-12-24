package managingstaffrecords.model;

import java.time.LocalDate;
import java.util.List;

import managingstaffrecords.model.AbstractModelObject;

public abstract class MemberOfStaff extends AbstractModelObject {
	
	private String first_name;
	private String surname;
	private LocalDate dateOfBrith;
	private double annual_salary;
	private int staffId;
	
	protected MemberOfStaff() {
    }
	protected MemberOfStaff(String first_name, String surname) {
        this.first_name = first_name;
        this.surname = surname;
    }

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public LocalDate getDateOfBrith() {
		return dateOfBrith;
	}
	public void setDateOfBrith(LocalDate dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	

}
