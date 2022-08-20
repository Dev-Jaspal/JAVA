
public class NewspaperSubsciption implements RateConstants {

	protected String subscriptionName;
	protected float rate;

	public NewspaperSubsciption(String subscriptionName) throws InvalidNameException {
		if(isDigit(subscriptionName))
		{
			throw new InvalidNameException("Name contains digits");
		}
		else
		{
			this.subscriptionName = subscriptionName;
		}
		
		rate = SUBSCRIPTION_RATE;
	}
	
	private static boolean isDigit(String name)
	{
		boolean flag = false;
		char[] chars = name.toCharArray();
		 for(char c : chars){
	         if(Character.isDigit(c)){
	           flag = true;
	          }
	      }
		 return flag;
	}

}
