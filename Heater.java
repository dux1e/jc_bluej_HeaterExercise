
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // Instance variables
    private double temperature;
    private double max;
    private double min;
    private double increment;
    
    // Constructor
    public Heater(double min, double max) {
        this.min = min;
        this.max = max;
        increment = 5.0;
        temperature = 15.0;
    }
    
    // Mutator methods
    public void warmer() {
        if(temperature + increment > max) {
            System.out.println("Temperature can't be more than maximum");
        } else {
            temperature += increment;
        }
    }
    
    public void cooler() {
        if(temperature - increment < min) {
            System.out.println("Temperature can't be less than minimum");
        } else {
            temperature -= increment;
        }        
    }
    
    public void setIncrement(double newIncrement) {
        if(newIncrement >= 0) {
           increment = newIncrement; 
        } else {
            System.out.println("Please enter a positiver number");
        }
    }
    
    // Accessor methods
    public double getTemperature() {
        return temperature;
    }
    
    public double getIncrement() {
        return increment;
    }

}
