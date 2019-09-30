// Alan C Huang
    // William Broer
        // CS 1400-02
            // Project 1

package projectproblem4;


public class ProjectProblem4 {

    
  
    public static void main(String[]args){
        
        //Fahrenheit
        System.out.println("Conversions from Celsius to Fahrenheit:");
        
        Temperature CelsiusToFahrenheit=new Temperature(0, 'C');
        
        System.out.println(CelsiusToFahrenheit.toString());
        
        CelsiusToFahrenheit.setDegreesScale(100, 'C');
        
        System.out.println(CelsiusToFahrenheit.toString());
        
        
        // Celsisus
        System.out.println("Conversions from Fahrenheit to Celsius:");
        
        Temperature FahrenheitToCelsius=new Temperature(0, 'F');
        
        System.out.println(FahrenheitToCelsius.toString());
        
        FahrenheitToCelsius.setDegreesScale(100, 'F');
        
        System.out.println(FahrenheitToCelsius.toString());
        
        //Comparing
        System.out.println("Comparing two temperatures:");
        
        Temperature celsius1=new Temperature(10, 'C');
        Temperature celsius2=new Temperature(50, 'C');
        
        if (celsius1.compareTo(celsius2)<0)
            
            System.out.println(celsius1.getCelsius()+" "+celsius1.getScale()+
                    " is less than "+celsius2.getCelsius()+" "+
                    celsius2.getScale());
        
        else if (celsius1.compareTo(celsius2)>0)
            
            System.out.println(celsius1.getCelsius()+" "+celsius1.getScale()+
                    " is greater than "+celsius2.getCelsius()+" "+
                    celsius2.getScale());
        
        else 
            
            System.out.println(celsius1.getCelsius()+" "+celsius1.getScale()+
                    " is equal to "+celsius2.getCelsius()+" "+
                    celsius2.getScale());
        
        System.out.println("Comparing two temperatures:");
        
        Temperature celsius3=new Temperature(80, 'C');
        
        Temperature celsius4=new Temperature(60, 'C');
        
        if (celsius3.compareTo(celsius4)<0)
            
            System.out.println(celsius3.getCelsius()+" "+celsius3.getScale()+
                    " is less than "+celsius4.getCelsius()+" "+
                    celsius4.getScale());
        
        else if (celsius3.compareTo(celsius4)>0)
            
            System.out.println(celsius3.getCelsius()+" "+celsius3.getScale()+
                    " is greater than "+celsius4.getCelsius()+" "+
                    celsius4.getScale());
        
        else 
            
            System.out.println(celsius3.getCelsius()+" "+celsius3.getScale()+
                    " is equal to "+celsius4.getCelsius()+" "+
                    celsius4.getScale());
        
        System.out.println("Comparing two temperatures:");
        
        Temperature celsius5=new Temperature(0, 'C');
        
        Temperature fahrenheit1=new Temperature(32, 'F');
        
        if (celsius5.compareTo(fahrenheit1)<0)
            
            System.out.println(celsius5.getCelsius()+" "+celsius5.getScale()+
                    " is less than "+fahrenheit1.getFahrenheit()+" "+
                    fahrenheit1.getScale());
        
        else if (celsius5.compareTo(fahrenheit1)>0)
            
            System.out.println(celsius5.getCelsius()+" "+celsius5.getScale()+
                    " is greater than "+fahrenheit1.getFahrenheit()+" "+
                    fahrenheit1.getScale());
        
        else 
            
            System.out.println(celsius5.getCelsius()+" "+celsius5.getScale()+
                    " is equal to "+fahrenheit1.getFahrenheit()+" "+
                    fahrenheit1.getScale());

        
        
    }
       
}