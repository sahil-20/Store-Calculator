package Price;

public class price {
	final int item_size;
	int current_position = 0;
	items Item[];
	int max_pos = 0;

	public price(int size) {
		this.item_size = size;
		Item = new items[this.item_size];
	}
	public price()
	{
		this.item_size = 1;
		Item = new items[this.item_size];
	}

	public int getItemSize() {
		return this.item_size;
	}

	public void setItem(String name, int price, int position) {
		if (position >= this.item_size) {
			System.out.println("Maximum Items Inserted, cannot insert more items");
			System.out.println("Current Postion: " + current_position + "\t Max Position: " + max_pos);
		} else {
			if (Item[position] == null) {
				Item[position] = new items(name, price);
				Item[position].setPosition(position);
				current_position++;
			} else {
				Item[position].setName(name);
				Item[position].setPrice(price);
				Item[position].setPosition(position);
				System.out.println("Item Name: " + Item[position].getName() + "\t Item Price: "
						+ Item[position].getPrice() + "\t Item Position: " + position);
				if (position == current_position) {
					current_position++;
				}
			}

			if (position > this.max_pos) {
				this.max_pos = position;
			} else if (max_pos < current_position) {
				max_pos = current_position;
			}

		}
	}

	public void setItem(String name, int price) {
		if (current_position >= this.item_size) {
			System.out.println("Maximum Items Inserted, cannot insert more items");
			System.out.println("Current Postion: " + current_position + "\t Max Position: " + max_pos);
		} else {
			if (Item[current_position] == null) {
				Item[current_position] = new items(name, price);
				Item[current_position].setPosition(current_position);
				current_position++;
			} else {
				Item[current_position].setName(name);
				Item[current_position].setPrice(price);
				Item[current_position].setPosition(current_position);
				System.out.println("Item Name: " + Item[current_position].getName() + "\t Item Price: "
						+ Item[current_position].getPrice() + "\t Item Position: " + current_position);
				current_position++;
			}

			if (max_pos < current_position) {
				max_pos = current_position;
			}

		}
	}

	public void setStock(int position, int stock)
	{
		Item[position].setInStock(stock);
	}

	public int getStock(int position)
	{
		return Item[position].getInStock();
	}

	public void setPrice(int price, int position)
	{
		Item[position].setPrice(price);
	}

	public int getPrice(int position)
	{
		return Item[position].getPrice();
	}

	public int searchItem(String find) {
		int i;
		System.out.println("Searching...");
		for (i = 0; i < Item.length; i++) {
			if (i > max_pos) {
				return -1;
			}

			if (Item[i].getName() == find) {
				return i;
			}
		}
		return -1;
	}

	public void getItemInfo(int position) {
		if(position >= this.item_size || position > this.max_pos || Item[position] == null)
		{
			System.out.println("No Item at Position " + position);
			return;
		}
		System.out.print("\n*******************************************************\n\n");
		System.out.println("Item Position : " + position);
		System.out.println("Item Name     : " + Item[position].getName());
		System.out.println("Item Price    : " + Item[position].getPrice());
		System.out.println("Item In Stock : " + Item[position].getInStock());
		System.out.print("\n*******************************************************\n");
	}

	public void getAllItemInfo() {
		System.out.println("\n******************************************************");
		for (int i = 0; i < Item.length; i++) {
			if (Item[i] == null) {
				continue;
			}
			if (i > max_pos) {
				break;
			}
			System.out.println("Item Position  : " + Item[i].position);
			System.out.println("Item Name      : " + Item[i].getName());
			System.out.println("Item Price     : " + Item[i].getPrice());
			System.out.println("Item In Stock  : " + Item[i].getInStock() + "\n");
		}
		System.out.println("\n******************************************************\n");
	}
}
