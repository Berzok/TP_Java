import java.awt.*;
import java.util.Random;

import javax.swing.*;

class UnMobile extends JPanel implements Runnable
{
    int saLargeur, saHauteur;
    int laHauteur;
    int posX;
    int sonPas = 10;
	int sonTemps= 20;
	final int sonCote=40;
    int xVel;
    int yVel;
    GradientPaint couleur;
    
    UnMobile(int telleLargeur, int telleHauteur)
	    {
		super();
		saLargeur = telleLargeur;
		laHauteur = telleHauteur;
		saHauteur = 40;
		posX = 0;
		xVel = 1;
		yVel = -1;
		setSize(telleHauteur, telleLargeur-40);
		this.setBackground(new Color(0, 0, 0, 0));
		//couleur = new GradientPaint(posX, saHauteur, Color.RED, 175, 175, Color.BLUE, true);
		this.setForeground(new Color(new Random().nextInt((255 - 0) + 1), new Random().nextInt((255 - 0) + 1), new Random().nextInt((255 - 0) + 1)));
	    }
    
    UnMobile(int telleLargeur, int telleHauteur, int x, int y, int positionX)
    	{
    	super();
    	saLargeur = telleLargeur;
    	laHauteur = telleHauteur;
    	saHauteur = 40;
    	xVel = x;
    	yVel = y;
    	posX = positionX;
    	setSize(telleHauteur, telleLargeur-40);
    	this.setBackground(new Color(0, 0, 0, 0));
	//	couleur = new GradientPaint(posX, saHauteur, Color.RED, 175, 175, Color.BLUE, true);
    	this.setForeground(new Color(new Random().nextInt((255 - 0) + 1), new Random().nextInt((255 - 0) + 1), new Random().nextInt((255 - 0) + 1)));
    	}
    
    public void deplacer(){
    	switch(xVel){
    	case 1:
    		switch(yVel){
    		case 1: 
    				sud_Est();
					break;
    		case 0: est();
    				System.out.println("Est");
					break;
    		case -1: nord_Est();
    				System.out.println("Nord-Est");
    				break;
    		}
    	case 0:
    		switch(yVel){
    		case 1: System.out.println("Sud");
    				sud();
    				break;
    		case 0: break;
    		case -1: nord();
    				System.out.println("Nord");
    				break;
    		}
    	case -1:
    		switch(yVel){
    		case 1: sud_Ouest();
    				System.out.println("Sud-Ouest");
    				break;
    		case 0: ouest();
    				System.out.println("Ouest");
    				break;
    		case -1: nord_Est();
    				System.out.println("Nord-Est");
    				break;
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
			if(saHauteur < 40){
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
				nord_Ouest();
				break;
			}
			if(saHauteur < sonPas){
				yVel = 1;
				sud_Est();
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
			try{
				Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
				{telleExcp.printStackTrace();}
			posX += sonPas;
			saHauteur += sonPas;
			if(posX > saLargeur){
				xVel = -1;
				
				sud_Ouest();
				break;
			}
			if(saHauteur > laHauteur-(sonCote*2+25)){
				yVel = -1;
				nord_Est();
				break;
			}
		}
    	return;
    }
    public void sud(){
    	while(true){
			return;
			}
		}
    	//return;
    
    
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
			if(saHauteur > laHauteur-(sonCote*2+25)){
				yVel =-1;
				nord_Ouest();
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
			repaint();
			try{Thread.sleep(sonTemps);}
			catch (InterruptedException telleExcp)
			{telleExcp.printStackTrace();}
			posX -= sonPas;
			saHauteur -= sonPas;
			if(posX < sonCote){
				xVel = 1;
				nord_Est();
				break;
			}
			if(saHauteur < sonPas){
				yVel = 1;
				sud_Ouest();
				return;
			}
		}
    	return;
    }
    

    public void paintComponent(Graphics telCG)
    	{
    	super.paintComponent(telCG);
    	telCG.fillRect(posX, saHauteur, sonCote, sonCote);
    	this.setForeground(new Color(new Random().nextInt((255 - 0) + 1), new Random().nextInt((255 - 0) + 1), new Random().nextInt((255 - 0) + 1)));
    	}
    
    private void say(String car){
    	System.out.println(car);
    }
    
    private void infosCoord(){
    	System.out.println("[X]: " + posX);
		System.out.println("[Y]: "  + saHauteur);
		System.out.println("");
		System.out.println("Côté: " + sonCote);
		System.out.println("\n");
    }
    
    
}