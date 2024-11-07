package com.charan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charan.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
