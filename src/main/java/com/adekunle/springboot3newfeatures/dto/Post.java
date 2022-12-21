package com.adekunle.springboot3newfeatures.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int userId;
    private int id;
    private String name;
    private String description;
}
