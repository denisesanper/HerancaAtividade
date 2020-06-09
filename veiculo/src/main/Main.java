package main;
import veiculo.modelo.Carro;
import veiculo.modelo.Moto;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro car =  new Carro();
		car.setModelo("gol");
		car.setTmala("pequeno");
		car.setAcond(true);
		car.setVmax(180);
		

		System.out.println(car.getModelo());
		System.out.println(car.getTmala());
		System.out.println(car.getVmax());
		car.arteste();
		car.acelerar();
		car.acelerar();
		car.frear();
		
		System.out.println(car.getVelocidade());
		
		
		Moto m = new Moto(true);
		m.bagagem();
		
	}

}
