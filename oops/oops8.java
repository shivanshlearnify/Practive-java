package oops;

class TrafficLight{
    String color;
    int duration;

    public TrafficLight(String color, int duration){
        this.color=color;
        this.duration=duration;
    }
    public void changeColor(String newColor){
        color = newColor;
        System.out.println("colour has been changed to "+newColor);
    }
    public boolean isRed(){
        return color.equals("red");
    }
    public boolean isGreen(){
        return color.equals("green");
    }
    public int getDuration(){
        return duration;
    }
}

public class oops8 {
  public static void main(String args[]){
       TrafficLight light = new TrafficLight("red", 15);

       System.out.println("The light is now green "+light.isGreen());
       System.out.println("The light is now red "+light.isRed());

       light.changeColor("green");
       System.out.println("The light is now green "+light.isGreen());
  }    
}
