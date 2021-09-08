
public abstract class Item {
	
	private int posicaoX;
	private int posicaoY;
	
	// esse m�todo n�o faz nada, pois n�o vai ser instanciada
	public abstract void pegar();

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	
}
