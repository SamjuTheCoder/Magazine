package com.magazine.frontend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magazine.frontend.models.Material;
import com.magazine.frontend.repository.MaterialRepository;
import java.util.List;

@Service
public class MaterialService {
	
	@Autowired
	private MaterialRepository materialRepository;
	
	public List<Material> findAll() {
		
		return (List<Material>) materialRepository.findAll();
		
	}

	public void findById(Integer id) {
		materialRepository.findById(id);
	}
}
