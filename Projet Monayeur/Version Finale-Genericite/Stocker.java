import java.util.HashMap;
import java.util.Map;

public class Stocker<T extends Stockable> {
	
	private Map<Integer, T> stock = new HashMap<Integer, T>();
	
	public T getItemById(Integer id) {
		return stock.get(id);
	}
	
	public void addItem(T item) {
		stock.put(item.getId(), item);
	}
	
	public void removeItem(Integer id) {
		stock.remove(id);
	}
	public void removeItem(Stockable item) {
		stock.remove(item.getId());
	}

}
