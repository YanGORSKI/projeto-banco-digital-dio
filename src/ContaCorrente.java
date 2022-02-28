
public class ContaCorrente extends Conta{
	
	private static int SEQUENCIAL = 0000001;

	public ContaCorrente(Cliente cliente) {
		super.cliente = cliente;
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
		super.digito = super.digitoCorrente[super.rnd.nextInt(0,((super.digitoCorrente.length)-1))];
	}
	
	@Override
	public void extrato() {
		System.out.print("\n\n=== Extrato Conta Corrente ===\n");
		System.out.printf("Cliente: %s\n", cliente.getNome());
		super.infosComuns();
	}
	
}
