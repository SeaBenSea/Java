package lectures;

public class w13Bursa extends w13ABursa implements w13IBilgi{

	@Override
	public void sivas() {
		// TODO Auto-generated method stub
		System.out.println("This is sivas, comes from interface");
	}

	@Override
	public void erzurum() {
		// TODO Auto-generated method stub
		System.out.println("This is erzurum, comes from interface");
	}

	@Override
	public void bursa() {
		// TODO Auto-generated method stub
		System.out.println("This is bursa, comes from w13ABursa");
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hi Bilgi");
	}

}
