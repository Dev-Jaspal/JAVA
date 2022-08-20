
public class Saleperson {
	private int id;
	private double saleAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(double saleAmount) {
		this.saleAmount = saleAmount;
	}

	public Saleperson(int id, double saleAmount) {
		super();
		this.id = id;
		this.saleAmount = saleAmount;
	}
}
