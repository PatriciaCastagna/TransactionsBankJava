package contas;

import clientes.Clientes;

public class ContaPoupança extends Conta{
	
	
	private double saldoPoupanca = 1000;
	
	
	public ContaPoupança(Clientes clientes, double saldoPoupanca){
		
		super(clientes);
		
		this.saldoPoupanca = saldoPoupanca;
		
		
		
		
	}
	
	
	public void exibirSaldoPoupanca() {
		System.out.println("Saldo poupança atual é R$"+saldoPoupanca);
		
	}
	
	public double getSaldo() {
		return saldoPoupanca;
	}
	
	public void setSaldo(double saldo) {
		this.saldoPoupanca = saldoPoupanca;
	}
	

}
