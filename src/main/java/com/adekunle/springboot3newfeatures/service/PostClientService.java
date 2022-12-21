package com.adekunle.springboot3newfeatures.service;

import com.adekunle.springboot3newfeatures.dto.Post;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface PostClientService {

    @GetExchange("/posts")
    public List<Post> getAllPost();
}
