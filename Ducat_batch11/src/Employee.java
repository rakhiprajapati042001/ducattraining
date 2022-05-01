
public class Employee {
	int age;
	int salary;
	String name;
	
	void print() {
		System.out.println(name + age + salary);
	}
	
	
	
	/**
	 * @param age
	 * @param salary
	 * @param name
	 */
	public Employee(int age, int salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}



	public String test(String s) {
		
		return "welcome";
	}
	
	
	public static void main(String[] args) {
		Employee e = new Employee(18, 18000, "Guest");
		e.print();
	}
	
	
}
