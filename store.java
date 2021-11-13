// import java.util.Scanner;
import Price.*;
import Calculator.*;
class store {
	public static void main(String args[]) 
	{
		// String item_name;
		// int price, position;
		unit_test();
	}

	static void operations()
	{

	}

	static void unit_test()
	{
		// price p = new price(10);
		price p = new price(10);
		// System.out.println("Item Size: " + p.getItemSize());
		// p.setItem("Item1", 100);
		// p.setItem("Item2", 900);
		// p.setItem("Item3", 200);
		// p.setItem("Item4", 800);
		// p.setItem("Item5", 400);
		// p.setItem("Item6", 4010);
		// p.setItem("Item7", 4002);
		// p.setItem("Item8", 4010);
		// p.setItem("Item9", 40);
		// p.setItem("Item10", 5010);
		p.setItem("Item1", 100, 0);
		p.setItem("Item2", 100, 1);
		p.setItem("Item3", 100, 2);
		p.setItem("Item4", 100, 4);
		p.setItem("Item5", 100, 6);
		p.setItem("Item6", 100, 8);
		
		p.setStock(0, 100);
		p.setStock(1, 40);
		p.setStock(2, 10);
		p.setStock(4, 69);
		// p.getAllItemInfo();
		System.out.println();
		// p.setItem("Item7", 100, 9);
		// p.getItemInfo(0);
		// p.getItemInfo(1);
		// p.getItemInfo(2);
		// p.getItemInfo(3);
		// p.getItemInfo(4);
		// p.getItemInfo(5);
		// p.getItemInfo(6);
		// p.getItemInfo(7);
		// p.getItemInfo(8);
		// p.getItemInfo(9);
		// p.getItemInfo(90);

		store_calculator sc = new store_calculator();
		sc.setItemsByPrice();
		// sc.setMoreItemByPrice();
		// sc.setItemByName();
		// String temp = "";
		// int pr;
		// int item;
		// Scanner in = new Scanner(System.in);
		// while((temp = in.nextLine()) != "")
		// {
		// 	if((item = p.searchItem(temp)) >= 0)
		// 	{
		// 		pr = p.getPrice(item);
		// 		sc.setItemsByPrice(pr);
		// 		System.out.println("Item Name: " + temp + "\t Item Price: " + pr);
		// 	}
		// }
		// in.close();
		
		sc.getItem();
		System.out.println("Total Price: " + sc.total_price());
		// System.out.println("Search : " + p.searchItem("Item1"));
	}
}

