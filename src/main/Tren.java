package main;

public class Tren extends TransporteGuardable {

	public Tren(int velocidadMaxima) {
		super(velocidadMaxima);
	}

	@Override
	public String obtenerEstado() {
		return "Soy un Tren: " + super.obtenerEstado() + "\n";
	}

}
