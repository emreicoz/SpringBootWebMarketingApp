package com.example.springbootwebmarketingapp.repository;

import com.example.springbootwebmarketingapp.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
