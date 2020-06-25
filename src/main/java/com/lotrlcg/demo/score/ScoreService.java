package com.lotrlcg.demo.score;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	public List<Score> getScores() {
		return (List<Score>) scoreRepository.findAll();
	}
	
	public Score getScoreById(long id) {
		return scoreRepository.findById(id).orElse(null);
	}
	
	public Score addScore (Score score) {
		return scoreRepository.save(score);
	}
	
	public String deleteScore(long id) {
		Score score = scoreRepository.findById(id).orElse(null);
		scoreRepository.deleteById(id);
		return score.toString();
	}
	
	public Score updateScore(Score score) {
		Score currentScore = scoreRepository.findById(score.getId()).orElse(null);
		currentScore.setDamageOnHeroes(score.getDamageOnHeroes());
		currentScore.setDeadHeroesCost(score.getDeadHeroesCost());
		currentScore.setFinalThreat(score.getFinalThreat());
		currentScore.setHeroes(score.getHeroes());
		currentScore.setQuest(score.getQuest());
		currentScore.setRoundsTaken(score.getRoundsTaken());
		currentScore.setVictoryPoints(score.getVictoryPoints());
		
		return scoreRepository.save(currentScore);
	}

}
