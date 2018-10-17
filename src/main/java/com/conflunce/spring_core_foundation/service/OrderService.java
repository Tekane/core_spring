/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conflunce.spring_core_foundation.service;

import com.conflunce.spring_core_foundation.domain.Customer;
import com.conflunce.spring_core_foundation.domain.Order;
import java.util.Map;

/**
 *
 * @author tphasha
 */
public interface OrderService {
    Order createOrder(Customer customer, Map<String, Long> items);
    Order createOrder(String customerId, Map<String, Long> items);
    Order getOrder(String orderId);
}
