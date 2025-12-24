package managingstaffrecords.model;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends MemberOfStaff {
	private List<String> modulesTaught;
	public Lecturer() {
		super();
		modulesTaught = new ArrayList<>();
	}
	
	public Lecturer(String first_name, String surname) {
		super(first_name,surname);
		modulesTaught = new ArrayList<>();
	} 
	public List<String> getModulesTaught() {
		return modulesTaught;
	}
	public void setModulesTaught(List<String> modulesTaught) {
		this.modulesTaught = modulesTaught;
	}
	
	 public void addModule(String module) {
	        modulesTaught.add(module);
	    }

	    public void removeModule(String module) {
	        modulesTaught.remove(module);
	    }

}
