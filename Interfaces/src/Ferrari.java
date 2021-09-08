
public class Ferrari implements Carro, ItemCaro{

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}

	@Override
	public void buzina() {
		System.out.println("Ferarri buzinou");
		
	}

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou direita");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abriu a porta");
		
	}

	@Override
	public double getPreco() {
		return 1000000;
	}
	
}
