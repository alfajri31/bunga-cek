package com.example.demo.controller;

import com.example.demo.dto.BungaDto;
import com.example.demo.dto.BungaResp;
import com.example.demo.service.BungaInterface;
import com.example.demo.service.BungaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // For enabling the base URL for this controller class
public class BungaController {

    @Autowired
    private BungaInterface bungaInterface;
    @PostMapping("/bunga")
    private ResponseEntity<BungaResp> checkBunga(@RequestBody BungaDto bungaDto) {
        BungaResp data = bungaInterface.bungaService(bungaDto);
        return ResponseEntity.ok(data);
    }
}
