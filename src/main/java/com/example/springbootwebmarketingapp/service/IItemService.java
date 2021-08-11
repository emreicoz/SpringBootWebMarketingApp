package com.example.springbootwebmarketingapp.service;

import com.example.springbootwebmarketingapp.model.Item;

import java.util.List;

public interface IItemService {
    List<Item> getAll();

    Long add(Item item);

    void update(Item item);

    void delete(Long id);

    Item getSingle(Long id);
}
