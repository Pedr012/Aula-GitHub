package Estoque;

public class Produto {
	public String name;
	public double preco;
	public int quantidade;
	
	public double valorTotalEstoque () {
		return preco * quantidade;
	}
	
	public void adicionarProduto (int quantidade) {
		this.quantidade = quantidade + quantidade;
	}
	
	public void removerProduto (int quantidade) {
		this.quantidade = quantidade - quantidade;		
	}
	
	public String toString() {
		return name + ", $" + preco + ", " + quantidade + "unidades , Total : $" + valorTotalEstoque();
		
	}
		
}
