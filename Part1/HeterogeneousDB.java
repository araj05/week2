package week2Project;

public class HeterogeneousDB extends DistributedDB {
	
	public static final double COST_FACTOR = 1.3;

	public HeterogeneousDB(String name, double base_cost, double DB_Storage, int noOfUsers, double costPerUser) {
		super(name, base_cost, DB_Storage, noOfUsers, costPerUser);
		// TODO Auto-generated constructor stub
	}
	
	public double getCostFactor() {
		return COST_FACTOR;
	}
	
	public double monthlyCost() {
		// TODO Auto-generated method stub
		return (base_cost + userCost()*COST_FACTOR);
	}
}
