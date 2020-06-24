package com.lotrlcg.demo.hero;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Hero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private long id;
	
	private String name;
	
	private int threat;
	
	private int willPower;
	
	private int atack;
	
	private int defense;
	
	private int health;
	
	private String sphere;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getThreat() {
		return threat;
	}
	public void setThreat(int threat) {
		this.threat = threat;
	}
	public int getWillPower() {
		return willPower;
	}
	public void setWillPower(int willPower) {
		this.willPower = willPower;
	}
	public int getAtack() {
		return atack;
	}
	public void setAtack(int atack) {
		this.atack = atack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getSphere() {
		return sphere;
	}
	public void setSphere(String sphere) {
		this.sphere = sphere;
	}
	@Override
	public String toString() {
		return "HeroModel [id=" + id + ", name=" + name + ", threat=" + threat + ", willPower=" + willPower + ", atack="
				+ atack + ", defense=" + defense + ", health=" + health + ", sphere=" + sphere + "]";
	}
	
	
}
