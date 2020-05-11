package exceptionHandling;

// Here finally black will not get executed bec System.exit(0) is executed in try
public class SystemExit {

	public static void main(String []arags) {
	try {
		
		int a =10/0;
		System.exit(0);
		
	}
	catch (ArithmeticException e){
		System.out.println(e.toString());
	}
	finally {
		System.out.println("Finally Block");
	}
}
}
