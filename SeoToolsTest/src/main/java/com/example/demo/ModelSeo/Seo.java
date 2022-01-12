package com.example.demo.ModelSeo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Seo {
		
		@Id
		@GeneratedValue
		private int id;
		private Long CL_shiftScore;
		private Long FirstContentful;
		private Long FirstInputDelay;
		private Long LargestContentful;
	    //private SeoMetrics seoMetrics;
	    private String overallCategory;
	    private String initialURL;
	    private String time;
	    private String device;
	    
	    
	    
	    
		


		public Seo() {
			super();
		}




		




		public Seo(Long cL_shiftScore, Long firstContentful, Long firstInputDelay, Long largestContentful,
				String overallCategory, String initialURL, String time, String device) {
			super();
		
			CL_shiftScore = cL_shiftScore;
			FirstContentful = firstContentful;
			FirstInputDelay = firstInputDelay;
			LargestContentful = largestContentful;
			this.overallCategory = overallCategory;
			this.initialURL = initialURL;
			this.time = time;
			this.device = device;
		}









		public int getId() {
			return id;
		}




		public void setId(int id) {
			this.id = id;
		}




		public Long getCL_shiftScore() {
			return CL_shiftScore;
		}




		public void setCL_shiftScore(Long cL_shiftScore) {
			CL_shiftScore = cL_shiftScore;
		}




		public Long getFirstContentful() {
			return FirstContentful;
		}




		public void setFirstContentful(Long firstContentful) {
			FirstContentful = firstContentful;
		}




		public Long getFirstInputDelay() {
			return FirstInputDelay;
		}




		public void setFirstInputDelay(Long firstInputDelay) {
			FirstInputDelay = firstInputDelay;
		}




		public Long getLargestContentful() {
			return LargestContentful;
		}




		public void setLargestContentful(Long largestContentful) {
			LargestContentful = largestContentful;
		}




	




		public String getOverallCategory() {
			return overallCategory;
		}




		public void setOverallCategory(String overallCategory) {
			this.overallCategory = overallCategory;
		}




		public String getInitialURL() {
			return initialURL;
		}




		public void setInitialURL(String initialURL) {
			this.initialURL = initialURL;
		}




		public String getTime() {
			return time;
		}




		public void setTime(String time) {
			this.time = time;
		}



		public String getDevice() {
			return device;
		}




		public void setDevice(String device) {
			this.device = device;
		}




		@Override
		public String toString() {
			return "Seo [id=" + id + ", CL_shiftScore=" + CL_shiftScore + ", FirstContentful=" + FirstContentful
					+ ", FirstInputDelay=" + FirstInputDelay + ", LargestContentful=" + LargestContentful
					+ ", overallCategory=" + overallCategory + ", initialURL=" + initialURL + ", time=" + time
					+ ", device=" + device + "]";
		}


		

	
		



	


		

  

}
