// Alan C Huang
    // William Broer
        // CS 1400-02
            // Project 1

package projectproblem4;

public class Temperature {
    double degrees;
    char scale;
    
    public Temperature(){
        scale='C';
        degrees=0;
    }
    public Temperature(char scale){
        this.scale=scale;
        degrees=0;
    }
    public Temperature(double degrees){
        this.degrees=degrees;
        scale='C';
    }
    public Temperature(double degrees, char scale){
        this.scale=scale;
        this.degrees=degrees;
    }
    public double getCelsius(){
        if(scale=='C')
            return degrees;
        else
            return ((double)(Math.round(((degrees-32)*5/9)*10))/10);
    }
    public double getFahrenheit(){
        if(scale=='F')
            return degrees;
        else
            return ((double)(Math.round((degrees*9/5)+32)*10)/10);
    }
    public void setDegrees(double degrees){
        this.degrees=degrees;
    }
    public void setScale(char scale){
        this.scale=scale;
    }
    public void setDegreesScale(double degrees, char scale){
        this.scale=scale;
        this.degrees=degrees;
    }
    public int compareTo(Temperature object){
        if (getCelsius()<object.getCelsius())
            return -1;
        else if (getCelsius()>object.getCelsius())
            return 1;
        else
            return 0;
    }
    public double getDegrees(){
        return degrees;
    }
    public char getScale(){
        return scale;
    }
    public String toString(){
        if(getScale()=='C')
            return String.format("%.1f degrees C = %.1f degrees F",
                    getDegrees(), getFahrenheit());
        else
            return String.format("%.1f degrees F = %.1f degrees C",
                    getDegrees(), getCelsius());
    }
}
