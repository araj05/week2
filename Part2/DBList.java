package Part2;

import java.util.Arrays;

public class DBList {
	private DB[] db;
	private String[] invalidRecords;
	
	public DBList() {
		this.db = new DB[0];
		this.invalidRecords = new String[0];
	}
	
	public DB[] getDBArray() {
		return db;
	}
	
	public String[] getInvalidRecordsArray() {
		return invalidRecords;
	}
	
	public void addDB(DB o) {
		db = Arrays.copyOf(db, db.length + 1);
		db[db.length - 1] = o;
	}
	
	public void addInvalidRecord(String s) {
		invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
		invalidRecords[invalidRecords.length - 1] = s;
	}
	
	public void readFile() {
		
	}
}
