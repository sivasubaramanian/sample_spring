package com.example.sample.dto.request;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class FormRequest {
    Integer returnQty;
    String  reason;
    Date expiryDate;
}
