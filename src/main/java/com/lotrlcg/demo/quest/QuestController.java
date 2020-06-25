package com.lotrlcg.demo.quest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quest")
public class QuestController {
	
	@Autowired
	private QuestService questService;
	
	@PostMapping("/add")
	public Quest addQuest(@RequestBody Quest quest) {
		return questService.addQuest(quest);
	}
	
	@GetMapping("/get/{id}")
	public Quest getQuestById(@PathVariable long id) {
		return questService.getQuestById(id);
	}
	
	@GetMapping("/get")
	public List<Quest> getQuests() {
		return questService.getQuests();
	}
	
	@PutMapping("/update")
	public Quest updateQuest(@RequestBody Quest quest) {
		return questService.updateQuest(quest);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteQuest(@PathVariable long id) {
		return questService.deleteQuest(id);
	}

}
