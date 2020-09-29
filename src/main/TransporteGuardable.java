package main;

public class TransporteGuardable implements ITransporte, EstadoGuardable {

	public int VelocidadActual;
	public int VelocidadMaxima;

	public TransporteGuardable(int velocidadMaxima) {
		this.VelocidadMaxima = velocidadMaxima;
	}

	public void acelerar(int velocidad) {
		if ((this.VelocidadActual + velocidad) <= this.VelocidadMaxima) {
			this.VelocidadActual += velocidad;
		}
	}

	public void desacelerar(int velocidad) {
		if ((this.VelocidadActual - velocidad) >= 0) {
			this.VelocidadActual -= velocidad;
		} else {
			this.VelocidadActual = 0;
		}
	}

	@Override
	public String obtenerEstado() {

		return "Velocidad Actual: " + this.VelocidadActual;
	}

}