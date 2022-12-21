package com.adekunle.springboot3newfeatures.controller;


import com.adekunle.springboot3newfeatures.dto.Post;
import com.adekunle.springboot3newfeatures.service.PostClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class PostClientController {

    private final PostClientService clientService;

    @GetMapping("/allpost")
    public List<Post> getAllPosts(){
        return clientService.getAllPost();
    }
}
