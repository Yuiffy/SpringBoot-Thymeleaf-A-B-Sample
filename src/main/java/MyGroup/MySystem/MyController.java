package MyGroup.MySystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	String onePage(){
		return "indexpage";
	}
	@RequestMapping("/testAction")
	String testAction(@RequestParam("numA") int x, @RequestParam("numB") int y, Model model){
		model.addAttribute("numC",x+y);
		return "onepage";
	}
}
