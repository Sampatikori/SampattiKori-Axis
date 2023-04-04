public class NumberCheck {
    static void displayBigNumber(int num1,int num2,int num3){
        if((num1>num2)&&(num1>num3)){
            System.out.println( num1 +" is largest");
        } else if (num2>num3) {
            System.out.println( num2 +" is largest");
        }else {
            System.out.println( num3 +" is largest");
        }
    }
    public static void main(String[] args) {
       displayBigNumber(11,18,7);


    }
}
