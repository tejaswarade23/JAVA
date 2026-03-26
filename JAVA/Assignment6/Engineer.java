package Employee;


           // Class Engineer
		public class Engineer extends Employee
			{
		protected float overTime;

		public Engineer(String name, String address, int age, boolean gender, float basicSalary, float ot) {
			super(name, address, age, gender, basicSalary);
		    this.overTime = ot;
 
		}
		public float getOverTime() {
			return overTime;
		}
		public void setOverTime(float overTime) {
			this.overTime = overTime;
		}

		@Override
		
		public String display() {

		    System.out.println("------- Engineer Details -------");
		    System.out.println("Name: " + this.name);
		    System.out.println("Address: " + this.address);
		    System.out.println("Age: " + this.age);
		    System.out.println("Gender: " + this.gender);
		    System.out.println("Basic Salary: " + this.basicSalary);
		    System.out.println("OverTime: " + this.overTime);
		    System.out.println("===================================");

		    return ""; 
	
}

}
