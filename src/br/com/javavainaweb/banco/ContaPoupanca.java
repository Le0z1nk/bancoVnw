package br.com.javavainaweb.banco;

import java.util.Scanner;

public class ContaPoupanca extends Conta implements OperacoesBancarias {
	public ContaPoupanca() {

	}

	public ContaPoupanca(int numeroConta, int numeroAgencia, String nomeTitular, String cpf) {
		super(numeroConta, numeroAgencia, nomeTitular, cpf);

	}

	@Override
	public void sacar(double valor) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do saque: ");
		valor = sc.nextDouble();
		if (valor > getSaldo()) {
			System.out.println("Você não pode fazer esse saque");
		} else {
			setSaldo((getSaldo() - valor) + valor * 0.02);
			System.out.println("Saque realizado. Saldo: " + getSaldo());
		}

	}

	@Override
	public void depositar(double valor) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do depósito: ");
		valor = sc.nextDouble();
		if (valor <= 0) {
			System.out.println("Você não pode fazer esse depósito");
		} else {
			setSaldo(getSaldo() + valor);
			System.out.println("Depósito realizado. Saldo: " + getSaldo());
		}

	}

	@Override
	public void transferir(int numeroConta, double valor) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da conta: ");
		numeroConta = sc.nextInt();
		sacar(valor);
	}

	@Override
	public void menu(int opcoes) {
		System.out.println("----------MENU CONTA POUPANÇA----------");
		Scanner sc = new Scanner(System.in);
		while (opcoes != 0) {
			System.out.printf("1)Sacar\n2)Depositar\n3)Transferir\n4)Visualisar dados da conta\n0)Encerrar Programa");
			opcoes = sc.nextInt();
			switch (opcoes) {
			case 1:
				sacar(0);
				break;
			case 2:
				depositar(0);
				break;
			case 3:
				transferir(opcoes, opcoes);
				break;
			case 4:
				visualisar();
			}
		}
	}

	@Override
	public void visualisar() {
		System.out.println("Numero da conta: " + this.getNumeroConta() + "\nNumero da agência: "
				+ this.getNumeroAgencia() + "\nNome do titular: " + this.getNomeTitular() + "\nCpf: " + this.getCpf()
				+ "\nSaldo: " + this.getSaldo());

	}

}
