package com.magazine.frontend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magazine.frontend.models.News;
import com.magazine.frontend.repository.NewsRepository;
import java.util.List;

@Service
public class NewsService {
	
	@Autowired
	private NewsRepository newsRepository;
	
	public List<News> findAll() {
		
		return (List<News>) newsRepository.findAll();
	}

}
