public class MethodOverloading {


       void add() {
           System.out.println("method with no parameter");
        }

        void add(int a,int b,int c){
           int sum=a+b+c;
           System.out.println("sum of a,b,c is "+sum);

        }
    void add(float x, float y) {
        float f = x + y;
        System.out.println("float addition = " + f);
    }

        void add(String s1,String s2){
           String s3=s1+s2;
           System.out.println("Sum of two strings"+s3);

    }

}

