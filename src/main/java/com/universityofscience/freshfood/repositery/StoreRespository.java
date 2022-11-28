package com.universityofscience.freshfood.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityofscience.freshfood.entity.Store;

public interface StoreRespository extends JpaRepository<Store, Long>{
Store findOneById(Long id);
}
