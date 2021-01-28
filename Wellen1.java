
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{       
    //globale Variablen
    int s=40; //Seitenlaenge der Quadrate
    
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(360,300);
    }        

    public void zeichneQuadrat(int x, int y, int farbeQuadrat, boolean links){
        fill(farbeQuadrat,farbeQuadrat,farbeQuadrat);
        rect(x,y,this.s,this.s); //zeichne Rechteck mit s=40
        if (farbeQuadrat==255){ //wenn Quadrat weiss
            fill(0); //dann Kreise schwarz
        }
        else{ //wenn Quadrat schwarz
            fill(225); //dann Kreise weiss
        }
        noStroke();
        if (links) {
            circle(x+6,y+6,10); //links oben
            circle(x+6,y+34,10); //links unten
        }
        else {
            circle(x+34,y+6,10); //rechts oben
            circle(x+34,y+34,10); //rechts unten
        }
    }
    
    public void alleQuadrate(){
        int aktuelleFarbe=0;
        boolean links=true;
        for (int k=0;k<5;k++){
            for (int i=0;i<9;i++){
                zeichneQuadrat(i*this.s,k*this.s,aktuelleFarbe,links);
                if (aktuelleFarbe==0){
                    aktuelleFarbe=255;
                }
                else{
                    aktuelleFarbe=0;
                }
            }
            if(links==true){
                links=false;
            }
            else{
                links=true;
            }
        }
    }
    
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        //for(int i=0; i<5; i++) {
            //boolean kreisLinks = (i%2 == 0) ? true : false;
            //boolean kreisLinks = false;
            //if(i%2 == 0) {
            //    kreisLinks = true;
            //}
            //else {
            //    kreisLinks = false;
            //}
            //zeichneQuadrat(i*this.s,i*this.s,0,kreisLinks);
        //}
        alleQuadrate();
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
