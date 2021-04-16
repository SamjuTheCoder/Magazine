package com.magazine.frontend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.magazine.frontend.models.News;

@Repository
public interface NewsRepository extends CrudRepository<News, Integer> {

}
