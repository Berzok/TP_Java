import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Remote extends JFrame implements ActionListener {
	
	private HashSet<JButton> boutons;
	private UneFenetre leParent;
	private int[] vecteurs = {-1, 1}; 
		private static final long serialVersionUID = 1L;
	    private final int LARG=400, HAUT=300;
	    private JButton creation = new JButton("Ajouter");
	    private JButton za_warudo = new JButton("Pause");
	    private JButton bouton2 = new JButton("Pause");
	    private JButton bouton3 = new JButton("Pause");
	    private Thread leTh;
	    private Thread leTh2;
	    
	    public Remote(UneFenetre mama, int leNombre){
	    	
	    	leParent = mama;
	    	// TODO 
	    	// ajouter sonMobile a la fenetre
	    	// creer une thread laThread avec sonMobile
	    	// afficher la fenetre
	    	// lancer laThread
	    	
	    	
	    	this.setSize(300, 175);
	    	this.setTitle("Remote");
	    	this.setPreferredSize(getSize());
	    	this.setForeground(Color.BLACK);
	    	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    	this.setLayout(new GridLayout(3, 4));
	    	
	    	
	    	creation.addActionListener(this);
	    	creation.setVisible(true);
	    	this.add(creation);
	    	
	    	za_warudo.addActionListener(this);
	    	za_warudo.setVisible(true);
	    	this.add(za_warudo);
	    }
	    
	    
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource().equals(this.creation)){
				UnMobile leMobile = new UnMobile(400, 300, alea(0, 1), alea(0, 1), alea(0, 400));
		    	leMobile.setVisible(true);
		    	leMobile.setBackground(new Color(0, 0, 0, 100));
		    	leMobile.setSize(getMaximumSize());
		    	leParent.add(leMobile);
		    	new Thread(leMobile).start();
				}
				else{
					if(za_warudo.getText() == "Pause"){
						leTh.suspend();
						leTh2.suspend();
						}
					else{
						leTh.resume();
						leTh2.resume();
						za_warudo.setText("Play");
						}
					}
				}
	
		private int alea(int b, int a){
			return new Random().nextInt((a - b) + 1) -b;
			}
	}
