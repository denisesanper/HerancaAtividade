package veiculo.modelo;

public class Carro extends Veiculo {

	private String tmala;
	private boolean acond;
	
	public String getTmala() {
		return tmala;
	}
	public void setTmala(String tmala) {
		this.tmala = tmala;
	}
	public boolean isAcond() {
		return acond;
	}
	public void setAcond(boolean acond) {
		this.acond = acond;
	}
	
	public void arteste() {
		if(this.acond==true) {
			System.out.println("O carro tem ar condicionado");
			
		}
	}
}
