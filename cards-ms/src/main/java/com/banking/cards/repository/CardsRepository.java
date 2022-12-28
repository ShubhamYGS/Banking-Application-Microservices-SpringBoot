package com.banking.cards.repository;

import com.banking.cards.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Integer> {
    List<Cards> findByCustomerId(int customerId);
}
