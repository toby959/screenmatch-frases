package com.toby959.screenmatch_frases.controller;


import com.toby959.screenmatch_frases.dto.PhraseDTO;
import com.toby959.screenmatch_frases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {

    @Autowired
    private PhraseService service;

@GetMapping("/series/phrases")
    public PhraseDTO getPhraseRandom() {
        return service.getPhraseRandom();
}
}
