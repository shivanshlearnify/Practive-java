package oops;

public class oops3 {
    static class Reactangle{
        int width;
        int height;

    public Reactangle(int w, int h){
        this.width=w;
        this.height=h;
    }

    public int area(){
        return width*height;
    }
    public int perimeter(){
        return (width+height)*2;
    }

    }

    public static void main(String args[]){
        Reactangle one = new Reactangle(10,8);

        System.out.println(one.area());
        System.err.println(one.perimeter());
    }
}
