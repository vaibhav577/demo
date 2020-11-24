package in.nit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

//this is change for github
@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration {
	
	private int maximum;
	private int minimum;
	

}
