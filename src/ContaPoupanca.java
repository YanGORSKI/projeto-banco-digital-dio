public class ContaPoupanca extends Conta {
	private static int SEQUENCIAL = 0000001;
	double taxa;
	
	public ContaPoupanca(Cliente cliente) {
		super.cliente = cliente;
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
		super.digito = super.digitoPoupanca[super.rnd.nextInt(0,((super.digitoPoupanca.length)-1))];
		this.taxaAtt();
		}
	
	public double getRentabilidade() {
		if ((this.saldo > 0) && (this.saldo <= 1000)) 
			return 0.002;
		if ((this.saldo > 1000) && (this.saldo <= 10000)) 
			return 0.005;
		if (this.saldo > 10000) 
			return 0.007;
		else
			return 0.000;
		}
	
	public void taxaAtt() {
		this.taxa = this.getRentabilidade();
	}
	
	@Override
	public void extrato() {
		System.out.print("\n\n=== Extrato Conta Poupança ===\n");
		System.out.printf("Cliente: %s\n", cliente.getNome());
		super.infosComuns();
		System.out.printf("\nRentabilidade: R$ %.2f ao mês", (saldo*taxa));
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		this.taxaAtt();
	}
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
		this.taxaAtt();
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		super.transferir(valor, contaDestino);
		this.taxaAtt();
	
}
}