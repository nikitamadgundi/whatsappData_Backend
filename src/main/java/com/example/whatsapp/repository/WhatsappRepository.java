package com.example.whatsapp.repository;

import com.example.whatsapp.entity.WhatsappData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WhatsappRepository extends MongoRepository<WhatsappData , ObjectId> {
}
