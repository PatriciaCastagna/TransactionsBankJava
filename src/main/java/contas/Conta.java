package contas;

import clientes.Clientes;
//quando as classes não estão no mesmo pacote deve-se importar

public class Conta {
	
	public Clientes cliente;
	private double saldo;
	
	
	//Adicionado somente clientes pois nem toda conta tem saldo
	public Conta(Clientes cliente) {
		
		this.cliente = cliente;
		saldo = 500;
		
		
	}
	

	
	//método para criar deposito
	public void depositar(double valor) {
		saldo = valor+valor;
		
	}
	
	public void sacar(double valor){
		 if(saldo>=valor) {
			 saldo = saldo - valor;// ou saldo+=valor
			 
			
		 }else { 
			 
			 System.out.println("Saldo indisponivel para saque");
			 
		 }
		
		
	}
	
	public void exibirSaldo() {
		System.out.println("Saldo atual R$"+saldo);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	


}
