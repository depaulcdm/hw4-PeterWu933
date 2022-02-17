package hello;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import hello.HelloMessage;

public class HelloWorld {
    static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
		HelloMessage message = new HelloMessage("Hello, Folks!");
        logger.info(message.getText());
    }
}