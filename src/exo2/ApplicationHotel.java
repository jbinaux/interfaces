package exo2;

public class ApplicationHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotel5 chezTruc = new Hotel5();
		Hotel7 ritz = new Hotel7();
		
		chezTruc.setNbSauna(5);
		chezTruc.setTaillePiscine(50);
		
		ritz.setNbSauna(10);
		ritz.setTaillePiscine(100);
		
		chezTruc.reserverTaxiLuxe();
		chezTruc.descriptionPiscine();

		ritz.reserverTaxiLuxe();
		ritz.descriptionPiscine();
	}

}
