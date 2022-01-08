package nc.ec.edu.uce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoPruebasApplication {

	private static final Logger LOG = LogManager.getRootLogger();
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPruebasApplication.class, args);
	
		LOG.trace("Trace");
		LOG.debug("Logger DEBUG");
		LOG.info("Logger INFO");
		LOG.warn("Logger WARN");
		LOG.error("Logger ERROR");
		LOG.fatal("Logger FATAL");
	}

}
