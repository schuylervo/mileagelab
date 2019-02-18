package co.grandcircus.mileagelab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageLabController {

	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/madlib-form")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("madlib-form");
		return mav;
	}
	
	
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(@RequestParam("mpg") int mpg, @RequestParam("gallons") int gallons) {
		int result = (mpg * gallons);
		
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		mav.addObject("result", result);
		return mav;
	}
	
	
	@RequestMapping("/story")
	public ModelAndView showStory( 
		@RequestParam("adj") String adj,
		@RequestParam("noun") String noun
	) {	
		ModelAndView mav = new ModelAndView("madlib-story");
		mav.addObject("adj", adj);
		mav.addObject("noun", noun);
		return mav;
	}
	
	@RequestMapping("/add-form")
	public ModelAndView showAddForm() {
		return new ModelAndView("addition-form");
	}
	
	@RequestMapping("/add-result")
	public ModelAndView showAddResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int result = num1 + num2;
		
		ModelAndView mav = new ModelAndView("addition-result");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}
}
