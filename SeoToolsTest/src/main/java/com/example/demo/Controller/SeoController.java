package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Welcome;



@Controller
public class SeoController {

	@RequestMapping(value = "/home", method= RequestMethod.GET)
	public String show() {
		ModelAndView mv = new ModelAndView("");
		mv.setViewName("seotable.jsp");
		return "seotable";
	}
	
	/*
	 * @RequestMapping(value = "/home", method= RequestMethod.POST) public String
	 * welcomePage(@RequestParam String urlId,@RequestParam String device1){
	 * 
	 * String base = "https://www.daraz.com"; String urlName = urlId; String device
	 * = device1; String url =
	 * "https://www.googleapis.com/pagespeedonline/v5/runPagespeed?url="+base+
	 * "&key=AIzaSyDLcprRHQvgfw06sEo9NHiM1H_TtrbHWPA&strategy=mobile"; String url2 =
	 * "https://www.googleapis.com/pagespeedonline/v5/runPagespeed?url="+urlName+
	 * "&key=AIzaSyDLcprRHQvgfw06sEo9NHiM1H_TtrbHWPA&strategy="+device; RestTemplate
	 * restTemplate = new RestTemplate();
	 * 
	 * Object result = restTemplate.getForObject(url2, Welcome.class); Welcome
	 * welcomeResult = new Welcome(); System.out.println(urlName);
	 * System.out.println(device); //String result2 =
	 * welcomeResult.getLoadingExperience().getOverallCategory();
	 * //System.out.println(welcomeResult.getLoadingExperience().getOverallCategory(
	 * )); return "welcome";
	 * 
	 * }
	 */
}
