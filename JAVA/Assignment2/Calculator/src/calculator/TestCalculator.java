package calculator;


public class TestCalculator {
	public static void main(String[] args) {
		System.out.print("Enter the first number : ");
		float num1 = ConsoleInput.getFloat();
		
		System.out.print("Enter the second number : ");
		float num2 = ConsoleInput.getFloat();
		
		Calculator objCalculator = new Calculator();
		int choice;
		do {
			System.out.print("1.Addition of integers\n"
							 + "2.Addition of floats\n"
							 + "3.Addition of doubles\n"
							 + "4.Addition of float and int\n"
							 + "5.Addition of float and double\n"
							 + "6.Addition of int and double\n"
							 + "7.Substraction of integers\n"
							 + "8.Multiplication of integers\n"
							 + "9.Division of integers\n"
							 + "10.Modulus of integers\n"
							 + "11.to exit\n");
			System.out.print("Enter your choice : ");
			choice = 0;
			switch(choice) {
		    case 1: {
		        System.out.println("Addition of integers: " + objCalculator.add(num1, num2));
		    } break;
		    case 2: {
		        System.out.println("Addition of floats: " + objCalculator.add((float)num1, (float)num2));
		    } break;
		    case 3: {
		        System.out.println("Addition of doubles: " + objCalculator.add((double)num1, (double)num2));
		    } break;
		    case 4: {
		        System.out.println("Addition of float and int: " + objCalculator.add((float)num1, num2));
		    } break;
		    case 5: {
		        System.out.println("Addition of float and double: " + objCalculator.add((float)num1, (double)num2));
		    } break;
		    case 6: {
		        System.out.println("Addition of int and double: " + objCalculator.add(num1, (double)num2));
		    } break;
		    case 7: {
		        System.out.println(objCalculator.substract(num1, num2));
		    } break;
		    case 8: {
		        System.out.println(objCalculator.multiplication(num1, num2));
		    } break;
		    case 9: {
		        System.out.println(objCalculator.division(num1, num2));
		    } break;
		    case 10: {
		        System.out.println(objCalculator.modulus(num1, num2));
		    } break;
		    case 11:{
		    	System.out.println("Exiting the program...");
		    }
		        break;
		    default: {
		        System.out.println("Enter valid choice...");
		    }
		}
		System.out.println("-----------------------------------------");
		}while(choice != 11);
		
		
	}
}
