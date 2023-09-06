package oops;

public class oops1 {
    static class person{
        String name;
        int age;

        public person(String nam, int ag){
            this.name = nam;
            this.age = ag;
        }
        public String getN(){
          return name;
        }
        public int getA(){
            return age*2;
        }

    }

    public static void main (String args[]){
        person p1 = new person("shivansh", 10);

        System.out.println(p1.getN()+" "+p1.getA());

    }
}
