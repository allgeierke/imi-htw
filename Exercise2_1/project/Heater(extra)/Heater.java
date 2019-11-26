
/**
 * A class which simulates a heater with its core-function.
 * 
 * @author Dennis Bröcker&Katja Hedemann
 * @version 1.0
 */
public class Heater
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int temperature;
    private int max;
    private int min;
    int increment;

    /**
     * Konstruktor für Objekte der Klasse Heater
     */
    public Heater(int maximum, int minimum)
    {
        // Instanzvariable initialisieren
        temperature = 15;
        max = maximum;
        min = minimum;
        increment = 2;
    }
    
    public void setIncrement(int increment){
        if (increment > 0) {
        this.increment = increment;
        } 
        else {
        System.out.println("Please enter positive number");
        }
    }


    public void warmer()
    {
        if ((temperature + increment)<=max) { 
        temperature +=increment;
        }
        else {
        System.out.println("Temperatur is bigger than maximum");
        }
    }
    
    public void cooler()
    {
       if ((temperature - increment)>=min) { 
       temperature -=increment;
       }
       else {
       System.out.println("Temperatur is under the minimum");
       }
    }
    
    public int getTemperature()
    {
        return temperature;
    }
   
}
