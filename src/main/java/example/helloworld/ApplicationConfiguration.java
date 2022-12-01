package example.helloworld;

import org.springframework.context.annotation.Bean;

class ApplicationConfiguration {

	@Bean
	public HelloMessageProvider messageProvider() {
		return new HelloMessageProvider();
	}

}
