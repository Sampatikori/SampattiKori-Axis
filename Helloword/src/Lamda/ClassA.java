package Lamda;

public class ClassA {
    int x;
     class ClassB{
        int y;
         String display(){
             return "this method is from classB";
        }
    }

    String sayHelli(){
         //inner class can be declared--Local class
          class ClassE {
              void m1() {
                  System.out.printf("from the method of classa in the static class");
              }
          }
            class ClassC {  //static - local class

                //datamembers
                //member functions

            }


        Thread thread = new Thread();//anonymous, local class , no name
//        public void run(){
            System.out.println("new thread is created");
//        };

        return "this method is from classa";
    }

    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        obj1.sayHelli();

//        ClassB obj2 = new ClassB();  (making classB method as static)
//        obj2.display();

        ClassB obj2 = obj1.new ClassB(); //non static inner class
        obj2.display();

    }
}
