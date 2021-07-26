//Deniz Günenç 120200078
package worksheets;

public class Paper {
	
	private int size;
	private int quality;

	public  Paper(int size, int quality) {//Paper Class
		this.size = size;//Paper's size
		this.quality = quality;//Paper's quality
	}

	@Override
	public String toString() {//to string method return size and quality
		return "Paper [size=" + size + ", quality=" + quality + "]";
	}

	public int getSize() {//get size method
		return size;//returns size of paper 
	}

	public void setSize(int size) {//set size method
		this.size = size;//updating size of the paper with new size
	}

	public int getQuality() {//get quality method
		return quality;//returns quality of paper 
	}

	public void setQuality(int quality) {//set quality method
		this.quality = quality;//updating quality of the paper with new quality
	}
}
