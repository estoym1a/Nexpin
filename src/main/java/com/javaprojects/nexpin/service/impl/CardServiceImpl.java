package com.javaprojects.nexpin.service.impl;

import com.javaprojects.nexpin.exception.CardNotFoundException;
import com.javaprojects.nexpin.model.entity.Card;
import com.javaprojects.nexpin.model.enums.CardStatus;
import com.javaprojects.nexpin.repository.CardRepository;
import com.javaprojects.nexpin.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
    @Secured("ROLE_ADMIN")
    @Override
    public Card issueNewCard(Card card) {
        return cardRepository.save(card);
    }
    @Secured("ROLE_ADMIN")
    @Override
    public Card blockCard(Long cardId) {

        return cardRepository.findById(cardId)
                .map(card -> {
                    card.setStatus(CardStatus.BLOCKED);
                    return cardRepository.save(card);
                })
                .orElseThrow(() -> new CardNotFoundException("Card not found with id: " + cardId));
    }
    @Secured("ROLE_ADMIN")
    @Override
    public Card unblockCard(Long cardId) { // ACTIVATING

        return cardRepository.findById(cardId)
                .map(card -> {
                    card.setStatus(CardStatus.ACTIVE);
                    return cardRepository.save(card);
                })
                .orElseThrow(() -> new CardNotFoundException("Card not found with id: " +cardId));
}
    @Secured("ROLE_ADMIN")
    @Override
    public void deleteCard(Long cardId) {
        cardRepository.deleteById(cardId);

    }

    @Override
    @Secured("ROLE_ADMIN")
    public List<Card> getAllCardsForClient(Long clientId) {
        return (List<Card>) cardRepository.findByClientId(clientId);
    }
}
