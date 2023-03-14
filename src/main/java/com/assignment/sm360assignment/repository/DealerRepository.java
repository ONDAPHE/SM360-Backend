package com.assignment.sm360assignment.repository;

import com.assignment.sm360assignment.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {}
