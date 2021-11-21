import java.util.Comparator;

public class ComparatorProdutoId implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {

//		if (o1.getId() == o2.getId()) {
//			return 0;
//		}
//
//		if (o1.getId() > o2.getId()) {
//			return 1;
//		}
//		
//		return -1;
		return o1.getId() - o2.getId();
	}
}
