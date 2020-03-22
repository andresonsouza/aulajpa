package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Andreson", "andresonjazz@gmail.com");
		Pessoa p2 = new Pessoa(1, "Loide", "loideangelim@gmail.com");
		Pessoa p3 = new Pessoa(1, "Vagdon", "vagdon@gmail.com");
		System.out.print(p1);
		System.out.print(p2);
		System.out.print(p3);
	}

}
