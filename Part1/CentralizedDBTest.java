package week2Project;

public class CentralizedDBTest extends CentralizedDB {

	public CentralizedDBTest(String name, double base_cost, double DB_Storage, double license) {
		super(name, base_cost, DB_Storage, license);
		// TODO Auto-generated constructor stub
	}
	
	CentralizedDB test1 = new CentralizedDB("abc", 100.00, 1.000, 10.00);
	public void nameTest() {
		test1.setName("Snofar");
		String s1 = test1.getName();
		System.out.println(s1);
		
	}
	
	public static void main(String[] args) {
		CentralizedDBTest db1 = new CentralizedDBTest("empName1", 100.00, 1000.00, 1.0);
		db1.nameTest();
		System.out.println("Hello");
	}
	
}
