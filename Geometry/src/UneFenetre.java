import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class UneFenetre extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UnMobile sonMobile, autreMobile;
    private final int LARG=400, HAUT=300;
    private JButton bouton = new JButton("Pause");
    private Thread leTh;
    private Thread leTh2;
    private JPanel lePanel = new JPanel(new GridLayout(1, 3));
    private JPanel sousPanel1 = new JPanel();
    private JPanel sousPanel2 = new JPanel();
    private JPanel sousPanel3 = new JPanel();
    private JFrame commande;
    
    public UneFenetre(){
    	// TODO 
    	// ajouter sonMobile a la fenetre
    	// creer une thread laThread avec sonMobile
    	// afficher la fenetre
    	// lancer laThread
    	
    	
    	this.setSize(465, HAUT);
    	this.setTitle("Typical DVD Screen");
    	this.setPreferredSize(getSize());
    	this.setForeground(Color.CYAN);
    	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	
    	commande = new Remote(this, 2);
    	commande.setVisible(true);
    	commande.pack();
    	
    	this.add(lePanel);
    	lePanel.add(sousPanel1);
    	lePanel.add(sousPanel2);
    	lePanel.add(sousPanel3);
    	sousPanel1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
    	sousPanel3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
    	sousPanel2.setBorder(BorderFactory.createLineBorder(Color.RED));
    	
    	
    	bouton.addActionListener(this);
    	bouton.setVisible(true);
    	
    	
    	
    	sonMobile = new UnMobile(LARG, HAUT);
    	sonMobile.setVisible(true);
    	sonMobile.setSize(getMaximumSize());
    	this.add(sonMobile);
    	
    	autreMobile = new UnMobile(LARG, HAUT, 1, 1, 450);
    	autreMobile.setVisible(true);
    	autreMobile.setBackground(new Color(0, 0, 0, 100));
    	autreMobile.setSize(getMaximumSize());
    	this.add(autreMobile);
    	
    	
    	
    	leTh = new Thread(sonMobile);
    	leTh.start();
    	
    	
    	
    	leTh2 = new Thread(autreMobile);
    	leTh2.start();
    	
    	
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(this.bouton)){
			if(bouton.getText() == "Play"){
				leTh.resume();
				leTh2.resume();
				bouton.setText("Pause");
			}
			else{
				leTh.suspend();
				leTh2.suspend();
				bouton.setText("Play");
				}
			}
		}
	}
