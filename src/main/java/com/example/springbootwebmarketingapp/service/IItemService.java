package com.example.springbootwebmarketingapp.service;

import com.example.springbootwebmarketingapp.model.Item;

import java.util.List;

public interface IItemService {
    List<Item> getAll();

    Item getSingle(Long id);

    Long add(Item category);
}
