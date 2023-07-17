
public class Gerente extends Funcionario implements Autenticable{
	
	
	
	
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return 2000;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	
}
