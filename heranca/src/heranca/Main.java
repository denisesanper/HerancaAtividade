package heranca;
import heranca.model.Aeronave;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeronave nave = new Aeronave();
		nave.setModelo("airbus330");
		nave.setCor("branca");
		nave.setCmax(330);
		
		
		System.out.println(nave.getModelo());
		System.out.println(nave.getCor());
		System.out.println(nave.getCmax());
	}

}
