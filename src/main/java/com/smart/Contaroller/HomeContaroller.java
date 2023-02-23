package com.smart.Contaroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.entities.Contact;
import com.smart.entities.User;
import com.smart.helper.Message;
import com.smart.repository.UserRepository;

@Controller
public class HomeContaroller {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private UserRepository userRepository;
	/* home handler */


	@GetMapping("/")
	public String home(Model model) {

		model.addAttribute("title", "Home - TechLife Soluton");
		return "home";

	}

	/* about handler */
	@GetMapping("/about")
	public String about(Model model) {

		model.addAttribute("title", "Home - TechLife Soluton");
		return "about";

	}

	/* signup handler */
	@GetMapping("/singup")
	public String singup(Model model) {

		model.addAttribute("title", "Register - TechLife Soluton");
		model.addAttribute("user", new User());
		return "singup";

	}

	@RequestMapping(value = "/do_register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,

			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model,
			HttpSession session) {
		try {

			if (!agreement) {
				System.out.println("You are noth accept the terns and condition");
				throw new Exception("Please accept the terns and condition ");
			}

			user.setRole("ROLL_USER");
			user.setEnabled(true);
			user.setImageUrl("default.png");
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			User result = this.userRepository.save(user);
			model.addAttribute("user", new User());
			session.setAttribute("message", new Message("succesfully Registered !! ", "alert-success"));
			return "singup";

		} catch (Exception e) {
			// e.setStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new Message("Something went wrong. " + e.getMessage(), "alert-danger"));
			return "singup";
		}

	}
	
	
	//handler for custom login
		@GetMapping("/signin")
		public String CustomLogin(Model model) {
			model.addAttribute("title", "Login page");
			return "login";
		}
}