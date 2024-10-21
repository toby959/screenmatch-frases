package com.toby959.screenmatch_frases.controller;


import com.toby959.screenmatch_frases.dto.PhraseDTO;
import com.toby959.screenmatch_frases.service.PhraseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {

    @Autowired
    private PhraseService service;

@GetMapping("/series/phrases")
@Operation(
        summary = "Carga Datos",
        description = "Muestra las frases de las series"
        )


    public PhraseDTO getPhraseRandom() {
        return service.getPhraseRandom();
}
}
