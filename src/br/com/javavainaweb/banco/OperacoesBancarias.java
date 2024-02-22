package br.com.javavainaweb.banco;

public interface OperacoesBancarias {
	public void sacar(double valor);

	public void depositar(double valor);

	public void transferir(int numeroConta, double valor);
	
	public void menu(int opcoes);
	
	public void visualisar();
}
