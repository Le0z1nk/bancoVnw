package br.com.javavainaweb.banco;

public class Application {

	public static void main(String[] args) {
		ContaCorrente Arnaldo = new ContaCorrente(38956749, 67418, "Arnaldo Rodrigues", "843.097.111-44");
		ContaPoupanca Leonardo = new ContaPoupanca(11223349, 56498, "Leonardo Amorim", "000.555.124-99");
		Arnaldo.menu(5);
		Leonardo.menu(5);
	}

	

}
