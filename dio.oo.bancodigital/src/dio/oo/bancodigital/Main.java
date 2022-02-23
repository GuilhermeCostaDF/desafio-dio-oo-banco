package dio.oo.bancodigital;

public class Main {

	public static void main(String[] args) {
		
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme Costa");
		
		Conta cc = new ContaCorrente(guilherme);
		Conta poup = new ContaPoupanca(guilherme);
		
		cc.depositar(123);
		cc.transferir(100, poup);
		poup.transferir(5, cc);
		
		cc.imprimirExtrato();
		poup.imprimirExtrato();

	}

}
