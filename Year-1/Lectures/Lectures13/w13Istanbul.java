package lectures;

public class w13Istanbul extends w13Izmir implements w13IBilgi,w13IAnkara,w13ISivas{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("HELLO ISTANBUL!");
	}

	@Override
	public void ankara(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Hello " + msg);
	}

	@Override
	public void erzurum() {
		// TODO Auto-generated method stub
		System.out.println("Erzurum");
	}

	@Override
	public void sivas() {
		// TODO Auto-generated method stub
		System.out.println("Sivas");
	}

	
}
