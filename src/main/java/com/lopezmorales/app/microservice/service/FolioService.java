package com.lopezmorales.app.microservice.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class FolioService {
	
	public String processFolio(String folio) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
        String dateTimeString = now.format(formatter);
        return String.valueOf((folio + dateTimeString).hashCode());
    }
}
