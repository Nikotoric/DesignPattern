package webShop;

public class Customer {

	private String name;
	private String surname;

	private String deliveryAddress;
	private String country;
	private int simCardNumer; // only 5 digits for simulation
	private String town;

	public Customer(String name, String surname, String country, String town) {
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.town = town;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public int getSimCardNumer() {
		return simCardNumer;
	}

	public void setSimCardNumer(int simCardNumer) {
		this.simCardNumer = simCardNumer;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getCountry() {
		return country;
	}

	public String getTown() {
		return town;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", deliveryAddress=" + deliveryAddress + ", country="
				+ country + ", town=" + town + "]";
	}

}
