
public class Student implements Comparable<Student> {
	
	private String StudName;
	private int StudID;
	private String StudDob;
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public int getStudID() {
		return StudID;
	}
	public void setStudID(int studID) {
		StudID = studID;
	}
	public String getStudDob() {
		return StudDob;
	}
	public void setStudDob(String studDob) {
		StudDob = studDob;
	}
	@Override
	public String toString() {
		return "Student [StudName=" + StudName + ", StudID=" + StudID + ", StudDob=" + StudDob + "]";
	}
	public Student(String studName, int studID, String studDob) {
		super();
		StudName = studName;
		StudID = studID;
		StudDob = studDob;
	}
	
	@Override
	public int compareTo(Student stud) {
		if(this.StudID < stud.getStudID())
			return -1;
		else if(this.StudID == stud.getStudID())
			return 0;
		else
			return 1;
	}
	
	

}
