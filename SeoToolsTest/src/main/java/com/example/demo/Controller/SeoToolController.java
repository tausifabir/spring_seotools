package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Welcome;
import com.example.demo.ModelSeo.Seo;
import com.example.demo.services.SeoService;




@RestController
public class SeoToolController {



	@Autowired
	private SeoService seoService;
	
	@RequestMapping(value = "/home", method= RequestMethod.POST)
	public Object welcomePage(@RequestParam String  urlId1,@RequestParam String  device1,
							@RequestParam String  urlId2,@RequestParam String  device2,
							@RequestParam String  urlId3,@RequestParam String  device3,
							@RequestParam String  urlId4,@RequestParam String  device4,
							@RequestParam String  urlId5,@RequestParam String  device5){
		
		String base = "https://www.daraz.com";
		
		String urlName1 = urlId1;
		String urlName2 = urlId2;
		String urlName3 = urlId3;
		String urlName4 = urlId4;
		String urlName5 = urlId5;
		
		String devicetest1 = device1;
		String devicetest2 = device2;
		String devicetest3 = device3;
		String devicetest4 = device4;
		String devicetest5 = device5;
		
		
		String url = "https://www.googleapis.com/pagespeedonline/v5/runPagespeed?url="+base+"&key=AIzaSyDLcprRHQvgfw06sEo9NHiM1H_TtrbHWPA&strategy=mobile";
		String url2 = "https://www.googleapis.com/pagespeedonline/v5/runPagespeed?url="+urlName1+"&key=AIzaSyDLcprRHQvgfw06sEo9NHiM1H_TtrbHWPA&strategy="+devicetest1;
		RestTemplate restTemplate = new RestTemplate();
		
		Object result = restTemplate.getForObject(url2, Welcome.class);
		
		Welcome welcomeResult = new Welcome();
		//welcomeResult = restTemplate.getForObject(url2, Welcome.class );
		
		System.out.println(urlName1);
		System.out.println(devicetest1);
		
		List<String> urlList = new ArrayList();
		List<String> deviceList = new ArrayList();
		
		urlList.add(urlName1);
		urlList.add(urlName2);
		urlList.add(urlName3);
		urlList.add(urlName4);
		urlList.add(urlName5);
		
		deviceList.add(devicetest1);
		deviceList.add(devicetest2);
		deviceList.add(devicetest3);
		deviceList.add(devicetest4);
		deviceList.add(devicetest5);
		
		for(int i=0;i<urlList.size();i++) {
			
			String url6 = "https://www.googleapis.com/pagespeedonline/v5/runPagespeed?url="+urlList.get(i)+"&key=AIzaSyDLcprRHQvgfw06sEo9NHiM1H_TtrbHWPA&strategy="+deviceList.get(i);
			System.out.println("Testing Url: "+urlList.get(i));
			System.out.println("Testing Url's"+urlList.get(i)+": "+deviceList.get(i));
			
			welcomeResult = restTemplate.getForObject(url6, Welcome.class);
			
			Long cumulativeLayoutShiftScore = welcomeResult.getLoadingExperience().getMetrics().getCumulativeLayoutShiftScore().getPercentile();
			Long firstContentfulPaintMS =  welcomeResult.getLoadingExperience().getMetrics().getFirstContentfulPaintMS().getPercentile();
			Long firstInputDelayMS =  welcomeResult.getLoadingExperience().getMetrics().getFirstInputDelayMS().getPercentile();
			Long largestContentfulPaintMS =  welcomeResult.getLoadingExperience().getMetrics().getLargestContentfulPaintMS().getPercentile();

			String overallCategory = welcomeResult.getLoadingExperience().getOverallCategory(); 
			String initialURL = welcomeResult.getLoadingExperience().getInitialURL(); 
			String time = welcomeResult.getAnalysisUTCTimestamp().toString();
			
			
			Seo seo1 = new Seo(cumulativeLayoutShiftScore,firstContentfulPaintMS,firstInputDelayMS,largestContentfulPaintMS
					  ,overallCategory,initialURL,time,deviceList.get(i));
			
			seoService.addData(seo1);
			
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//String result2 = welcomeResult.getLoadingExperience().getOverallCategory();
		//System.out.println(result2.toString());
	
		
		//String siteId =  welcomeResult.getID(); 
		 // Long percentile= welcome.getLoadingExperience().getMetrics().getCumulativeLayoutShiftScore().getPercentile(); 
			/*
			 * Long cumulativeLayoutShiftScore =
			 * welcomeResult.getLoadingExperience().getMetrics().
			 * getCumulativeLayoutShiftScore().getPercentile(); Long firstContentfulPaintMS
			 * =
			 * welcomeResult.getLoadingExperience().getMetrics().getFirstContentfulPaintMS()
			 * .getPercentile(); Long firstInputDelayMS =
			 * welcomeResult.getLoadingExperience().getMetrics().getFirstInputDelayMS().
			 * getPercentile(); Long largestContentfulPaintMS =
			 * welcomeResult.getLoadingExperience().getMetrics().getLargestContentfulPaintMS
			 * ().getPercentile();
			 * 
			 * String overallCategory =
			 * welcomeResult.getLoadingExperience().getOverallCategory(); String initialURL
			 * = welcomeResult.getLoadingExperience().getInitialURL(); String time =
			 * welcomeResult.getAnalysisUTCTimestamp().toString();
			 * 
			 * 
			 * Seo seo1 = new
			 * Seo(cumulativeLayoutShiftScore,firstContentfulPaintMS,firstInputDelayMS,
			 * largestContentfulPaintMS ,overallCategory,initialURL,time,devicetest1);
			 */
		
		//seoService.addData(seo1);
		
		return result;
		
	}
}
