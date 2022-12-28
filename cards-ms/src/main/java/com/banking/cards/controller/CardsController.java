package com.banking.cards.controller;

import com.banking.cards.model.Cards;
import com.banking.cards.model.Customer;
import com.banking.cards.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsService cardsService;

    @GetMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        return cardsService.giveCardDetails(customer);
    }
}
