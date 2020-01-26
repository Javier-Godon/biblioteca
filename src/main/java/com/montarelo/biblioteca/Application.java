package com.montarelo.biblioteca;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(Application.class);

        logger.debug("Starting application");
        final SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
		logger.debug("Application started");
	}

}
