package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}
	
	public void takeDamage(Champion champ) {
		
		if (this.armor < champ.attack) {
			this.life -=  champ.attack - this.armor;
		}
		else {
			this.life -= 1;
		}
		if (this.life < 0) {
			this.life = 0;
		}
			
	}
	
	public String status() {
		if (life == 0) {
			return name + ": " + life + " de vida (morreu)";
		}
		else {
			return name + ": " + life + " de vida";
		}
	}
	
}
