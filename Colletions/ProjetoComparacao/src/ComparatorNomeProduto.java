import java.util.Comparator;

public class ComparatorNomeProduto implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {

		if (o1.getNome().equals(o2.getNome())) {
			return 0;
		}

		if (o1.getNome().compareTo(o2.getNome()) > 0) {
			return 1;
		}
		
		return -1;
	}
}
