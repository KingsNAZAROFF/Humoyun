package com.example.humoyun.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegDto {
    private String name;
    private String lastName;
    private Integer age;
}
