package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.model.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
}
