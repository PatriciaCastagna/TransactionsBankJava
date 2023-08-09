package application;

import clientes.Clientes;
import contas.ContaPoupança;
import contas.ContaCorrente;

public class Bank {

	public static void main(String[] args) {
		
		Clientes cliente1 = new Clientes("Patricia", "123456");
		ContaCorrente cc1 = new ContaCorrente(cliente1, 100);
		ContaPoupança cp1 = new ContaPoupança(cliente1, 1000);
		//para depositar eu envio para variavel cc1
		cc1.depositar(100);
		cc1.exibirSaldo();
		cc1.sacar(500);
		cp1.depositar(1000);
		cp1.exibirSaldo();
		cp1.sacar(0);
		//como fazer?
		
		
		

	}

}
