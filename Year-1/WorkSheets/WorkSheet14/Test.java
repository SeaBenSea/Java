
public class Test {
	
	public static void main(String[] args) {
		System.out.println("--RAM PART--");
		Ram ram1 = new Ram(30, 2.5, 5.2, 1.6, 10, 16);//creating a ram object
		System.out.print("Ram's area: ");
		System.out.println(ram1.area());//calculating ram's area
		System.out.print("Ram's electric usage: ");
		System.out.println(ram1.electricusage());//calculating ram's electric usage
		ram1.moveToSlot(2);//changing ram's slot
		System.out.print("Ram's TRY price: ");
		System.out.println(ram1.priceTRY());//calculating TRY price for ram
		System.out.println(ram1.toString() + "\n");//printing the rams's properties
		
		System.out.println("--SSD PART--");
		Ssd ssd1 = new Ssd(50, 2.5, 2.5, 26, 512);//creating a ssd object
		System.out.print("Ssd's area: ");
		System.out.println(ssd1.area());//calculating ssd's area
		System.out.print("Ssd's electric usage: ");
		System.out.println(ssd1.electricusage());//calculating ssd's electric usage
		ssd1.moveToSlot(1);//changing ssd's slot
		System.out.print("Ssd's TRY price: ");
		System.out.println(ssd1.priceTRY());//calculating TRY price for ssd
		System.out.println(ssd1.toString());//printing the ssd's properties
	}

}
