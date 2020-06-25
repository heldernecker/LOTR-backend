package com.lotrlcg.demo.score;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.lotrlcg.demo.hero.Hero;
import com.lotrlcg.demo.quest.Quest;

@Entity
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToMany(fetch = FetchType.EAGER, 
			cascade={CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name="score_hero", 
			joinColumns= {@JoinColumn(name="score_id")},
			inverseJoinColumns = {@JoinColumn(name="hero_id")})
	private List<Hero> heroes;
	
	@ManyToOne(fetch = FetchType.EAGER, 
			cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="quest_id")
	private Quest quest;
	
	private int finalThreat;
	
	private int roundsTaken;
	
	private int damageOnHeroes;
	
	private int deadHeroesCost;
	
	private int victoryPoints;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Hero> getHeroes() {
		return heroes;
	}

	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
	}

	public Quest getQuest() {
		return quest;
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public int getFinalThreat() {
		return finalThreat;
	}

	public void setFinalThreat(int finalThreat) {
		this.finalThreat = finalThreat;
	}

	public int getRoundsTaken() {
		return roundsTaken;
	}

	public void setRoundsTaken(int roundsTaken) {
		this.roundsTaken = roundsTaken;
	}

	public int getDamageOnHeroes() {
		return damageOnHeroes;
	}

	public void setDamageOnHeroes(int damageOnHeroes) {
		this.damageOnHeroes = damageOnHeroes;
	}

	public int getDeadHeroesCost() {
		return deadHeroesCost;
	}

	public void setDeadHeroesCost(int deadHeroesCost) {
		this.deadHeroesCost = deadHeroesCost;
	}

	public int getVictoryPoints() {
		return victoryPoints;
	}

	public void setVictoryPoints(int victoryPoints) {
		this.victoryPoints = victoryPoints;
	}
	
	public int getTotalScore() {
		return (10 * roundsTaken) + finalThreat + damageOnHeroes + deadHeroesCost - victoryPoints;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", heroes=" + heroes + ", quest=" + quest + ", finalThreat=" + finalThreat
				+ ", roundsTaken=" + roundsTaken + ", damageOnHeroes=" + damageOnHeroes + ", deadHeroesCost="
				+ deadHeroesCost + ", victoryPoints=" + victoryPoints + ", getTotalScore()=" + getTotalScore() + "]";
	}
	
	

}
