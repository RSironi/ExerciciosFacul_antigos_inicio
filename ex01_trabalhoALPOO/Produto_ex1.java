package ex01_trabalhoALPOO;

public class Produto_ex1 {
	private int idProduto;
	private String NomeProduto;
	private double ValorProduto;
	
	
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return NomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return ValorProduto;
	}

	public void setValorProduto(double valorProduto) {
		ValorProduto = valorProduto;
	}
	
	
	public Produto_ex1 ( String nomeproduto, double valorproduto ) {
		this.setNomeProduto(nomeproduto);
		this.setValorProduto(valorproduto);
		}

}
