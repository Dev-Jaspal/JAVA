
public class TestBloodData {

	public static void main(String[] args) {

		BloodData obj = new BloodData();
		System.out.println("Blood type: " + obj.getBloodType());
		System.out.println("RH Factor: " + obj.getRhFactor());
		
		obj = new BloodData("A", "-");
		System.out.println("Blood type: " + obj.getBloodType());
		System.out.println("RH Factor: " + obj.getRhFactor());
	}

}
