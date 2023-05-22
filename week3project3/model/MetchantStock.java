package com.example.week3project3.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class MetchantStock {
    @NotEmpty(message = "must not be empty")
    @Size(min = 3,max = 3)
    private int id;
    @NotEmpty(message = "must not be empty")
    @Size(min = 3,max = 3)
    private int productid;
    @NotEmpty(message = "must not be empty")
    @Size(min = 3,max = 3)
    private String merchanid;
    @NotEmpty
    @Min(10)
    private int stock;

}
