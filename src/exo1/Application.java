package exo1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementInterface1 ex1 = new ImplementInterface1();
		ImplementInterface2 ex2 = new ImplementInterface2();
		
		ex1.setV1(14);
		ex1.setV2(12);
		
		ex2.setV1(165);
		ex2.setV2(189);
		ex2.setV3(171);
		
		System.out.println("La note minimale est : " + ex1.minimum());
		System.out.println("la taille maximum est : " + ex2.maximum());
	}

}
