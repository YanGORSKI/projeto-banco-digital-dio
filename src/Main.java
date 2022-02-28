
public class Main {

	public static void main(String[] args) {
		Cliente yan = new Cliente();
		yan.setNome("Yan Gorski");
		
		Conta cc = new ContaCorrente(yan);
		Conta cp = new ContaPoupanca(yan);
		
		cc.extrato();
		cp.extrato();
		cc.depositar(900);
		cc.extrato();
		cp.extrato();
		cc.transferir(900, cp);
		cc.extrato();
		cp.extrato();
		cp.depositar(120);
		cc.extrato();
		cp.extrato();
	}

}
