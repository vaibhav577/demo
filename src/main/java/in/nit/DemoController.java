package in.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	Configuration configuration;
	@GetMapping("/limits")
	public limitConfiguration retriveLimitsFromConfig() {
		
		return new limitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	
}
