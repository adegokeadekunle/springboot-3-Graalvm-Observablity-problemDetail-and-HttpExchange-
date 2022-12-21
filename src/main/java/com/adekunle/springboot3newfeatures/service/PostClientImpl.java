package com.adekunle.springboot3newfeatures.service;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;


@Service
public class PostClientImpl {

   @Bean
   public PostClientService getAllPosts() {
       WebClient client = WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
       HttpServiceProxyFactory proxyFactory = HttpServiceProxyFactory
               .builder(WebClientAdapter.forClient(client))
               .build();
       return proxyFactory.createClient(PostClientService.class);
   }

}
