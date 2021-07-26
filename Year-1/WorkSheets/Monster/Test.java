//Deniz Günenç 120200078
package worksheets;


public class Test {
	
	public void battle(Monster object, int wizardHealth) {//battle method
		while (wizardHealth > 0) {//while wizards health more then 0 monster attacks it
			System.out.println("Wizard health: " + wizardHealth);//printing remaining health
			wizardHealth = wizardHealth - object.attack(15);//monster attacks to wizard
		}
		System.out.println("Wizard health: " + wizardHealth);//printing last health
	}
	
	public static void main(String[] args) {
		Test func = new Test();//create object
		
		Monster m1 = new Monster("SBS", 10, 80);//creating monster
		
		System.out.println(m1.getName());//getting Monster's name
		m1.setName("Deniz");//setting Monster's name to Deniz
		System.out.println(m1.getName());//getting updated Monster's name
		
		System.out.println(m1.getPower());//getting Monster's power
		m1.setPower(30);//setting Monster's power to 30
		System.out.println(m1.getPower());//getting updated Monster's power
		
		System.out.println(m1.getCriticalChance());//getting Monster's critical chance
		m1.setCriticalChance(50);//setting Monster's critical chance to 50
		System.out.println(m1.getCriticalChance());//getting updated Monster's critical chance
		
		System.out.println(m1.toString());//printing the Monster's properties by using toString method
		
		func.battle(m1, 1000);//starting a battle with m1 vs. 1000 health wizard
	}
	

}
