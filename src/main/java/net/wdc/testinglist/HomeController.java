package net.wdc.testinglist;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	@RequestMapping(value = "/questionList", method = RequestMethod.GET)
	public String questionList(Locale locale, Model model){
		return "questionList";
	}
	
	@RequestMapping(value ="/createQuestion.html", method = RequestMethod.GET)
	public String addNewQuestion(@ModelAttribute("questionForm")QuestionForm questionform, 
			Map<String, Object> model){
		
		return "createQuestion";
	}
	
	@RequestMapping(value ="/TestQuestionForm.html", method = RequestMethod.POST)
	public String showNewQuestion(@ModelAttribute("questionForm")QuestionForm questionform, 
			Map<String, Object> model){
		
		Question question = questionform.getQuestion();
		model.put("question", question);
		return "TestQuestionForm";
	}
	
}
