package com.itsun.controller;

import com.itsun.domain.Items;
import com.itsun.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
//造成冲突
    @RequestMapping("/findDetail")
    public String findAll(Model model){
        Items items = itemService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";

    }
}
