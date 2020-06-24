package com.lotrlcg.demo.hero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {
	
	@Autowired
	private HeroRepository heroRepository;
	
	public Hero findHeroById(long id) {
		return heroRepository.findById(id).orElse(null);
	}

	public Hero addHero(Hero hero) {
		return heroRepository.save(hero);
	}

	public List<Hero> getHeroes() {
		return (List<Hero>) heroRepository.findAll();
	}
	
	public String deleteHero(long id) {
		Hero hero = heroRepository.findById(id).orElse(null);
		heroRepository.deleteById(id);
		return "Hero removed: " + hero.toString();
	}
	
	public Hero updateHero(Hero hero) {
		Hero currentHero = heroRepository.findById(hero.getId()).orElse(null);
		currentHero.setAtack(hero.getAtack());
		currentHero.setDefense(hero.getDefense());
		currentHero.setHealth(hero.getHealth());
		currentHero.setName(hero.getName());
		currentHero.setSphere(hero.getSphere());
		currentHero.setThreat(hero.getThreat());
		currentHero.setWillPower(hero.getWillPower());
		
		return heroRepository.save(currentHero);
	}

}
