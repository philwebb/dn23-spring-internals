package example.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ApplicationConfiguration {

	@Bean
	public HelloMessageProvider messageProvider() {
		return new HelloMessageProvider();
	}

}
