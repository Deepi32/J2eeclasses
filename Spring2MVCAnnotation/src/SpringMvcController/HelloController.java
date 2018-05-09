package SpringMvcController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController
{

	@RequestMapping("/h1")
	String Hello1()
	{
		System.out.println("Hello is called");
		return "success";
	}
	@RequestMapping("/h2")
	ModelAndView Hello2()
	{
		System.out.println("Hello2 is called");
		return new ModelAndView("success","msg","HELLO MY WORLD");
	}

}
