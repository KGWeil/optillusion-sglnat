
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author Natalia 
 */
public class Kaffeehaus extends PApplet
{
    int s = 40; //Seitenlänge Quadrate
    int[] verschiebung = {10, 20, 30, 20, 10, 20, 30, 20, 10, 20}; //Verschiebung der Quadrate in x-Richtung
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    public void parallelen(){
        for (int i=0; i<=9;i++){ //10 Wiederholungen
        line(0,0+i*40,640,0+i*40); //10 waagerechte Linien
        stroke(127,127,127); //graue Färbung
    }
    }
    
    public void zeichneQuadrate(){
        fill(0); //färbe schwarz
            for (int k=0; k<=9;k++){ //Anzahl Quadrate in y-Richtung
            for (int i=0; i<=7;i++){ //Anzahl Quadrate in x-Richtung
                square(verschiebung[k]+s*2*i,k*s,s);
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
        background(255); //Hintergrund weiß
        parallelen(); //Aufruf der Methode
        zeichneQuadrate();
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
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
