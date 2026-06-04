package com.example.whatsapp.service;

import com.example.whatsapp.entity.WhatsappData;
import com.example.whatsapp.repository.WhatsappRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WhatsappService {

    @Autowired
   private WhatsappRepository whatsappRepository;

    public WhatsappData saveData(WhatsappData whatsappData) {
        return whatsappRepository.save(whatsappData);
    }
    public List<WhatsappData> getAll(){
        return whatsappRepository.findAll();
    }
}
