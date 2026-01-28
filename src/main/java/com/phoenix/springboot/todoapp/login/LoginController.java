package com.phoenix.springboot.todoapp.login;

import java.net.InetAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") // user in all the controllers in which you need the value
public class LoginController {

	public static void getUserDetails() throws Exception {
		try {
			InetAddress address = InetAddress.getLocalHost();
			String ip = address.getHostAddress();
			String userName = System.getProperty("user.name");
			String dir = System.getProperty("user.home");
			
			System.out.println("\n\nUser Information\n");
			System.out.printf("IPAddress: %s\n", ip);
			System.out.printf("Directory: %s\n", dir);
			System.out.printf("User Name: %s\n", userName);
		} // end try
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Logger logger = LoggerFactory.getLogger(getClass());
	final String user = System.getProperty("user.name");




	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoLoginPage(ModelMap model) {
		model.put("name", "phoenix");
		model.put("password", "password");
		return "welcome";
	}


}
	


