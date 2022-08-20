
public class PhysicalNewspaperSubcription extends NewspaperSubsciption{

	protected String subsType;
	public PhysicalNewspaperSubcription(String subscriptionName) throws InvalidNameException {
		super(subscriptionName);
		subsType = "PhysicalSUB";
	}
	
	@Override
	public String toString() {
		return "PhysicalNewspaperSubcription [subsType=" + subsType + ", subscriptionName=" + subscriptionName
				+ ", rate=" + rate + "]";
	}

}
