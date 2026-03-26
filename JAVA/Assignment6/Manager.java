package Employee;

public class Manager extends Employee {
    private float hra;

    public Manager(String name, String address, int age, boolean gender, float basicSalary, float hra) {
        super(name, address, age, gender, basicSalary);
        this.hra = hra;
    }
        public float getHra() {
    	return hra;
    }
        public void setHra(float hra) {
        	this.hra = hra;
        }

    @Override
    public String display() {

        System.out.println("------ Manager Details ------");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("HRA: " + this.hra);
        System.out.println("=============================");

        return "";
    }
}