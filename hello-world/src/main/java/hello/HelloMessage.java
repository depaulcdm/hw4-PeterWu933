package hello;

public class HelloMessage {
	public static final String DEFAULT_TEXT = "Hello, World!";
	
    private String text = HelloMessage.DEFAULT_TEXT;
	
	public HelloMessage() {
	}
	
	public HelloMessage(final String text) {
	    if (text != null && text.trim().length() != 0) {
		    this.text = text;
		}		
	}
	
	public String getText() {
	    return this.text;
	}
	
	public String toString() {
		return this.text;
	}
}