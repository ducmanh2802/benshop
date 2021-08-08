package com.manhdd.benshop.repository;

import com.manhdd.benshop.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

  default <S extends Category> S saveAndFlush(S arg0) {
    return saveAndFlush(arg0);
  }

}
