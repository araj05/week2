package Part2;

public abstract class DB implements Comparable<DB>{
	protected String name;
	protected double base_cost;
	protected double DB_Storage;
	protected static int count = 0;
	
	public DB (String name, double base_cost, double DB_Storage) {
		this.name = name;
		this.base_cost = base_cost;
		this.DB_Storage = DB_Storage;
		count++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public double getBaseCost() {
		return base_cost;
	}
	
	public void setBaseCost(double newBaseCost) {
		this.base_cost = newBaseCost;
	}
	
	public double getDbStorage() {
		return DB_Storage;
	}
	
	public void setDbStorage(double newDbStorage) {
		this.DB_Storage = newDbStorage;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void resetCount() {
		count = 0;
	}
	
	public String toString() {
		String s1 = name;
		String s2 = String.valueOf(base_cost);
		String s3 = String.valueOf(DB_Storage);
		return (s1 + s2 + s3);
	}
	
	public abstract double monthlyCost();
	
	public int compareTo(DB o1, DB o2) {
		if (o1 == o2)
            return 0;
        if (o1 == null)
            return 1;
        if (o2 == null)
            return -1;
        return o1.compareTo(o2);
	}
}
