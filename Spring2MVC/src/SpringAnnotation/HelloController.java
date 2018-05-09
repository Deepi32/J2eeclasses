package SpringAnnotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
@RequestMapping("/h1")
	String Hello()
	{
		System.out.println("Hello is being called");
		return "success";
	}
}
