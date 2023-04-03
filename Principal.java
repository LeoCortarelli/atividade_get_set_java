package Trabalho;

public class Principal {
	public static void main(String[] args) {
		
		Conta conta_01 = new Conta(23196, 50.00, 1);
		Conta conta_02 = new Conta(23085, 2);
		
		Conta conta_03 = new Conta();
		conta_03.setNumero(22145);
		conta_03.setSaldo(100);
		conta_03.setTipo(3);
		
		System.out.println(conta_01.toString());
		System.out.println(conta_02.toString());
		System.out.println(conta_03.toString());
		
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");
		
		if (conta_01.setSaldo(-30)){
			System.out.println("Saldo alterado");
		}else {
			System.out.println("Saldo Não alterado");
		}
		System.out.println(conta_01.toString());
		// O que aconteceu ?
		// Ele não alterou o saldo porque o numero do saldo negativo.
		
		
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");
		
		
		if (conta_01.setSaldo(90)){
			System.out.println("Saldo alterado");
		}else {
			System.out.println("Saldo Não alterado");
		}
		System.out.println(conta_01.toString());
		// O que aconteceu ?
		// Ele alterou o saldo para o numero que esta dentro do parametro.
		
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");
		
		
		if (conta_02.setSaldo(-10)){
			System.out.println("Saldo alterado");
		}else {
			System.out.println("Saldo Não alterado");
		}
		System.out.println(conta_02.toString());
		// O que aconteceu ?
		// Ele não alterou o saldo da conta porque está recebendo um valor negativo.
		
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");
		
		
		if (conta_02.setSaldo(400)){
			System.out.println("Saldo alterado");
		}else {
			System.out.println("Saldo Não alterado");
		}
		System.out.println(conta_02.toString());
		// O que aconteceu ?
		// Ele alterou o saldo para 400.
		
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");
		
		
		if (conta_03.setSaldo(-150)){
			System.out.println("Saldo alterado");
		}else {
			System.out.println("Saldo Não alterado");
		}
		System.out.println(conta_03.toString());
		// O que aconteceu ?
		// Ele alterou o saldo para -150 como está no parametro.
		
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(" ");
		
		
		if (conta_03.setSaldo(350)){
			System.out.println("Saldo alterado");
		}else {
			System.out.println("Saldo Não alterado");
		}
		System.out.println(conta_03.toString());
		// O que aconteceu ?
		// Ele alterou o saldo para 350.
	}
}
