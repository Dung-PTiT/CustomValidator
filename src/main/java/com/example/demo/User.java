package com.example.demo;

import lombok.Data;

@Data
public class User {
    @LodaId(maxInt = 20, message = "Value can not be more than 20")
    private Double number;
}
