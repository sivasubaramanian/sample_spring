package com.example.sample.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Document(collation = "form")
public class Form {
    @Id
    String id;
    Integer returnQty;
    String  reason;
    Date expiryDate;
    
}
