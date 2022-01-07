package streams;

public class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;
	private String dateOfBirth;
	public static int count = 0;
	
	public Employee(String n, int a, double s, String dob) {
		id = count;
		count++;
		name = n;
		age = a;
		salary = s;
		dateOfBirth = dob;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void print() {
		System.out.println("Employee Number " + id + ": \nName: " + name + "\nDate Of Birth: " + dateOfBirth + "\nAge: " + age + "\nSalary: " + salary); 
	}
}