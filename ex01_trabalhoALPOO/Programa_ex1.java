package ex01_trabalhoALPOO;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Programa_ex1{
	
	
public static void main(String[] args) {
	
	Dados_ex1 dados = new Dados_ex1();
	Tela_ex1 t1= new Tela_ex1();
	
	double total = 0;
	double tempSoma = 0;
	DecimalFormat formatador= new DecimalFormat("#.##");
	formatador.setRoundingMode(RoundingMode.HALF_DOWN);
	
	
     for(int i=0;i<dados.listaProduto.size();i++) {
		dados.listaProduto.get(i).setIdProduto(i);
		t1.chkBox.add(i, new JCheckBox(dados.listaProduto.get(i).getNomeProduto()));
		t1.lbl.add(i, new JLabel("R$ "+ dados.listaProduto.get(i).getValorProduto()));
		
		t1.txt.add(i, new JTextField());
		t1.txt.get(i).setDocument(new ApenasNum_ex1());
		t1.painelTabela.add(t1.chkBox.get(i));
		t1.painelTabela.add(t1.lbl.get(i));
		t1.painelTabela.add(t1.txt.get(i));
	}
	t1.setVisible(true);
	
	while(true) {
		for(int ii=0;ii<dados.listaProduto.size();ii++) {
			if(t1.chkBox.get(ii).isSelected()) {
				if(t1.txt.get(ii).getText()!=null && !t1.txt.get(ii).getText().isEmpty()){
					try {
				tempSoma = dados.listaProduto.get(ii).getValorProduto() * Double.parseDouble(t1.txt.get(ii).getText());
					}catch (NumberFormatException e) {
						tempSoma=0;
					}
					total+=tempSoma;
					tempSoma=0;
				}
			}
			else {
				
			}
		}
		t1.lblTotal.setText("TOTAL: R$ "+ formatador.format(total));
		total=0;
	}
}
}
