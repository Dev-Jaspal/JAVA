import java.time.LocalDate;

public class Wedding {
	private LocalDate weddingDate;
	private Couple coupleName;
	private String location;

	public LocalDate getWeddingDate() {
		return weddingDate;
	}

	public Couple getCoupleName() {
		return coupleName;
	}

	public String getLocation() {
		return location;
	}

	public Wedding(LocalDate weddingDate, Couple coupleName, String location) {
		this.weddingDate = weddingDate;
		this.coupleName = coupleName;
		this.location = location;
	}
	
	public String getGroomFullName() {
		return this.coupleName.getGroom().getFname()+ " " + this.coupleName.getGroom().getLname();
	}
	public String getBrideFullName() {
		return this.coupleName.getBride().getFname()+ " " + this.coupleName.getBride().getLname();
	}
}
