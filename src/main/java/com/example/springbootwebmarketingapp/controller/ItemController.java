package com.example.springbootwebmarketingapp.controller;

import com.example.springbootwebmarketingapp.model.Item;
import com.example.springbootwebmarketingapp.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemController {
    @Autowired
    private IItemService itemService;

    @GetMapping(value = {"/home"})
    public String getHomePage() {
        return "home";
    }

    @GetMapping(value = {"/allItems"})
    public String allItems(Model model) {
        List<Item> result = (List<Item>) itemService.getAll();
        System.out.print(result);
        model.addAttribute("itemList", result);
        return "allItems";
    }

    @GetMapping("itemDetail/{id}")
    public String itemDetail(Model model, @ModelAttribute("") Item i) {
        Item item = itemService.getSingle(i.getId());
        model.addAttribute("item", item);
        return "itemDetail";
    }

    @GetMapping("newItem")
    public String newItem(Model model) {
        model.addAttribute("item", new Item());
        return "newItem";
    }

    @PostMapping("/addItem")
    public String addItem(Model model, @ModelAttribute("item") Item c) {
        itemService.add(c);
        return "redirect:/allItems/";
    }

    @RequestMapping("/updateItem/{id}")
    public String updateItem(Model model, @ModelAttribute("item") Item i) {
        itemService.update(i);
        return "redirect:/allItems/";
    }

    @PostMapping("/deleteItem")
    public String deleteItem(Model model, @ModelAttribute("itemId") Long itemId) {
        itemService.delete(itemId);
        return "redirect:/allItems";
    }

}