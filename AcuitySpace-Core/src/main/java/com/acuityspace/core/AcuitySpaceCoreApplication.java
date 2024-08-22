package com.acuityspace.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.jersey.JerseyServerMetricsAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(exclude = JerseyServerMetricsAutoConfiguration.class)
public class AcuitySpaceCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcuitySpaceCoreApplication.class, args);
	}

}
