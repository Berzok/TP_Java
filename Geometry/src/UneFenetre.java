import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class UneFenetre extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UnMobile sonMobile;
    private final int LARG=400, HAUT=300;
    private JButton bouton = new JButton("Pause");
    private Thread leTh;
    
    public UneFenetre(){
    	// TODO 
    	// ajouter sonMobile a la fenetre
    	// creer une thread laThread avec sonMobile
    	// afficher la fenetre
    	// lancer laThread
    	
    	
    	this.setSize(465, HAUT);
    	this.setTitle("Typical DVD Screen");
    	this.setPreferredSize(getSize());
    	
    	bouton.addActionListener(this);
    	bouton.setVisible(true);
    	this.add(bouton, BorderLayout.SOUTH);
    	
    	
    	sonMobile = new UnMobile(LARG, HAUT);
    	this.add(sonMobile);
    	
    	leTh = new Thread(sonMobile);
    	leTh.start();
    	
    	
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(this.bouton)){
			if(bouton.getText() == "Play"){
				leTh.resume();
				bouton.setText("Pause");
			}
			else{
				leTh.suspend();
				bouton.setText("Play");
				}
			}
		}
	}
