/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conflunce.spring_core_foundation.service.impl;

import com.conflunce.spring_core_foundation.data.repository.InventoryItemRepository;
import com.conflunce.spring_core_foundation.domain.Product;
import com.conflunce.spring_core_foundation.service.InventoryService;
import java.util.Map;

/**
 *
 * @author tphasha
 */
public class InventoryServiceImpl implements InventoryService{
    
    private final InventoryItemRepository inventoryItemRepository;
     
    public InventoryServiceImpl(InventoryItemRepository inventoryItemRepository){
        this.inventoryItemRepository = inventoryItemRepository;
    }

    @Override
    public Map<Product, Long> getTotalInventoryOnHand() {
        return null;
    }

    @Override
    public long getQuantityOnHand(String itemId) {
        return 0;
    }

    @Override
    public void adjustInventory(String itemId, long quantity) {

    }
}
