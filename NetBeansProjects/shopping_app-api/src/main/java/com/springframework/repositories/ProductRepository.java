package com.springframework.repositories;

import com.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer>{

    public Object findById(Integer id);

    public void deleteById(Integer id);
}
