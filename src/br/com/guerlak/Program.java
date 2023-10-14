package br.com.guerlak;

public class Program {

	public static void main(String[] args) {
		String name = args[0];
		String mode = args[1];

		if (mode.equals("DEV")) {
			System.out.println("Olá, " + name + " você estã em modo de desenvolvimento.");
		} else if (mode.equals("PROD")) {
			System.out.println("Olá, " + name + " você está em modo de produção.");
		} else {
			System.out.println("Olá, " + name + " seja bem vindo.");
		}
	}
}
