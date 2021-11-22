package SpringApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Topic.topic;

@RestController
public class topicController {
	@SuppressWarnings("unused")
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<topic> getAllTopics() {
		return TopicService.getAllTopics();
		}
	@RequestMapping("/topics/{id}")
	public topic getTopic(@PathVariable String id) {
		return TopicService.getTopic(id);
	}
	@RequestMapping (method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody topic topic1) {
		TopicService.addTopic(topic1);
	}
	@RequestMapping (method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody topic topic1,@PathVariable String id) {
		TopicService.updateTopic(id,topic1);
    }
}
