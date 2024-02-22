package br.com.javavainaweb.banco;

import java.util.Scanner;

public abstract class Conta {
	private int numeroConta;
	private int numeroAgencia;
	private String nomeTitular;
	private String cpf;
	private double saldo;

	public Conta() {

	}

	public Conta(int numeroConta, int numeroAgencia, String nomeTitular, String cpf) {
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.saldo = 0.0;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(short numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

}
