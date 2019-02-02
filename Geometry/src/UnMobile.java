import java.awt.*;
import javax.swing.*;

class UnMobile extends JPanel implements Runnable
{
    int saLargeur, saHauteur;
    int laHauteur;
    int posX = 0;
    final int sonPas = 10, sonTemps=50, sonCote=40;
    int xVel = 1;
    int yVel = 1;
    
    UnMobile(int telleLargeur, int telleHauteur)
	    {
		super();
		saLargeur = telleLargeur;
		laHauteur = telleHauteur;
		saHauteur = 40;
		setSize(telleLargeur, laHauteur);
		this.setForeground(Color.CYAN);
	    }
    
    public void deplacer(){
    	switch(xVel){
    	case 1:
    		switch(yVel){
    		case 1: sud_Est();
					return;
    		case 0: est();
					return;
    		case -1: nord_Est();
					 return;
    		}
    	case 0:
    		switch(yVel){
    		case 1: sud();
					return;
    		case 0: return;
    		case -1: nord();
					 return;
    		}
    	case -1:
    		switch(yVel){
    		case 1: sud_Ouest();
    				return;
    		case 0: ouest();
    				return;
    		case -1: nord_Est();
					 return;
    		}
    	}
    }
    
    public void run()
    	{
    	while(true){
    		deplacer();
    		
    		}
    	}
    
    
    public void nord(){
    	while(true){
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			saHauteur -= sonPas;
			if(saHauteur < sonCote){
				yVel = 1;
				break;
			}
		}
    	return;
    }
    
    public void nord_Est(){
    	while(true){
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			posX += sonPas;
			saHauteur -= sonPas;
			if(posX > saLargeur-sonPas){
				xVel = -1;
				break;
			}
			if(saHauteur < sonCote){
				yVel =-1;
				break;
			}
		}
    	return;
    }
    public void est(){
    	while(true){
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			posX += sonPas;
			if(posX > saLargeur-sonPas){
				xVel = 1;
				break;
			}
		}
    	return;
    }
    public void sud_Est(){
    	while(true){
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			posX += sonPas;
			saHauteur += sonPas;
			if(posX > saLargeur-sonPas){
				xVel = -1;
				break;
			}
			if(saHauteur > laHauteur-sonPas){
				yVel =-1;
				break;
			}
		}
    	return;
    }
    public void sud(){
    	while(true){
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			saHauteur += sonPas;
			if(saHauteur > laHauteur-sonPas){
				yVel =-1;
				break;
			}
		}
    	return;
    }
    public void sud_Ouest(){
    	while(true){
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			posX -= sonPas;
			saHauteur += sonPas;
			if(posX < sonPas){
				xVel = 1;
				break;
			}
			if(saHauteur > laHauteur-sonPas){
				yVel =-1;
				break;
			}
		}
    	return;
    }
    public void ouest(){
    	while(true){
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			posX -= sonPas;
			if(posX < sonPas){
				xVel = 1;
				break;
			}
		}
    	return;
    }
    
    public void nord_Ouest(){
    	while(true){
    		System.out.println("[X]: " + posX);
    		System.out.println("[Y]: "  + saHauteur);
    		System.out.println("");
    		System.out.println("Côté: " + sonCote);
    		System.out.println("\n");
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			posX -= sonPas;
			saHauteur -= sonPas;
			if(posX < sonCote){
				System.out.println("ah");
				xVel = 1;
				break;
			}
			if(saHauteur < sonPas){
				yVel = 1;
				return;
			}
		}
    	System.out.println("Sortie de la fonction");
    	return;
    }
    

    public void paintComponent(Graphics telCG)
    {
	super.paintComponent(telCG);
	telCG.fillRect(posX, saHauteur, sonCote, sonCote);
    }
}