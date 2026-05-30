public class MenuItem {
    private int itemId;
    private String itemName;
    private double price;

    public MenuItem(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItem() {
        System.out.println(itemName + " - $" + price);
    }
}