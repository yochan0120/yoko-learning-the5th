package jp.co.yokolearningthe5th;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LearningContorller {

	@RequestMapping("/")
	public String learning(Model model) {

		model.addAttribute("message", "Let's keep learning!");
		return "learning";

	}

}