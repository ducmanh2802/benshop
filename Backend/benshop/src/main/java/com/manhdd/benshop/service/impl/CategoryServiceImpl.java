package com.manhdd.benshop.service.impl;

import java.util.List;
import java.util.Optional;

import com.manhdd.benshop.entity.Category;
import com.manhdd.benshop.repository.CategoryRepository;
import com.manhdd.benshop.service.CategoryService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class CategoryServiceImpl implements CategoryService {
  public CategoryRepository categoryRepository;

  public CategoryServiceImpl(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }
@Override
  public long count() {
    return categoryRepository.count();
  }
  @Override
  public void delete(Category arg0) {
    categoryRepository.delete(arg0);
  }
  @Override
  public void deleteAll() {
    categoryRepository.deleteAll();
  }
  @Override
  public void deleteAll(Iterable<? extends Category> arg0) {
    categoryRepository.deleteAll(arg0);
  }
  @Override
  public void deleteAllById(Iterable<? extends Long> arg0) {
    categoryRepository.deleteAllById(arg0);
  }
  @Override
  public void deleteAllByIdInBatch(Iterable<Long> arg0) {
    categoryRepository.deleteAllByIdInBatch(arg0);
  }
  @Override
  public void deleteAllInBatch() {
    categoryRepository.deleteAllInBatch();
  }
  @Override
  public void deleteAllInBatch(Iterable<Category> arg0) {
    categoryRepository.deleteAllInBatch(arg0);
  }
  @Override
  public void deleteById(Long arg0) {
    categoryRepository.deleteById(arg0);
  }
  @Override
  public boolean existsById(Long arg0) {
    return categoryRepository.existsById(arg0);
  }
  @Override
  public List<Category> findAll() {
    return categoryRepository.findAll();
  }
  @Override
  public List<Category> findAll(Sort arg0) {
    return categoryRepository.findAll(arg0);
  }
  @Override
  public Page<Category> findAll(Pageable arg0) {
    return categoryRepository.findAll(arg0);
  }
  @Override
  public List<Category> findAllById(Iterable<Long> arg0) {
    return categoryRepository.findAllById(arg0);
  }
  @Override
  public Optional<Category> findById(Long arg0) {
    return categoryRepository.findById(arg0);
  }
  @Override
  public void flush() {
    categoryRepository.flush();
  }
  @Override
  public Category getById(Long arg0) {
    return categoryRepository.getById(arg0);
  }
  @Override
  public <S extends Category> S save(S entity) {
    return categoryRepository.save(entity);
  }
  @Override
  public <S extends Category> List<S> saveAll(Iterable<S> arg0) {
    return categoryRepository.saveAll(arg0);
  }
  @Override
  public <S extends Category> List<S> saveAllAndFlush(Iterable<S> arg0) {
    return categoryRepository.saveAllAndFlush(arg0);
  }

}
