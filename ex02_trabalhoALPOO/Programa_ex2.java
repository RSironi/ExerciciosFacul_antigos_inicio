package ex02_trabalhoALPOO;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Programa_ex2 extends JFrame{
	
	List<Pizza_ex2> listaPedidos = new ArrayList<Pizza_ex2>();
	
	JPanel PanelSaborPizza = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel PanelPepperoni = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel PanelMussarela = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel PanelSupreme = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel PanelExtras = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel PanelExtras2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel PanellblPreco = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	
	JPanel BoxContainer = new JPanel();
	
	JTextArea txtPedido = new JTextArea("Pedido: ");
	JButton BtnPedido = new JButton("Finalizar Pedido!");
	JButton BtnAdicionar = new JButton("Adicionar");
	
	//Sabor da Pizza
	JRadioButton spPepperoni, spMussarela, spSupreme;
	ButtonGroup bgSp;
	//$ Individual
	JRadioButton $Pepperoni, $Mussarela, $Supreme;
	ButtonGroup bgPepperoni;
	//$$ Regular
	JRadioButton $$Pepperoni, $$Mussarela, $$Supreme;
	ButtonGroup bgMussarela;
	//$$$ Família
	JRadioButton $$$Pepperoni, $$$Mussarela, $$$Supreme;
	ButtonGroup bgSupreme;
	
	JRadioButton bBacon, bTomate, bCebola, bCatupiry, bChampignon, bPresunto;
	ButtonGroup bgExtras;
	
	String strPizzaSelecionada;
	String strBordaSelecionada;
	double valorBorda;
	double valorPizza;
	
	public Programa_ex2() {
		
		this.setTitle("UNIPizza!");
		this.setSize(500,800);
		this.setResizable(false);
		this.setLayout(new BorderLayout(4,1));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		BoxContainer.setLayout(new BoxLayout(BoxContainer,BoxLayout.Y_AXIS));
		
		//Sabor da Pizza
		spPepperoni= new JRadioButton("Pepperoni");
		spPepperoni.setActionCommand("Pepperoni");
		
		spMussarela= new JRadioButton("Mussarela");
		spMussarela.setActionCommand("Mussarela");
		
		spSupreme= new JRadioButton("Supreme");
		spSupreme.setActionCommand("Supreme");
		bgSp= new ButtonGroup();
		bgSp.add(spPepperoni);
		bgSp.add(spMussarela);
		bgSp.add(spSupreme);
		TitledBorder tbSaborPizza = BorderFactory.createTitledBorder("Sabor da Pizza");
		PanelSaborPizza.setBorder(tbSaborPizza);
		
		//Pepperoni Preço
		$Pepperoni = new JRadioButton("R$ 15,00");
		$Pepperoni.setActionCommand("15.00");
		
		$$Pepperoni = new JRadioButton("R$ 27,00");
		$$Pepperoni.setActionCommand("27.00");
		
		$$$Pepperoni = new JRadioButton("R$ 33,00");
		$$$Pepperoni.setActionCommand("33.00");
		
		bgPepperoni= new ButtonGroup();
		bgPepperoni.add($Pepperoni);
		bgPepperoni.add($$Pepperoni);
		bgPepperoni.add($$$Pepperoni);
		TitledBorder tbPepperoni = BorderFactory.createTitledBorder("Pepperoni                          Individual          Regular            Família");
		PanelPepperoni.setBorder(tbPepperoni);
		
		//Mussarela Preço
		$Mussarela = new JRadioButton("R$ 12,00");
		$Mussarela.setActionCommand("12.00");
		
		$$Mussarela = new JRadioButton("R$ 21,60");
		$$Mussarela.setActionCommand("21.60");
		
		$$$Mussarela = new JRadioButton("R$ 26,40");
		$$$Mussarela.setActionCommand("26.40");

		bgMussarela= new ButtonGroup();
		bgMussarela.add($Mussarela);
		bgMussarela.add($$Mussarela);
		bgMussarela.add($$$Mussarela);
		TitledBorder tbMussarela = BorderFactory.createTitledBorder("Mussarela                         Individual          Regular            Família");
		PanelMussarela.setBorder(tbMussarela);
		
		//Supreme Preço
		$Supreme = new JRadioButton("R$ 17,00");
		$Supreme.setActionCommand("17.00");
		
		$$Supreme = new JRadioButton("R$ 30,60");
		$$Supreme.setActionCommand("30.60");
		
		$$$Supreme = new JRadioButton("R$ 37,40");
		$$$Supreme.setActionCommand("37.40");
		
		bgSupreme= new ButtonGroup();
		bgSupreme.add($Supreme);
		bgSupreme.add($$Supreme);
		bgSupreme.add($$$Supreme);
		TitledBorder tbSupreme = BorderFactory.createTitledBorder("Supreme                            Individual          Regular            Família");
		PanelSupreme.setBorder(tbSupreme);
		
		//Extras
		bBacon = new JRadioButton("Bacon R$ 2,00");
		bBacon.setActionCommand("Bacon 2.00");
		
		bTomate = new JRadioButton("Tomate R$ 1,00");
		bTomate.setActionCommand("Tomate 1.00");

		bCebola = new JRadioButton("Cebola R$ 1,50");
		bCebola.setActionCommand("Cebola 1.50");

		bCatupiry = new JRadioButton("Catupiry R$ 3,00");
		bCatupiry.setActionCommand("Catupiry 3.00");

		bChampignon = new JRadioButton("Champignon R$ 2,50");
		bChampignon.setActionCommand("Champignon 2.50");

		bPresunto = new JRadioButton("Presunto R$2,50");
		bPresunto.setActionCommand("Presunto 2.50");
		
		bgExtras= new ButtonGroup();
		bgExtras.add(bBacon);
		bgExtras.add(bTomate);
		bgExtras.add(bCebola);
		bgExtras.add(bCatupiry);
		bgExtras.add(bChampignon);
		bgExtras.add(bPresunto);
		TitledBorder tbExtras = BorderFactory.createTitledBorder("Coberturas Extras");
		PanelExtras.setBorder(tbExtras);
		
		txtPedido.setEditable(false);
		txtPedido.setFont(new Font("Arial", Font.BOLD, 13));
		
		PanelExtras.add(bBacon);
		PanelExtras.add(bTomate);
		PanelExtras.add(bCebola);
		PanelExtras2.add(bCatupiry);
		PanelExtras2.add(bChampignon);
		PanelExtras2.add(bPresunto);
		
		PanelSupreme.add($Supreme);
		PanelSupreme.add($$Supreme);
		PanelSupreme.add($$$Supreme);
		
		PanelPepperoni.add($Pepperoni);
		PanelPepperoni.add($$Pepperoni);
		PanelPepperoni.add($$$Pepperoni);
		
		PanelMussarela.add($Mussarela);
		PanelMussarela.add($$Mussarela);
		PanelMussarela.add($$$Mussarela);
		
		PanelSaborPizza.add(spPepperoni);
		PanelSaborPizza.add(spMussarela);
		PanelSaborPizza.add(spSupreme);
		
		BoxContainer.add(Box.createRigidArea(new Dimension(0,50)));
		BoxContainer.add(PanelSaborPizza);
		BoxContainer.add(PanelPepperoni);
		BoxContainer.add(PanelMussarela);
		BoxContainer.add(PanelSupreme);
		BoxContainer.add(Box.createRigidArea(new Dimension(0,30)));
		BoxContainer.add(PanelExtras);
		BoxContainer.add(PanelExtras2);
		BoxContainer.add(Box.createRigidArea(new Dimension(0,30)));
		BoxContainer.add(BtnAdicionar);
		BoxContainer.add(txtPedido);
		BoxContainer.add(Box.createRigidArea(new Dimension(0,50)));
		this.add(BoxContainer, BorderLayout.CENTER);
		this.add(BtnPedido, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	void Checagem() {
		if(bgSp.isSelected(null)) {
			PanelPepperoni.setVisible(true);
			PanelMussarela.setVisible(true);
			PanelSupreme.setVisible(true);
			PanelPepperoni.setEnabled(true);
			PanelMussarela.setEnabled(true);
			PanelSupreme.setEnabled(true);
		}
		else if(bgSp.getSelection().getActionCommand()=="Pepperoni"){
			PepperoniSelecionado();
			
		}else if(bgSp.getSelection().getActionCommand()=="Mussarela"){
			MussarelaSelecionada();
		}
		else if(bgSp.getSelection().getActionCommand()=="Supreme"){
			SupremeSelecionada();
		}
	}
	
	void PepperoniSelecionado() {
		PanelPepperoni.setVisible(true);
		PanelPepperoni.setEnabled(true);
		PanelMussarela.setVisible(false);
		PanelMussarela.setEnabled(false);
		PanelSupreme.setVisible(false);
		PanelSupreme.setEnabled(false);
		
		bgMussarela.clearSelection();
		bgSupreme.clearSelection();
		
		strPizzaSelecionada = CheckCommandSelecionado(bgSp);
		if(CheckCommandSelecionado(bgPepperoni)!=null) {
		valorPizza= Double.parseDouble(CheckCommandSelecionado(bgPepperoni));
		}
	}
	void MussarelaSelecionada() {
		PanelPepperoni.setVisible(false);
		PanelPepperoni.setEnabled(false);
		PanelMussarela.setVisible(true);
		PanelMussarela.setEnabled(true);
		PanelSupreme.setVisible(false);
		PanelSupreme.setEnabled(false);
		
		bgPepperoni.clearSelection();
		bgSupreme.clearSelection();
		
		strPizzaSelecionada = CheckCommandSelecionado(bgSp);
		if(CheckCommandSelecionado(bgMussarela)!=null) {
			valorPizza=Double.parseDouble(CheckCommandSelecionado(bgMussarela));
		}
		}
	void SupremeSelecionada() {
		PanelPepperoni.setVisible(false);
		PanelPepperoni.setEnabled(false);
		PanelMussarela.setVisible(false);
		PanelMussarela.setEnabled(false);
		PanelSupreme.setVisible(true);
		PanelSupreme.setEnabled(true);
		
		bgPepperoni.clearSelection();
		bgMussarela.clearSelection();
		
		strPizzaSelecionada = CheckCommandSelecionado(bgSp);
		if(CheckCommandSelecionado(bgSupreme)!=null) {
			valorPizza=Double.parseDouble(CheckCommandSelecionado(bgSupreme));
		}
	}
	
	void CheckBorda() {
		if(CheckCommandSelecionado(bgExtras)!=null) {
			strBordaSelecionada = CheckCommandSelecionado(bgExtras).replaceAll("\\d"+".", "");
			valorBorda= Double.parseDouble(CheckCommandSelecionado(bgExtras).replaceAll("[^0-9]", ""));
			valorBorda= valorBorda/100;
			}
	}
	
	String CheckCommandSelecionado(ButtonGroup buttongroup) {
        for (Enumeration<AbstractButton> buttons = buttongroup.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();
			
			if(button.isSelected())
				return button.getActionCommand();
		}
		return null;
	}
	
	void AdicionaPedido(){
		
		if(CheckCommandSelecionado(bgSp)!=null && CheckCommandSelecionado(bgPepperoni)!=null || CheckCommandSelecionado(bgMussarela)!=null || CheckCommandSelecionado(bgSupreme)!=null) {	
		listaPedidos.add(new Pizza_ex2(this.strPizzaSelecionada, this.valorPizza,this.strBordaSelecionada,this.valorBorda));
		txtPedido.setText(txtPedido.getText()+"\n"+listaPedidos.get(listaPedidos.size()-1).toString());
		strBordaSelecionada=null;
		bgExtras.clearSelection();
		strBordaSelecionada=null;
		valorBorda=0.0;
		}
	}
	
	void FinalizaPedido() {
		double totaldospedidos = 0;
		
		if(!listaPedidos.isEmpty()) {
		for(int i=0;i<listaPedidos.size();i++) {
			totaldospedidos+=listaPedidos.get(i).getValorTotal();
		}
		
		JOptionPane.showMessageDialog(BoxContainer, "Pedido Enviado! \nTOTAL: R$"+ totaldospedidos);
		listaPedidos.clear();
		txtPedido.setText("Pedido: ");
	}
	}
	
	public static void main(String[] args) {
		Programa_ex2 t1 = new Programa_ex2();

		t1.BtnAdicionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.CheckBorda();
				t1.AdicionaPedido();
			}
		});
		
		t1.BtnPedido.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.FinalizaPedido();
			}
		});
		
		do{
			t1.Checagem();
			t1.requestFocus();
		}while(true);	
	}
}
