package pigme;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author basu
 * @date 08/05/2018
 * @description Main class
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import pigme.interceptor.LogInterceptor;

@SpringBootApplication
public class App extends SpringBootServletInitializer implements WebMvcConfigurer {
	
	public App() {
		super();
	}
	
	@Autowired
	LogInterceptor logInterceptor;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}