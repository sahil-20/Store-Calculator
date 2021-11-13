package Calculator;

import java.util.Scanner;

public class store_calculator {
    int items[] = new int[100];
    int total_elements=0;
    String temp = "";
    Scanner in = new Scanner(System.in);

    public void setItemsByPrice() {
        int i = 0;
        System.out.println("\nEnter Price of Items");
        while (i != 100) {
            temp = in.nextLine();
            if (temp == "") {
                break;
            }
            items[i] = Integer.parseInt(temp);
            i++;
        }
        this.total_elements = i;
    }

    public void setItemsByPrice(int val) {
        int i = this.total_elements;
        items[i] = Integer.parseInt(temp);
        i++;
        this.total_elements = i;
    }

    public void setMoreItemByPrice() {
        int i = this.total_elements;
        System.out.println("\nEnter Price of Items");
        while (i != 100) {
            temp = in.nextLine();
            if (temp == "") {
                break;
            }
            items[i] = Integer.parseInt(temp);
            i++;
        }
        this.total_elements = i;
    }

    public void getItem() {
        for (int i = 0; i < this.total_elements; i++) {
            System.out.println("Item " + i + " : " + items[i]);
        }
    }

    public int total_price() {
        int sum = 0;
        System.out.print("Item Price: ");
        for (int i = 0; i < this.total_elements; i++) {
            sum += items[i];
            if (i == this.total_elements - 1) {
                System.out.print(items[i]);
            } else
                System.out.print(items[i] + " + ");
        }
        System.out.println();
        return sum;
    }
}
