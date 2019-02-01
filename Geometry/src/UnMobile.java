import java.awt.*;
import javax.swing.*;

class UnMobile extends JPanel implements Runnable
{
    int saLargeur, saHauteur;
    int laHauteur;
    int sonDebDessin = 0;
    final int sonPas = 10, sonTemps=50, sonCote=40;
    int xVel = 1;
    int yVel = 1;
    
    UnMobile(int telleLargeur, int telleHauteur)
    {
	super();
	saLargeur = telleLargeur;
	laHauteur = telleHauteur;
	saHauteur = laHauteur/2;
	setSize(telleLargeur, laHauteur);
    }
    
    public void deplacer(){
    	switch(xVel){
    	case 1:
    		switch(yVel){
    		case 1: sud_Est();
    		case 0: est();
    		case -1: nord_Ouest();
    		}
    	case 0:
    		switch(yVel){
    		case 1: sud();
    		case 0: ;
    		case -1: nord();
    		}
    	}
    }
    
    public void run()
    	{
    	while(true){
    		switch(xVel){
    		case 1:
    			switch(yVel){
    				case 1:
    					for(; sonDebDessin < saLargeur - sonPas || saHauteur < laHauteur-sonPas; sonDebDessin += sonPas, saHauteur += sonPas)
    						{
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					if(sonDebDessin>saLargeur-sonPas)
    						xVel = -1;
    					else
    						yVel = -1;
    					break;
    				case 0:
    					for(; sonDebDessin < saLargeur - sonPas; sonDebDessin += sonPas)
    						{
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					xVel = -1;
    					break;
    				case -1:
    					for(; sonDebDessin > saLargeur - sonPas || saHauteur > laHauteur; sonDebDessin += sonPas, saHauteur -= sonPas){
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					yVel = 1;
    					break;
    				}
    		
    		case 0:
    			switch(yVel){
    				case 1:
    					for(; saHauteur < laHauteur; saHauteur += sonPas)
    						{
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					yVel = -1;
    					break;
    				case 0:
    					for(; sonDebDessin < saLargeur - sonPas; sonDebDessin += sonPas)
    						{
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					xVel = -1;
    					break;
    				case -1:
    					for(; saHauteur > 0; saHauteur -= sonPas){
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					yVel = 1;
    					break;
    				}
    		
    		case -1:
    			switch(yVel){
    				case 1:
    					for(; sonDebDessin > 0 + sonPas || saHauteur < laHauteur - saHauteur; sonDebDessin -= sonPas, saHauteur += sonPas)
    						{
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					yVel = -1;
    					break;
    				case 0:
    					for(; sonDebDessin > 0; sonDebDessin -= sonPas)
    						{
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					xVel = 1;
    					break;
    				case -1:
    					for(; sonDebDessin > 0 || saHauteur > laHauteur; sonDebDessin -= sonPas, saHauteur -= sonPas){
    						repaint();
    						try{Thread.sleep(sonTemps);}
    						catch (InterruptedException telleExcp)
    							{telleExcp.printStackTrace();}
    						}
    					yVel = 1;
    					break;
    				}
    		
    		default:
    			break;
    		}
    		}
    	}
    
    
    public void nord(){
    	
    }
    public void nord_Est(){
    }
    public void est(){
    }
    public void sud_Est(){
    }
    public void sud(){
    }
    public void sud_Ouest(){
    }
    public void ouest(){
    }
    public void nord_Ouest(){
    }
    

    public void paintComponent(Graphics telCG)
    {
	super.paintComponent(telCG);
	telCG.fillRect(sonDebDessin, saHauteur/2, sonCote, sonCote);
    }
}