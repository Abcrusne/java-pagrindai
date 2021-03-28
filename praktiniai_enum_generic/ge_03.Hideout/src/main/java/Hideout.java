import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {

	private T t;
	List<T> list = new ArrayList<>();

	public Hideout() {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public List<T> getList() {
		return list;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public void putIntoHideout(T toHide) {
		list.remove(toHide);
		list.add(toHide);
	}

	public T takeFromHideout() {
		if (!list.isEmpty()) {
			T took = list.get(list.size() - 1);
			for (T elements : list) {
				T taken = elements;
////				if (list.contains(elements))
				list.remove(taken);
				return took;
			}
		}
		return null;
	}

	public boolean isInHideout() {
		for (T elements : list) {
			if (list.contains(elements))
				return true;
		}
		return false;

	}
}
