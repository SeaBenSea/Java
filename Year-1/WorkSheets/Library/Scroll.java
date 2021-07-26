//Deniz Günenç 120200078
package worksheets;

public class Scroll extends Paper {

	private int preserveTime;

	public Scroll(int size, int quality) {//Scroll class
		super(size, quality);//getting size and quality properties from paper class
		if (quality < 10) {//if quality less then 10 preserve time changes to 200 years
			this.preserveTime = 200;
		}
		else if (quality < 30) {//if quality less than 30 and more than 10 preserve time changes to 160 years
			this.preserveTime = 160;
		}
		else if (quality < 50) {//if quality less than 50 and more than 30 preserve time changes to 120 years
			this.preserveTime = 120;
		}
		else if (quality < 70) {//if quality less than 70 and more than 50 preserve time changes to 80 years
			this.preserveTime = 80;
		}
		else if (quality < 90) {//if quality less than 90 and more than 70 preserve time changes to 40 years
			this.preserveTime = 40;
		}
		else if (quality < 100) {//if quality less than 100 and more than 90 preserve time changes to 20 years
			this.preserveTime = 20;
		}
		else {//else preserve time changes to 0 year
			this.preserveTime = 0;
		}
		
	}
	
	public Scroll(Paper p) {//scroll class with only paper input
		super(p.getSize(), p.getQuality());//getting size and quality properties from paper class
		if (p.getQuality() < 10) {//if quality less then 10 preserve time changes to 200 years
			this.preserveTime = 200;
		}
		else if (p.getQuality() < 30) {//if quality less than 30 and more than 10 preserve time changes to 160 years
			this.preserveTime = 160;
		}
		else if (p.getQuality() < 50) {//if quality less than 50 and more than 30 preserve time changes to 120 years
			this.preserveTime = 120;
		}
		else if (p.getQuality() < 70) {//if quality less than 70 and more than 50 preserve time changes to 80 years
			this.preserveTime = 80;
		}
		else if (p.getQuality() < 90) {//if quality less than 90 and more than 70 preserve time changes to 40 years
			this.preserveTime = 40;
		}
		else if (p.getQuality() < 100) {//if quality less than 100 and more than 90 preserve time changes to 20 years
			this.preserveTime = 20;
		}
		else {//else preserve time changes to 0 year
			this.preserveTime = 0;
		}
	}

	public int getPreserveTime() {//get preserveTime method
		return preserveTime;//returns preserveTime
	}

	public void setPreserveTime(int preserveTime) {//set preserveTime method
		this.preserveTime = preserveTime;//updates preserveTime with new preserveTime
	}

	@Override
	public String toString() {//toString method returns paper size, paper quality and scroll preserveTime
		return super.toString() + " Scroll [preserveTime=" + preserveTime + "]";
	}

	
}
