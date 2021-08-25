package com.example.springbootwebmarketingapp.service;

import com.example.springbootwebmarketingapp.model.Item;
import com.example.springbootwebmarketingapp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements IItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAll() {
        return (List<Item>) itemRepository.findAll();
    }

    @Override
    public List<Item> getBySearchValue(String searchValue) {
        return (List<Item>) itemRepository.findBySearchValue(searchValue);
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

    @Override
    public void update(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void delete(Long id) {
        itemRepository.deleteById(id);
    }
}
