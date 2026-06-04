package com.example.whatsapp.controller;

import com.example.whatsapp.entity.WhatsappData;
import com.example.whatsapp.service.WhatsappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/datacollect")
public class WhatsappController {

    @Autowired
    private WhatsappService whatsappService;

    @GetMapping
    public List<WhatsappData> getAll(){
        return
        whatsappService.getAll();
    }

    @PostMapping
    public WhatsappData createWhatsapp(@RequestBody WhatsappData myData){
        myData.setDate(LocalDateTime.now());
        whatsappService.saveData(myData);
       return  myData;
    }
}
