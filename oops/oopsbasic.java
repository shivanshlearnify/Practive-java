package oops;

public class oopsbasic {
   

static class pen {
    int tip;
    String color;

    void setcolor (String newColor){
        color = newColor;
    }
    void settip (int newTip){
        tip = newTip;
    }
}
 public static void main(String args[]){
        pen p1 = new pen();

        p1.setcolor("green");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
    }
}
