
public class DemoSalesperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saleperson[] obj = new Saleperson[10];
		int id = 111;
		double amt = 25000;
		for(int i=0; i< obj.length; i++)
		{
			
			obj[i] = new Saleperson(id, amt);
			amt = amt + 5000;
			id++;
			
		}
		
		for(var item: obj)
		{
			System.out.println(item.getId() + " " + item.getSaleAmount());
		}
	}

}
