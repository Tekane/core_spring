/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conflunce.spring_core_foundation.service.impl;

import com.conflunce.spring_core_foundation.data.repository.CustomerRepository;
import com.conflunce.spring_core_foundation.data.repository.SalesOrderRepository;
import com.conflunce.spring_core_foundation.domain.Customer;
import com.conflunce.spring_core_foundation.domain.Order;
import com.conflunce.spring_core_foundation.service.InventoryService;
import com.conflunce.spring_core_foundation.service.OrderService;
import java.util.Map;

/**
 *
 * @author tphasha
 */
public class OrderServiceImpl  implements OrderService{
      private final InventoryService inventoryService;
    private final CustomerRepository customerRepository;
    private final SalesOrderRepository salesOrderRepository;

    public OrderServiceImpl(InventoryService inventoryService, CustomerRepository customerRepository, SalesOrderRepository salesOrderRepository) {
        this.inventoryService = inventoryService;
        this.customerRepository = customerRepository;
        this.salesOrderRepository = salesOrderRepository;
    }
      @Override
    public Order createOrder(Customer customer, Map<String, Long> items) {
        return null;
    }

      @Override
    public Order createOrder(String customerId, Map<String, Long> items) {
        return null;
    }

      @Override
    public Order getOrder(String orderId) {
        return null;
    }
   
}
