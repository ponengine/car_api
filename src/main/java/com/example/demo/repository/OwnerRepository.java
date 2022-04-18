package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

}
