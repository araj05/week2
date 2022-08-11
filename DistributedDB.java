package week2Project;

public class DistributedDB extends DB {
	
	protected int noOfUsers;
	protected double costPerUser;
	public static final double COST_FACTOR = 1.1;

	public DistributedDB(String name, double base_cost, double DB_Storage, int noOfUsers, double costPerUser) {
		super(name, base_cost, DB_Storage);
		this.noOfUsers = noOfUsers;
		this.costPerUser = costPerUser;
	}
	
	public double getNumberOfUsers() {
		return noOfUsers;
	}
	
	public void setNumberOfUsers(int newNumberOfUsers) {
		this.noOfUsers = newNumberOfUsers;
	}
	
	public double getCostPerUser() {
		return costPerUser;
	}
	
	public void setCostPerUser(double newCostPerUser) {
		this.costPerUser = newCostPerUser;
	}
	
	public double userCost() {
		return (noOfUsers*costPerUser);
	}
	
	public double getCostFactor() {
		return COST_FACTOR;
	}
	
	@Override
	public double monthlyCost() {
		// TODO Auto-generated method stub
		return (base_cost + userCost()*COST_FACTOR);
	}
	
	public String toString() {
		String s1 = super.toString();
		String s2 = String.valueOf(noOfUsers);
		String s3 = String.valueOf(costPerUser);
		String s4 = String.valueOf(userCost());
		String s5 = String.valueOf(COST_FACTOR);
		return (s1 + s2 + s3 + s4 + s5);
	}

}
