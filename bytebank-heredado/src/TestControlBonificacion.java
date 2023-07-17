
public class TestControlBonificacion {
	
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		ControlBonificaciones controlBonificaciones = new ControlBonificaciones();
		
		controlBonificaciones.registrarSalario(diego);
		controlBonificaciones.registrarSalario(jimena);
		controlBonificaciones.registrarSalario(alexis);
	}

}
