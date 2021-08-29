package model;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Aug 27, 2021
 */
public class Employee {
	
	
	public static void main (String[] args) {

		private String name;
		private double monthlySalary;
		private int age;
		
	}
	


	public Employee() {
		
		super();
	}
	
	public Employee(String name) {
		super();
		this.name = name;
		
	}
	private String name;
	/**
	 * @return the name
	 */
	
	
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	private double monthlySalary;
	private int age;

}
