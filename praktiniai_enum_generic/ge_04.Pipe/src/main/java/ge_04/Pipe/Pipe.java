package ge_04.Pipe;

import java.util.ArrayDeque;
import java.util.Queue;

public class Pipe<T> {

	private T t;

//	List<T> list = new ArrayList<>();
	Queue<T> q = new ArrayDeque<>();

	public Pipe() {

	}

	public void putIntoPipe(T value) {
//		q.add(value);
		q.offer(value);

	}

	public T takeFromPipe() {
		if (!q.isEmpty()) {
//			for (T elements : q) {
//				T taken = elements;
			return q.poll();
			/* return taken; */
		}

//		}
		return null;

	}

	public boolean isInPipe() {
		for (T elements : q) {
			if (q.contains(elements))
				return true;
		}
		return false;
	}

}
