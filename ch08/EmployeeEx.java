package ch08;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee[] e = new Employee[5];
		e[0] = new SalaryMan("제니", 2000000);
		e[1] = new SalaryMan("보검", 3000000);
		e[2] = new HourlyEmployment("차은우", 200, 20000);
		e[3] = new HourlyEmployment("로제", 100, 800);
		e[4] = new HourlyEmployment("하니", 300, 10000);
		
		for(int i = 0; i < e.length; i++) {
			System.out.println("이름 : " +e[i].printName());
			System.out.println("급여 : " + e[i].computePay());
			System.out.println("보너스 : " + e[i].COMPUTE_INCENTIVE());
			System.out.println("====================");
		}
		
		
	}


}
