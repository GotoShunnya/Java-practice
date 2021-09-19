package classMethod;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}

public class exception {
    public static void main(String[] arg) {
    	int n1 = -5;
    	int n2 = 0;
    	
    	try {
    		if(n2 < 0 || n1 < 0) {
    			throw new MyException("don't minus!");
    		}
    		System.out.println(n1 / n2);
    	} catch(ArithmeticException e) {
    		System.err.println(e.getMessage());
    	} catch(MyException e) {
    		System.err.println(e.getMessage());
    	}
    	
    }
}
