package ch08;

public class Employee {
	public final static double INCENTIVE_RATE = 0.1; //인센티브는 10% 고정
	private String name;
	Employee() {};
	Employee(String name){
		this.name = name;
	}
	
	String printName() {
		return name;
	}
	int computePay() { //재정의(overriding) 가능
		return 0;
	}
	final int COMPUTE_INCENTIVE() {//재정의(overriding) 금지
		int result = 0;
		int pay = computePay();
		if (pay >= 10000) {
			result =(int)(pay * INCENTIVE_RATE);
		}
		return result;
	}
	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; }
	 */

}
