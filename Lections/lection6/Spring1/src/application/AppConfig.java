package application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import application.beans.Pad;

@Configuration
@ComponentScan("application")
public class AppConfig {
	@Bean("pad")
	public Pad pad() {
		return new Pad();
	}

}
