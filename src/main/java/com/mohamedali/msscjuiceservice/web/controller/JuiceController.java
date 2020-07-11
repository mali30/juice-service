package com.mohamedali.msscjuiceservice.web.controller;

import com.mohamedali.msscjuiceservice.web.model.JuiceDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.UUID;

@RequestMapping("/api/v1/juice")
@RestController
public class JuiceController {

    @GetMapping
    public ResponseEntity<JuiceDTO> getJuiceById(@PathParam("juiceId")UUID juiceID) {

        return new ResponseEntity<>(JuiceDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewJuice(@Validated @RequestBody JuiceDTO juiceDTO){
        // TODO impl
        return new ResponseEntity(juiceDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{juiceId}")
    public ResponseEntity updateJuiceById(@PathParam("juiceId") UUID juiceId, @Validated @RequestBody JuiceDTO juiceDTO){
        // TODO impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
