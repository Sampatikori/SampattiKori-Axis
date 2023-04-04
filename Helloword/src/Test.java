public class Test {
    int a,b;

    Test(int i, int j){
    a=i;
    b=j;

    }
    void alterPrimitive(int x,int y){
        x=60;
        y=30;
    }
    void alterObject(Test O){
        O.a=25;
        O.b=62;
    }

    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        System.out.println("Object state before alterPrimitive method call ob1.a : "+ ob1.a + " ob1.b : " + ob1.b);
        ob1.alterPrimitive(ob1.a , ob1.b);
        System.out.println("Object state after alterPrimitive method call ob1.a : "+ ob1.a + " ob1.b : " + ob1.b);
        System.out.println("Object state before alterObject method call ob1.a : "+ ob1.a + " ob1.b : " + ob1.b);
    }


}
