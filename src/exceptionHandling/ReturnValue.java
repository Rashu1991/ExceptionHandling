package exceptionHandling;

public class ReturnValue {
	
	public static String CaseI() {
		/*
		 * In this method value is returned from outside of try-catch-finally block.
		 * It is completely valid.
		 */
		try {
			int a =10/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			System.out.println("Finally block");
		}
		return "valid";
	}
	
	public static String caseII() {
		try {
			int a=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		finally {
			return "return from finally block";
		}
	}
	
	
	public static  String caseIII() {
		try {
			return "return from try block";
		}
		catch(Exception e) {
			return "return from catch block";
		}
		finally {
			System.out.println("In finally block");
		}
	}
	
	public static String caseIV() {
		try {
			return "return from try block";
		}
		catch(Exception e) {
			
			return "return from catch block";
		} 
		finally {
			return "return from finally block";
		}
	}
	
	
	public static void main(String []args) {
		//System.out.println(ReturnValue.CaseI());
		//System.out.println(ReturnValue.caseII());
		//System.out.println(ReturnValue.caseIII());
		//System.out.println(ReturnValue.caseIV());
	}
	
	
}
