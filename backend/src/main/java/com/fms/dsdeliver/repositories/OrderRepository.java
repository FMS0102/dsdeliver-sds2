package com.fms.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
