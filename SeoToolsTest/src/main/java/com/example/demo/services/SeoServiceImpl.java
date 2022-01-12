package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.SeoDao;
import com.example.demo.ModelSeo.Seo;

@Service
public class SeoServiceImpl implements SeoService {
	

	@Autowired
	private SeoDao seoDao;
	
		
	@Override
	public void addData(Seo seo) {
		// TODO Auto-generated method stub
		seoDao.save(seo);
	}

	


	
	

}
