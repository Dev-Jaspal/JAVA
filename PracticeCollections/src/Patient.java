
public class Patient implements Comparable<Patient> {

	private String Name;
	private int Priority;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPriority() {
		return Priority;
	}
	public void setPriority(int priority) {
		Priority = priority;
	}
	public Patient(String name, int priority) {
		super();
		Name = name;
		Priority = priority;
	}
	
	@Override
	public String toString() {
		return "Patient [Name=" + Name + ", Priority=" + Priority + "]";
	}
	
	@Override
	public int compareTo(Patient o) {
		return this.Priority-o.getPriority();
	}
	
	
}
