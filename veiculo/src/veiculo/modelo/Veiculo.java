package veiculo.modelo;

public class Veiculo {
	private String modelo;
	private double vmax;
	private double velocidade = 0;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVmax() {
		return vmax;
	}
	public void setVmax(double vmax) {
		this.vmax = vmax;
	}
	
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public void acelerar() {
		
		this.velocidade = this.velocidade+10;
		
		
		System.out.println("O carro esta acelerando velocidade atual = "+this.velocidade);
	}
	public void frear() {
		
		this.velocidade = this.velocidade-10;
		
		
		System.out.println("O carro esta freando velocidade atual = "+this.velocidade);
	}
	
}
