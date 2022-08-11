package week2Project;

public class DBPart1 {

	public DBPart1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CentralizedDB db1 = new CentralizedDB("empName1", 100.00, 1000.00, 1.0);
		String a = db1.toString();
		System.out.println(a);
	}

}
