
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
    int a=6; //Abstand Kreismitte zu Quadratrand
    int r=60; //Abstand Illusion zu Rand
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(480,320);
    }        

    public void zeichneQuadrat(int x, int y, int farbeQuadrat, boolean links){
        fill(farbeQuadrat,farbeQuadrat,farbeQuadrat);
        rect(x,y,this.s,this.s); //zeichne Rechteck mit s=40
        fill(farbwechsel(farbeQuadrat));
        noStroke();
        if (links) {
            circle(x+this.a,y+this.a,8); //links oben
            circle(x+this.a,y+this.s-this.a,8); //links unten
        }
        else {
            circle(x+this.s-this.a,y+this.a,8); //rechts oben
            circle(x+this.s-this.a,y+this.s-this.a,8); //rechts unten
        }
    }
    
    public void alleQuadrate(){
        int aktuelleFarbe=0;
        boolean links=true;
        for (int k=0;k<5;k++){
            for (int i=0;i<9;i++){
                zeichneQuadrat(i*this.s+this.r,k*this.s+this.r,aktuelleFarbe,links);
                aktuelleFarbe=farbwechsel(aktuelleFarbe);
            }
            links = ! links;
        }
    }
    
    public int farbwechsel(int farbe){
        if (farbe==0){
            return 255;
        }
        else{
            return 0;
        }
    }
    
    public void alleTrennlinien(){
        colorMode(RGB,100);
        for (int k=1;k<5;k++){
            stroke(0,100,0);
            line(this.r,k*this.s+this.r,360+this.r,k*this.s+this.r);
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
        alleQuadrate();
        alleTrennlinien();
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
