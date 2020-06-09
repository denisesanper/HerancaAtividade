package veiculo.modelo;

public class Moto {

	private boolean bagagem;
	
	public Moto(boolean bag){
		this.bagagem = bag;
	}
	
	public void bagagem() {
		if(this.bagagem==true) {
			System.out.println("A moto pode fazer entrega");
		}
	}
}
