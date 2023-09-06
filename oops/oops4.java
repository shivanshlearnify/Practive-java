package oops;

public class oops4 {
    static class Circle{
        double radius;

    public Circle(int r){
        this.radius=r;
    }

    public double getradius(){
       return radius;
    }
    public void setradius(int r){
         this.radius=r;
    }
    public double radius(){
        return Math.PI * (radius * radius);
    }
    }

    public static void main(String args[]){
        Circle one = new Circle(5);
        
        System.out.println(one.radius);


    }
}
