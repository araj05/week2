package Part2;

public class HomogeneousDB extends DistributedDB {
	
	public static final double COST_FACTOR = 1.2;
	
	public HomogeneousDB(String name, double base_cost, double DB_Storage, int noOfUsers, double costPerUser) {
		super(name, base_cost, DB_Storage, noOfUsers, costPerUser);
	}
	
	public double getCostFactor() {
		return COST_FACTOR;
	}
	
	public double monthlyCost() {
		// TODO Auto-generated method stub
		return (base_cost + userCost()*COST_FACTOR);
	}

}
