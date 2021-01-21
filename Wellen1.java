
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

    public void zeichneQuadrat(int x, int y, int farbe, boolean links){
        fill(farbe,farbe,farbe);
        rect(x,y,s,s);
    }
    
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        zeichneQuadrat(0,0,255,true);
        zeichneQuadrat(100,100,200,true);
        zeichneQuadrat(200,200,20,true);
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
