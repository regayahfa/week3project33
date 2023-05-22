package com.example.week3project3.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Merchant {
    @NotEmpty(message = "must not be empty")
    @Size(min = 1,max = 3)
    private int id;
    @NotEmpty(message = "must not be empty")
    @Size(min = 3,max = 3)
    private  String name;


}
