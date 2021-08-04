package com.example.springbootwebmarketingapp.service;

import com.example.springbootwebmarketingapp.model.Item;
import com.example.springbootwebmarketingapp.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements IItemService {


    private ItemRepository itemRepository;

    @Override
    public List<Item> getAll() {
        return (List<Item>) itemRepository.findAll();
    }

    @Override
    public Item getSingle(Long id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public Long add(Item item) {
        Long id = itemRepository.save(item).getId();
        return id;
    }
}
