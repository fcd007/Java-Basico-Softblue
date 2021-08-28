package br.dev.code;

import br.dev.entities2.Carro;
import br.dev.entities2.Moto;

public class Aplicacao {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		moto.acelerar();
		moto.frear();
	}
}
