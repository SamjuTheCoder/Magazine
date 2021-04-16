package com.magazine.frontend.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.magazine.backend.model.User;
import com.magazine.frontend.models.Material;
import com.magazine.frontend.models.News;
import com.magazine.frontend.services.MaterialService;
import com.magazine.frontend.services.NewsService;
import java.util.List;

@Controller
public class MainController {
	
	@Autowired
	private NewsService newsService;
	
	@Autowired
	private MaterialService materialService;
	
	@RequestMapping(value={"/","/index"}, method = RequestMethod.GET)
	public ModelAndView getMainPage() {
		ModelAndView model= new ModelAndView("home");
		model.addObject("news", newsService.findAll());
		
		//List<Material> getpart = materialService.findAll();
		
		model.addObject("material", materialService.findAll());
		return model;
	}
	
	@RequestMapping(value={"/view-material"}, method = RequestMethod.GET)
	public ModelAndView getPage(Integer id) {
		ModelAndView model= new ModelAndView("single_material");	
		model.addObject("singleMaterial");
		return model;
	}

}
