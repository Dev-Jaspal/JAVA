
public class Computer {

	private String cpu;
	private int ram;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public Computer(String cpu, int ram) {
		this.cpu = cpu;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + "GB]";
	}
	
}
