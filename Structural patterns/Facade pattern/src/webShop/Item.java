package webShop;

public class Item {
	
	private String itemName;
	private int itemID;
	private String itemCategory;
	private float itemPrice;
	// simplified scenario -> enter an itemCategory
	
	public Item(String itemName, String itemCategory) {
		this.itemName = itemName;
		this.itemCategory = itemCategory;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemCategory() {
		return itemCategory;
	}
	

}
