
public abstract class Cuenta {
	protected double saldo;
	private int agencia = 1;
	@SuppressWarnings("unused")
	private int numero;
	private Cliente titular = new Cliente();
	
	
	private static int total = 0;
	
	public Cuenta(int agencia, int numero) {
		
		if (agencia <=0) {
			System.out.println("No se permiten 0");	
			this.agencia=1;
		}else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("se van creando: "+total+ " cuentas");
	}
	
	public abstract void depositar(double valor);
		
	public boolean retirar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
			
		} 
			return false;
		
		
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
			
		}else {
			return false;
		}
	}
		
	public boolean transferir(double valor, Cuenta destino){
		if (this.saldo >= valor) {
			this.saca (valor);
			destino.depositar(valor);
			return true;
			} else {
				return false;
			}
		}
	public double getSaldo (){
		return this.saldo;
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
		public static int getTotal() {
			return Cuenta.total;
		}
	}
	
	