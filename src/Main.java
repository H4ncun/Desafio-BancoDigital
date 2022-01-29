import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();	
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String rua = "Rua Pedro";
		String numero = "734";
		String cep = "07685-010";
	
		cliente.setNome(nome);		
	    cliente.setEndereco(new Endereco(rua,numero,cep));
		
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(400);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		poupanca.depositar(300);
		
		cc.sacar(50);
		
		System.out.println("Realizando Saque");
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}