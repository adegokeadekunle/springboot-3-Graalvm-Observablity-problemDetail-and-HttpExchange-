package com.adekunle.springboot3newfeatures.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class  Customers{
    private int id;
    private String email;
    private String name;
    private String description;
}
