package Employee;

// Class SalesPerson
 public class SalesPerson extends Employee {
	 
    private float commission;

    public SalesPerson(String name, String address, int age, boolean gender, float basicSalary, float commission) {
        super(name, address, age, gender, basicSalary);
        this.commission = commission;
    }
    
    public float getCommission() {
    	return commission;
    }

    @Override
    public String display() {

        System.out.println("------- SalesPerson -------");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Commission: " + this.commission);
        System.out.println("===================================");

        return ""; 
    }
   }

