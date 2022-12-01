package example.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ApplicationConfiguration {

	@Bean
	public HelloMessageProvider messageProvider() {
		System.err.println(">>>>>> Made it");
		return new HelloMessageProvider();
	}

}
