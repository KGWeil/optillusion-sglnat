    
    import processing.core.PApplet;
    
    /**
     * Klasse figurC_mitSchleife.
     * Beschreibung: Die FigurC aus der vorherigen Aufgabe soll mit einer Zählschleife implementiert werden.
     *
     * @author Simon Gebert 
     * @version Feb2020
     */
    public class FigurC_mitSchleife extends PApplet
    {       
        /**
         * settings() Methode 
         * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
         */
        @Override
        public void settings()
        {
            size(800,800); // Festlegen der Fenstergröße
        }        
    
    public void zeichneBildC() {
            // ***** hier kommen deine Anweisungen hin ************
            square(0,0,200);
            for (int i=0; i<=2;i++) {
            circle(100,100,150-i*50);
            // ***** Ende der eigenen Anweisungen **********
        }
    }

    public void zeichneBildC2() {
        circle(635,635,150);
        for (int i=0; i<=2;i++)  {
            square (600+i*15,600+i*15,70-i*30);
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
        zeichneBildC(); // Aufruf deiner Methode
        zeichneBildC2();
    }


    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {FigurC_mitSchleife.class.getName() });
    }

}
