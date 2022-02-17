package ex01_trabalhoALPOO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Tela_ex1 extends JFrame{
	
	List<JCheckBox> chkBox = new ArrayList<JCheckBox>();
	List<JLabel> lbl = new ArrayList<JLabel>();
	List<JTextField> txt = new ArrayList<JTextField>();
	
	JPanel painelTabela = new JPanel(new GridLayout(lbl.size(),3,0,5));
	
	JPanel painelHUD = new JPanel();
	
	JScrollPane scPanel = new JScrollPane(painelTabela);
	
	JButton btnComprar = new JButton("COMPRAR");
	JLabel lblTotal= new JLabel("TOTAL: R$ ");
	
	JLabel lblProd= new JLabel("Produto"),lblPreco = new JLabel("Valor (kg)"),lblQnt = new JLabel("Quantidade (kg)");
	
	public Tela_ex1() {
		
		this.setTitle("Mercadinho Brabo");
		this.setSize(new Dimension(400,500));
		this.setMinimumSize(new Dimension(330,500));
		this.setMaximumSize(new Dimension(500,900));
		this.setResizable(true);
		this.setLayout(new BorderLayout(4,10));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		painelHUD.setLayout(new BoxLayout(painelHUD, BoxLayout.Y_AXIS));
		scPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scPanel.setViewportBorder(new LineBorder(new Color(0,0,0),2));
		
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(painelTabela, "Pedido Realizado!\n" + lblTotal.getText());
			}
		});
		
		painelHUD.add(lblTotal);
		painelHUD.add(Box.createRigidArea(new Dimension(getWidth()/4,8)));
		painelHUD.add(btnComprar);
		painelTabela.add(lblProd);
		painelTabela.add(lblPreco);
		painelTabela.add(lblQnt);
		
		this.add(painelHUD, BorderLayout.SOUTH);
		this.add(scPanel, BorderLayout.CENTER);
		}


}
