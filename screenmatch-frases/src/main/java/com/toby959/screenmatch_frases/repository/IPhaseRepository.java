package com.toby959.screenmatch_frases.repository;

import com.toby959.screenmatch_frases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPhaseRepository extends JpaRepository <Phrase, Long>{

    @Query("SELECT f FROM Phrase f ORDER BY function('RANDOM') LIMIT 1")
    public Phrase getPhraseRandom();
}
