package oops;

public class oops2 {
    static class Dog{
        String name;
        String breed;

        public Dog(String nam, String bree){
             this.name = nam;
             this.breed = bree;

        }
        public String getn(){
            return name;
        }
         public void getb(String nam){
            this.name = nam;
        }
        
    }


    public static void main(String args[]){
        Dog one = new Dog("sheero", "german shephard");

        System.out.println(one.getn());
        one.getb("rocko");
        System.out.println(one.getn());
}
}
