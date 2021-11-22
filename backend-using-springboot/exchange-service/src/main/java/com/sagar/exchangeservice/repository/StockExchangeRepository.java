package com.sagar.exchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagar.exchangeservice.entity.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer> {

}
