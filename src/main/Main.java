package main;

public class Main {

	private TransporteGuardable[] transportes;

	public static void main(String[] args) {
		new Main().run();
	}

	private Main() {
		this.transportes = new TransporteGuardable[2];
		this.transportes[0] = new Tren(100);
		this.transportes[1] = new Avion(500, 300);
	}

	private void run() {
		// Estado inicial
		guardarTodos();

		// Acelerando y elevando
		transportes[0].acelerar(20);
		transportes[1].acelerar(50);
		guardarTodos();

		// Desacelerando y descendiendo
		transportes[0].desacelerar(5);
		transportes[1].desacelerar(25);
		guardarTodos();

	}

	private void guardarTodos() {
		for (TransporteGuardable transporteGuardable : this.transportes) {
			new GuardadorDeTransporteEnBaseDeDatos(transporteGuardable).guardar();
		}
	}
}
