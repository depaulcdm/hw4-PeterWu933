package hello;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;


public class HelloMessageTest {
    private HelloMessage message = null;
	
	@Test
	public void testDefaultMessage() {
		this.message = new HelloMessage();
		assertThat(this.message.getText(), is(equalTo(HelloMessage.DEFAULT_TEXT)));
	}

	@Test
	public void testOverridenMessage() {
		final String messageText = "Hello, Folks!";
		
		this.message = new HelloMessage(messageText);
		assertThat(this.message.getText(), is(equalTo(messageText)));
	}

	@Test
	public void testNullMessage() {
		this.message = new HelloMessage(null);
		assertThat(this.message.getText(), is(equalTo(HelloMessage.DEFAULT_TEXT)));
	}

	@Test
	public void testEmptyMessage() {
		this.message = new HelloMessage("");
		assertThat(this.message.getText(), is(equalTo(HelloMessage.DEFAULT_TEXT)));
	}
}