package ast;

public class LoggingExample {
	
	private final String hello;
	
	public LoggingExample() {
		hello = "hello";
	}
	
	@Override
	public String toString() {
		return hello;
	}
	
	public void llog() {
		System.out.println("LOOK AT ME LOG!" + hello + "More constant stuff");
	}

}
