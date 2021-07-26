//Deniz Günenç 120200078
package worksheets;

import java.util.Random;

public class Monster {
	
	private String name;
	private int power;
	private int criticalChance;
	
	
	public Monster(String name, int power, int criticalChance){//Monster class
		this.name = name;//Monster's name
		this.power = power;//Monster's power
		this.criticalChance = criticalChance;//Monster's critical chance
	}
	
	
	public String getName() {//get name method
		return name;
	}

	public void setName(String name) {//set name method
		this.name = name;
	}
	
	public int getPower() {//get power method
		return power;
	}

	public void setPower(int power) {//set power method
		this.power = power;
	}
	
	public int getCriticalChance() {//get critical chance method
		return criticalChance;
	}

	public void setCriticalChance(int criticalChance) {//set critical chance method
		this.criticalChance = criticalChance;
	}
	
	@Override
	public String toString() {//to string method returns Monster's name, monster's power and monster's critical chance
		return "Monster [name=" + name + ", power=" + power + ", criticalChance=" + criticalChance + "]";
	}
	
	public int attack(int criticalMultiplier) {//attack method
		Random rand = new Random();//creating random object
		int rand_number = rand.nextInt(101);//creating integer number between [0,100]
		if (criticalChance > rand_number) {//if critical chance more then number 
			return power * criticalMultiplier;//returns power times critical multiplier
		}
		else {//else
			return power;//returns only power
		}		
	}
	
	
	public static void main(String[] args) {
	}
}
