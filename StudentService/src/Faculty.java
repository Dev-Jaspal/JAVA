
public class Faculty extends CollegeEmployee {
	private boolean tenured;
	
	@Override
	public void display()
	{
		System.out.println("Faculty Data: ");
		super.display();
		System.out.println(" " + tenured);
	}

	public void setTenured(boolean tenured) {
		this.tenured = tenured;
	}
}
