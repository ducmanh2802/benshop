package com.manhdd.benshop.service;

import java.util.List;
import java.util.Optional;

import com.manhdd.benshop.entity.Category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface CategoryService {

  public long count() ;

  public void delete(Category arg0) ;

  public void deleteAll() ;

  public void deleteAll(Iterable<? extends Category> arg0) ;

  public void deleteAllById(Iterable<? extends Long> arg0);

  public void deleteAllByIdInBatch(Iterable<Long> arg0) ;

  public void deleteAllInBatch() ;

  public void deleteAllInBatch(Iterable<Category> arg0) ;

  public void deleteById(Long arg0) ;

  public boolean existsById(Long arg0);

  public List<Category> findAll() ;
  public List<Category> findAll(Sort arg0) ;

  public Page<Category> findAll(Pageable arg0);

  public List<Category> findAllById(Iterable<Long> arg0) ;
  public Optional<Category> findById(Long arg0) ;

  public void flush() ;

  public Category getById(Long arg0) ;

  public <S extends Category> S save(S entity) ;

  public <S extends Category> List<S> saveAll(Iterable<S> arg0);

  public <S extends Category> List<S> saveAllAndFlush(Iterable<S> arg0) ;

}
