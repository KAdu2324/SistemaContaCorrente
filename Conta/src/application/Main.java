package application;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		
		Conta cc1 = new Conta(1001, "Maria", 1000.0);
		cc1.saque(200.0);
		System.out.println(cc1.getSaldo());
		
		Conta cc2 = new ContaPoupanca(1002, "Jose", 1000.0, 0.05);
		cc2.saque(200.0);
		System.out.println(cc2.getSaldo());
		
		Conta cc3 = new ContaEmpresarial(1003, "Julia", 1000.0, 500.0);
		cc3.saque(200.0);
		System.out.println(cc3.getSaldo());
	}

}
