package com.cifolavioleta.springbackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cifolavioleta.springbackend.model.Quote;
import com.cifolavioleta.springbackend.repository.QuoteRepository;

@Service
public class QuoteService implements QuoteRepository{
	@Autowired
	private QuoteRepository quoteRepository;

	@Override
	public List<Quote> findAll() {
		return quoteRepository.findAll();
	}

	@Override
	public List<Quote> findAll(Sort sort) {
		return quoteRepository.findAll(sort);
	}

	@Override
	public List<Quote> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Quote> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Quote> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Quote> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Quote getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Quote> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Quote> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Quote> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Quote> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Quote> findById(Long id) {
		return quoteRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		quoteRepository.deleteById(id);
		
	}

	@Override
	public void delete(Quote entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Quote> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Quote> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Quote> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Quote> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Quote> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Quote> findAllByBook(Long book_id) {
		List<Quote> quotesResponse = new ArrayList<>();
		List<Quote> quotes = quoteRepository.findAll();
		
		for (Quote quote : quotes) {
			if (quote.getBook().getId() == book_id) {
				quotesResponse.add(quote);
			}
		}
		
		return quotesResponse;
	}

}
