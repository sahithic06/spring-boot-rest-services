package io.sahithi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService  {
	@Autowired
	private TopicRepository topicRepository;
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "SF","This is Description"),
			new Topic("spring1", "SF","This is Description"),
			new Topic("spring2", "SF","This is Description")));
	
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).orElse(null);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deteleTopic(String id) {
		topicRepository.deleteById(id);
			}  
}
