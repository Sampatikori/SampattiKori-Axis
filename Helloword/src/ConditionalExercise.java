public class ConditionalExercise {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if(a>=b){
            System.out.println("Value of a is greater then or equals to b");
        }
        else {
            System.out.println("a is not greater then b");
        }
        if((a>=b)&&(a!=b)){
            System.out.println("a is greater then or equal to b" + "and "+"a is not equal to b");
        }
        else {
            System.out.println("a is neither greater nor equal to b");
        }

    }
}
