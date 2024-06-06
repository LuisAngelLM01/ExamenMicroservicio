package com.lopezmorales.app.microservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lopezmorales.app.microservice.service.FolioService;

@RestController
public class FolioController {
	@Autowired
    private FolioService folioService;

	@PostMapping("/processFolio")
    public Map<String, String> processFolio(@RequestParam String folio) {
        String processedValue = folioService.processFolio(folio);
        Map<String, String> response = new HashMap<>();
        response.put("processedValue", processedValue);
        return response;
    }
}
