
public class TestPatient {

	public static void main(String[] args) {
		
		Patient obj = new Patient();
		System.out.println("Patient ID: "+ obj.getId());
		System.out.println("Patient Age: "+ obj.getAge());
		System.out.println("Patient Blood Type: "+ obj.getBloodData().getBloodType());
		System.out.println("Patient RH factor: "+ obj.getBloodData().getRhFactor());
		
		obj = new Patient(9999, 28, new BloodData("A", "-"));
		System.out.println("Patient ID: "+ obj.getId());
		System.out.println("Patient Age: "+ obj.getAge());
		System.out.println("Patient Blood Type: "+ obj.getBloodData().getBloodType());
		System.out.println("Patient RH factor: "+ obj.getBloodData().getRhFactor());
	}

}
