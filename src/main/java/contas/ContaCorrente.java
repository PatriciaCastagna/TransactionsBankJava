package contas;


import clientes.Clientes;

public class ContaCorrente extends Conta {
	

	private double limiteChequeEspecial;
	
	
	//Clientes que pertencem ao pack clientes por isso escrevi duas vezes;
	//conta corrente tem cheque especial;

	public ContaCorrente(Clientes clientes, double limiteChequeEspecial) {
        
		
		//super é para enviar informações a conta "pai", estou enviando os clientes
		super(clientes);
		this.limiteChequeEspecial = limiteChequeEspecial;
		double novoSaldo = limiteChequeEspecial + getSaldo();
		setSaldo(novoSaldo);
	}
	
	

}
