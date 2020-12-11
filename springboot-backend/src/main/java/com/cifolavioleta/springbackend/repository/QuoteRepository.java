package com.cifolavioleta.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cifolavioleta.springbackend.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long>{

}
