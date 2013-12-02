package ast;

public class LoggingExample {
	
	private final String helloMember = "SOME CONSTANT STRING";
	
	public LoggingExample() {
		hello = "hello";
	}
	
	@Override
	public String toString() {
		return hello;
	}
	
	public void llog() {
		System.out.println("LOOK AT ME LOG!" + helloMember + "More constant stuff");
	}

}
