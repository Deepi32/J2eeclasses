package Login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login.jft")
public class LoginController {
	@RequestMapping(method=RequestMethod.GET)
	public String ShowForm(ModelMap map) {
	LoginCommand cmd=new LoginCommand();
	map.addAttribute("Lc",cmd);
	return "loginForm";
	
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView display(LoginCommand login)
	{
		System.out.println("USERNAME IS :"+login.username);
		return new ModelAndView("loginsuccess","cd",login);
		
	}
}
