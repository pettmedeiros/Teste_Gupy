package entities;

public class FuncionarioEx {
	private int id;
	private String name;
	private double salary;
	
	
	public FuncionarioEx(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentagem) {
		salary += salary * percentagem / 100;
		
	}
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	

}
