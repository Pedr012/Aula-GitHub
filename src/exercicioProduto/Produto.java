package exercicioProduto;

public class Produto {
	private String name;
	private Double price;
	
	public Produto (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName (String name) {
		return this.name;
	}
	
	public double getPrice(double price) {
		return this.price;
	}
	
	public void setName () {
		this.name = name;
	}
	
	public void setPrice() {
		this.price = price;
	}
}
