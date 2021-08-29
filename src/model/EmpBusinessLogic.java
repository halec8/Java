package model;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Aug 27, 2021
 */
public class EmpBusinessLogic {
	
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		
		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		}
		else {
			appraisal = 1000;
		}
		return appraisal;
	}

	/**
	 * @param employee
	 * @return
	 */
	public boolean isRetirementAge(Employee employee) {
		// TODO Auto-generated method stub
		
		
		int retirementAge = 70;
		
		if (employee.getAge() >= retirementAge) {
			
			return true;
			
		}
		else {
			return false;
		}
		
	}

}
