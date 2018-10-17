/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conflunce.spring_core_foundation.config;

import com.conflunce.spring_core_foundation.data.repository.CustomerRepository;
import com.conflunce.spring_core_foundation.data.repository.InventoryItemRepository;
import com.conflunce.spring_core_foundation.data.repository.SalesOrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tphasha
 */
@Configuration
public class DataConfig {
    @Bean
    public InventoryItemRepository inventoryItemRepository(){
        return new InventoryItemRepository();
    }
    @Bean
    public CustomerRepository customerRepository(){
       return new CustomerRepository();
    } 
    @Bean
    public SalesOrderRepository salesOrderRepository(){
        return new SalesOrderRepository();
    }
}
