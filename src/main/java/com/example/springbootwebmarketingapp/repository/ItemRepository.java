package com.example.springbootwebmarketingapp.repository;

import com.example.springbootwebmarketingapp.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    @Query(value = "select * from items i where i.name ilike %:searchValue%  order by i.id asc", nativeQuery = true)
    List<Item> findBySearchValue(@Param("searchValue") String searchValue);

}
