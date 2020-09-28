package main;

public class Tren extends TransporteGuardable {

	@Override
	public String obtenerEstado() {
		return "Soy un Tren: " + super.obtenerEstado() + "\n";
	}

}
