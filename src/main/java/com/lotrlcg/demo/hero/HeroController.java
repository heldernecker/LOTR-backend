package com.lotrlcg.demo.hero;



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
@RequestMapping("/api/hero")
public class HeroController {
	
	@Autowired
	private HeroService heroService;
	
	@PostMapping("/add")
	public Hero addHero(@RequestBody Hero hero) {
		return heroService.addHero(hero);
	}
	
	@GetMapping("/get/{id}")
	public Hero getHeroById(@PathVariable long id) {
		return heroService.findHeroById(id);
	}
	
	@GetMapping("/get")
	public List<Hero> getHeroes() {
		return heroService.getHeroes();
	}
	
	@PutMapping("/update")
	public Hero updateHero(Hero hero) {
		return heroService.updateHero(hero);
	}
	
	@DeleteMapping("/delete")
	public String deleteHero(long id) {
		return heroService.deleteHero(id);
	}
	

}
