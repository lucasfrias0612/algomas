package main;

public class GuardadorDeTransporteEnBaseDeDatos {

	private EstadoGuardable aGuardar;

	public GuardadorDeTransporteEnBaseDeDatos(EstadoGuardable transporte) {
		this.aGuardar = transporte;
	}

	public boolean guardar() {
		// Código para guardar el estado en DB el string devuelto por el siguiente
		// método:
		aGuardar.obtenerEstado();
		return true;
	}

}
