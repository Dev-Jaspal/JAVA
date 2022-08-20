
public class Patient {
   private int patientId;
   private int patientAge;
   private BloodData bloodData;
   
   public int getId()
   {
	   return patientId;
   }
   
   public int getAge()
   {
	   return patientAge;
   }
   
   public BloodData getBloodData()
   {
	   return this.bloodData;
   }
   
   public Patient()
   {
	   this.patientId = 0;
	   this.patientAge = 0;
	   this.bloodData = new BloodData();
   }
   
   public Patient(int id, int age, BloodData bloodData)
   {
	   patientAge = age;
	   patientId = id;
	   this.bloodData = bloodData;
   }
}
