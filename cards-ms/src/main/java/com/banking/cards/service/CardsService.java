package com.banking.cards.service;

import com.banking.cards.model.Cards;
import com.banking.cards.model.Customer;
import com.banking.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardsService {

    @Autowired
    private CardsRepository cardsRepository;

    public List<Cards> giveCardDetails(Customer customer) {
        List<Cards> cardsList = cardsRepository.findByCustomerId(customer.getCustomerId());

        if(cardsList != null)
            return cardsList;

        return null;
    }
}
