package Date;

public class ConsoleInput {
	
		public static String getString() {
			try {
				byte [] input = new byte[100];
				
				int len = System.in.read(input);
				
				byte [] finalInput = new byte[len - 2];
				
				System.arraycopy(input, 0, finalInput, 0, len-2);
				
				return new String(finalInput);
				 
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public static int getInt() {
			return Integer.parseInt(getString());
		}
		
		public static float getFloat() {
			return Float.parseFloat(getString());
		}
		public static boolean getboolean() {
			
			return Boolean.parseBoolean(getString());
		}
		
	}


