package com.acuityspace.neutral.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.jersey.JerseyServerMetricsAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(exclude = JerseyServerMetricsAutoConfiguration.class)
public class NeutralNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeutralNewsApplication.class, args);
	}
}
