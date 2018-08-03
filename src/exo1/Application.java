package exo1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementInterface1 ex1 = new ImplementInterface1();
		
		ex1.setV1(14);
		ex1.setV2(12);
		
		System.out.println("La note minimale est : " + ex1.minimum());
	}

}
