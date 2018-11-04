package com.shuvadip.service;

import com.shuvadip.bean.Topic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@ComponentScan(basePackages = "com.shuvadip.service")
@Service
public class TopicService {

    List<Topic> topicList ;

    public TopicService() {
        topicList= new ArrayList<>(Arrays.asList(new Topic(
                "Java","its about Core Java","1"),new Topic(
                "JavaScript","its about  JavaScript","2")));
    }

    public List<Topic> getTopicList(){
        return topicList;
    }

    public Topic getTopic(String topicId){
       return topicList.stream().filter(t->t.getTopicId().equals(topicId)).findFirst().get();
    }

    public void createNewTopic(Topic tp){
        topicList.add(tp);
    }
}
