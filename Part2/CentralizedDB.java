package Part2;

public class CentralizedDB extends DB {
	
	private double license;
	
	public CentralizedDB(String name, double base_cost, double DB_Storage, double license) {
		super("name", base_cost, DB_Storage);
		this.license = license;
	}

	@Override
	public double monthlyCost() {
		// TODO Auto-generated method stub
		return (base_cost + license);
	}
	
	public double getLicense() {
		return license;
	}
	
	public void setLicense(double newLicense) {
		this.license = newLicense;
	}
	
	public String printer() {
		System.out.println(String.valueOf(license));
		return super.toString();
	}
	
	public String toString() {
		String s1 = super.toString();
		String s2 = String.valueOf(license);
		return (s1 + s2);
	}

	@Override
	public int compareTo(DB o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
