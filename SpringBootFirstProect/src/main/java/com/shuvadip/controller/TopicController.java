package com.shuvadip.controller;

import com.shuvadip.bean.Topic;
import com.shuvadip.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@ComponentScan(basePackages = "com.shuvadip.controller")
@RestController
public class TopicController {

    @Autowired
    private TopicService service;

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return service.getTopicList();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(String id){
        return service.getTopic(id);
    }
}
