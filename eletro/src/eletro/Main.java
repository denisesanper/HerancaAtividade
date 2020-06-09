package eletro;
import eletro.model.Eletrodomestico;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eletrodomestico eletro = new Eletrodomestico(); 
		eletro.setModelo("Geladeira");
		eletro.setMarca("Eletrolux");
		eletro.setCor("branca");
		
		System.out.println(eletro.getModelo());
		System.out.println(eletro.getCor());
		System.out.println(eletro.getMarca());
		
	}

}
