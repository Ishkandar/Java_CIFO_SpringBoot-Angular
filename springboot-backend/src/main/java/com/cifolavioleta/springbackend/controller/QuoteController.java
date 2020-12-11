package com.cifolavioleta.springbackend.controller;

import com.cifolavioleta.springbackend.service.QuoteService;
import com.cifolavioleta.springbackend.model.Quote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value = "/quotes/")
public class QuoteController {
	@Autowired
	private QuoteService quoteService;

	@GetMapping("{id}")
	public ResponseEntity<List<Quote>> getQuotesByBookID(@PathVariable("id") Long book_id) {
		return ResponseEntity.ok(quoteService.findAllByBook(book_id));
	}
}
