import java.util.Comparator;

public class DescricaoComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		if (o1.getDescricao().equals(o2.getDescricao())) {
			return 0; //esse retorno - diz ao java que j� temos um objeto com esse valor, o objeto n�o ser� inserido
		}
		
		if(o1.getDescricao().compareTo(o2.getDescricao()) > 0) {
			return 1; //diz ao java que n�o temos o elemento, podemos adicionar ao conjunto
		}

		return -1;
	}

}
