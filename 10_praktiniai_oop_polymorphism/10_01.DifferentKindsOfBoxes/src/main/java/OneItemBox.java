
public class OneItemBox extends Box {

	private Item item;

	public OneItemBox() {

	}

	@Override
	public void add(Item item) {
		// TODO Auto-generated method stub
		if (this.item == null) {
			this.item = item;
		}

	}

	@Override
	public boolean isInBox(Item item) {
		return this.item != null && this.item.equals(item);

	}

}
