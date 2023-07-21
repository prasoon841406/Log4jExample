package in.avantel;

import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger;

public class Test
{
	private static final Logger log=LogManager.getLogger(Test.class);
	public static void main(String[] args) {
		processData();
	}
	public static void processData()
	{
		log.trace("From trace method");
		log.debug("From Debug method");
		log.info("From warn method");
		log.warn("From warn method");
		log.error("From error method");
		log.fatal("From fatal method");
		
	}
}
