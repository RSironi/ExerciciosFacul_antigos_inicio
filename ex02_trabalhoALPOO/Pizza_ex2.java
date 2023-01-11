package ex02_trabalhoALPOO;

public class Pizza_ex2 {
	private String tipoPizza;
	private Double valorPizza;
	private String tipoBorda;
	private Double valorBorda=0.00;
	private Double valorTotal;
	
	
	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Pizza_ex2(String tipopizza, double valorpizza, String tipoborda, double valorborda) {
		this.tipoPizza= tipopizza;
		this.valorPizza=valorpizza;
		this.tipoBorda=tipoborda;
		this.valorBorda=valorborda;
	}

	public Double getValorPizza() {
		return valorPizza;
	}

	public void setValorPizza(Double valorPizza) {
		this.valorPizza = valorPizza;
	}

	public String getTipoPizza() {
		return tipoPizza;
	}

	public void setTipoPizza(String tipoPizza) {
		this.tipoPizza = tipoPizza;
	}

	public String getTipoBorda() {
		return tipoBorda;
	}

	public void setTipoBorda(String tipoBorda) {
		this.tipoBorda = tipoBorda;
	}

	public Double getValorBorda() {
		return valorBorda;
	}

	public void setValorBorda(Double valorBorda) {
		this.valorBorda = valorBorda;
	}
	
	@Override
	public String toString() {
		String strPIZZA;
		
		valorTotal=valorPizza+valorBorda;
		
		if(valorBorda!=0.00) {
		strPIZZA=("Pizza - "+getTipoPizza()+" R$ " +getValorPizza()+" | Borda. extra - "+getTipoBorda()+" | Subtotal: R$"+valorTotal);
		}else {
		strPIZZA=("Pizza - "+getTipoPizza()+" R$ " +getValorPizza()+" | Subtotal: R$"+valorTotal);
		}
		return strPIZZA;
	}
}
