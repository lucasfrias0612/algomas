package main;

public class Avion extends TransporteGuardable implements ITransporteAero {
	public int VelocidadActual;
	public int VelocidadMaxima;
	public int AlturaActual;
	public int AlturaMaxima;

	@Override
	public void volar(int altitud) {
		if ((this.AlturaActual + altitud) < 0) {
			this.AlturaActual = 0;
		} else if ((this.AlturaActual + altitud) > this.AlturaMaxima) {
			this.AlturaActual = this.AlturaMaxima;
		} else {
			this.AlturaActual += altitud;
		}
	}

	@Override
	public String obtenerEstado() {
		return "Soy un Avión: " + super.obtenerEstado() + ", Altura Actual: " + AlturaActual + "\n";
	}

}