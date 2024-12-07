package com.klef.jfsd.SpringBootExam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.SpringBootExam.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>
{

}
