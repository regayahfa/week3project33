package com.example.week3project3.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data

public class Product {
    @NotEmpty(message = "must not be empty")
    @Size(min = 1,max = 3)
    private int id;
    @NotEmpty(message = "name must be not Empty")
    @Size(min = 3,max = 4)
    private String name;
    @NotEmpty(message = "price must  not be empty ")
    @Positive
    private String price;
    @NotEmpty(message = "category must not be empty ")
    @Size(min = 1,max = 3)
    private int categoryID;
}
