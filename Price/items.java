package Price;

public class items {
	String name;
	int price;
	int position;
	int stock=0;

	public items(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setInStock(int stock)
	{
		this.stock = stock;
	}

	public int getInStock()
	{
		return this.stock;
	}

	public void setPosition(int position)
	{
		this.position = position;
	}

	public int getPosition()
	{
		return this.position;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
