
public class Contador extends Funcionario {
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecuando desde Contador");
		return 200;
	}

}
