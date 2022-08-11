package week2Project;

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
	
	public String toString() {
		String s1 = "Database (Centralized DB) Monthly Cost: ";
		String s2 = String.valueOf(monthlyCost());
		String s3 = super.toString();
		String s4 = String.valueOf(getLicense());
		return (s1 + s2 + "\n" + s3);
	}

}
