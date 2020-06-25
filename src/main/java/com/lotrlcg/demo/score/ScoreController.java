package com.lotrlcg.demo.score;

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
@RequestMapping("/api/score")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@GetMapping("/get")
	public List<Score> getScores() {
		return scoreService.getScores();
	}
	
	@GetMapping("/get/{id}")
	public Score getScoreById(@PathVariable long id) {
		return scoreService.getScoreById(id);
	}
	
	@PostMapping("/add")
	public Score addScore(@RequestBody Score score) {
		return scoreService.addScore(score);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteScore(@PathVariable long id) {
		return scoreService.deleteScore(id);
	}
	
	@PutMapping("/update")
	public Score updateScore(@RequestBody Score score) {
		return scoreService.updateScore(score);
	}

}
