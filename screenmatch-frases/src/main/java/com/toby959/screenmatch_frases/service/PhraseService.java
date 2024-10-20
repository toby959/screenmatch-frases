package com.toby959.screenmatch_frases.service;

import com.toby959.screenmatch_frases.dto.PhraseDTO;
import com.toby959.screenmatch_frases.model.Phrase;
import com.toby959.screenmatch_frases.repository.IPhaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {

    @Autowired
    private IPhaseRepository repository;

    public PhraseDTO getPhraseRandom() {
        Phrase phrase = repository.getPhraseRandom();
        return new PhraseDTO(phrase.getTitle(), phrase.getPhrase(),
                phrase.getActor(), phrase.getPoster());
    }
}

