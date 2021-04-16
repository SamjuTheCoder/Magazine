package com.magazine.frontend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.magazine.frontend.models.Material;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Integer>  {

}
