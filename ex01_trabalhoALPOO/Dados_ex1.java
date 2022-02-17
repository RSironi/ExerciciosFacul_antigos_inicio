package ex01_trabalhoALPOO;

import java.util.ArrayList;
import java.util.List;

public class Dados_ex1 {
	List<Produto_ex1> listaProduto = new ArrayList<Produto_ex1>(); 
	//Facilmente os dados poderiam vir de um BD ou TXT.
	//Já que só precisa adicionar na lista. =D
	
	public Dados_ex1() {
		listaProduto.add(new Produto_ex1("Tomate", 5.57));
		listaProduto.add(new Produto_ex1("Inhame", 12.30));
		listaProduto.add(new Produto_ex1("Cenoura", 5.00));
		listaProduto.add(new Produto_ex1("Banana", 6.23));
		listaProduto.add(new Produto_ex1("Laranja", 3.75));
		listaProduto.add(new Produto_ex1("Abobrinha", 3.00));
		listaProduto.add(new Produto_ex1("Mamão", 12.0));
		listaProduto.add(new Produto_ex1("Limão", 2.75));
		listaProduto.add(new Produto_ex1("Amendoim", 9.70));
		listaProduto.add(new Produto_ex1("Alho", 3.98));
		listaProduto.add(new Produto_ex1("Batata", 5.49));
		listaProduto.add(new Produto_ex1("Alcatra", 30.00));
		listaProduto.add(new Produto_ex1("P. de Frango", 14.90));
		listaProduto.add(new Produto_ex1("Açucar", 2.99));
		listaProduto.add(new Produto_ex1("Mandioca", 4.19));
		listaProduto.add(new Produto_ex1("Picanha", 75.00));
		listaProduto.add(new Produto_ex1("Alface", 10.00));
		listaProduto.add(new Produto_ex1("Queijo", 47.50));
		listaProduto.add(new Produto_ex1("Presunto", 15.00));
		listaProduto.add(new Produto_ex1("Cebola", 3.20));
		}
}
