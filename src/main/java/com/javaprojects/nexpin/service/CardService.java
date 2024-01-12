package com.javaprojects.nexpin.service;

import com.javaprojects.nexpin.model.entity.Card;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

public interface CardService {

    Card issueNewCard(Card card);

    Card blockCard(Long cardId);

    Card unblockCard(Long cardId);

    void deleteCard(Long cardId);

    List<Card> getAllCardsForClient(Long clientId);
}
