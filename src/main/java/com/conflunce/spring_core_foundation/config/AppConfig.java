/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conflunce.spring_core_foundation.config;

import com.conflunce.spring_core_foundation.data.repository.CustomerRepository;
import com.conflunce.spring_core_foundation.data.repository.InventoryItemRepository;
import com.conflunce.spring_core_foundation.data.repository.SalesOrderRepository;
import com.conflunce.spring_core_foundation.service.InventoryService;
import com.conflunce.spring_core_foundation.service.OrderService;
import com.conflunce.spring_core_foundation.service.impl.InventoryServiceImpl;
import com.conflunce.spring_core_foundation.service.impl.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tphasha
 */
@Configuration
public class AppConfig {
    
    @Bean
    public InventoryService inventoryService(InventoryItemRepository inventoryItemRepository){
        return new InventoryServiceImpl(inventoryItemRepository);
    }
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
    @Bean
    public  OrderService orderService(InventoryService inventoryService,CustomerRepository customerRepository,SalesOrderRepository salesOrderRepository){
        return new OrderServiceImpl(inventoryService, customerRepository, salesOrderRepository);
    }
    
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService =  context.getBean(OrderService.class);
        System.out.println(orderService == null ? "NULL" : "A Ok" );
    }
    
}
