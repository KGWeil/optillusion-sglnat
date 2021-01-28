
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermanngitter1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter1 extends PApplet
{       
    //globale Variablen
    int s=50; //Seitenlaenge Quadrate
    int a=60; //Abstand Quadrate
    
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    public void quadrate(){
        fill(0); //schwarze Fuellfarbe
        for (int i=0;i<=6;i++){ //7-mal in x-Richtung
            for (int k=0;k<=6;k++){ //7-mal in y-Richtung
                square(40+i*a,40+k*a,s);
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
        background(255); //weisser Hintergrund
        quadrate();
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
        PApplet.main(new String[] {Hermanngitter1.class.getName() });
    }

}
