package br.com.generation.produto;

public class Produto {
	private String produto;
	private int codigo;
	private double valor;
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Produto(String produto, int codigo, double valor) {
		super();
		this.produto = produto;
		this.codigo = codigo;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "[produto: " + produto + ", codigo: " + codigo + ", valor: " + valor + "]\n";
	}
	
	
	
	
	
	
	
	
}