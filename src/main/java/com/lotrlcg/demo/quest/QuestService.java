package com.lotrlcg.demo.quest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestService {
	
	@Autowired
	private QuestRepository questRepository;
	
	public Quest addQuest(Quest quest) {
		return questRepository.save(quest);
	}
	
	public Quest getQuestById(long id) {
		return questRepository.findById(id).orElse(null);
	}
	
	public List<Quest> getQuests() {
		return (List<Quest>) questRepository.findAll();
	}
	
	public String deleteQuest(long id) {
		Quest quest = questRepository.findById(id).orElse(null);
		questRepository.deleteById(id);
		return "Quest deleted: " + quest.toString();
	}
	
	public Quest updateQuest(Quest quest) {
		Quest currentQuest = questRepository.findById(quest.getId()).orElse(null);
		currentQuest.setName(quest.getName());
		
		return questRepository.save(currentQuest);
	}

}
