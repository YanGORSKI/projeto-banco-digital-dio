import java.util.Random;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 00001;
	
	protected int agencia;
	protected int numero;
	protected int digito;
	protected double saldo;
	protected int[] digitoPoupanca = {1,3,5,7,9};
	protected int[] digitoCorrente = {0,2,4,6,8};
	Random rnd = new Random();
	protected Cliente cliente;
	

	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void extrato() {
	}
	
	public void infosComuns() {
		System.out.printf("Agência: %04d", agencia);
		System.out.printf("\nNúmero: %06d" + "-" + digito, numero);
		System.out.printf("\nSaldo: R$ %.2f", saldo);
		
	}
}
