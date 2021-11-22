package SpringApi;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String helloworld() {
		return "Hello World";
	}
}
