package Program;

public class Program {
	
	private static String getString() {
		try {
			byte [] input = new byte [100];
		
			int len = System.in.read(input);
			
			byte[]finalInput = new byte [len - 2];
			System.arraycopy(input, 0, finalInput, 0, len - 2);
			
			String objString = new String (finalInput);
			System.out.println("Input is "+ objString);
			
			return objString;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	private static int getInt() {
		String s1 = getString();
		int num = Integer.parseInt(s1);
		return num;
	}
	private static float getFloat() {
		return Float.parseFloat(getString());
	}
	public static void main(String [] args) {
		System.out.println("Enter the FirstNumber : ");
		float num1 = getFloat();
		
		System.out.println("Enter the SecondNumber : ");
		int num2 = getInt();
	
		System.out.println(num1 + num2);
		}
}
