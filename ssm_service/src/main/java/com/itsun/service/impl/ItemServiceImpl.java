package com.itsun.service.impl;

import com.itsun.domain.Items;
import com.itsun.mapper.ItemMapper;
import com.itsun.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public Items findById(int id) {
        return itemMapper.findById(id);
    }
}
