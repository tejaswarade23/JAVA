package Employee;

public abstract class Employee 
{
	protected String name ;
	protected String address;
	protected int age;
	protected boolean gender;
	protected float basicSalary;

	public Employee(String name, String address, int age, boolean gender, float basicSalary)
	{
		super();
		setName(name);
		setAddress(address);
		setAge(age);
		setGender(gender);
		setbasicSalary(basicSalary);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.length() > 5 || name.equals(""))
			name = "Default";
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public float getbasicSalary() {
		return basicSalary;
	}

	public void setbasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
		
    }
	
	public String display() {

	    System.out.println("Name: " + name);
	    System.out.println("Address: " + address);
	    System.out.println("Age: " + age);
	    System.out.println("Gender: " + gender);
	    System.out.println("Basic Salary: " + basicSalary);

	    return "";
	}
}

