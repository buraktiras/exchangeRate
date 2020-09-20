package com.tcmb.webservices.tcmbwebservices.controller;

import com.tcmb.webservices.tcmbwebservices.services.DolarService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/dolar")
@RequiredArgsConstructor
@Log4j2
@Component
public class DolarController {

    @Autowired
    DolarService dolarService;

    @GetMapping("/getDolar")
    public ResponseEntity<?> sDolar(){
        return new ResponseEntity<>(dolarService.getDolar(), HttpStatus.OK);
    }

}
