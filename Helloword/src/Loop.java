public class Loop {
    public static void main(String[] args) {
//        displaying numbers upto 20
        int num = 1;
        while (num <= 20) {
            System.out.print(num++ + " ");
            System.out.println();
        }
//        display even numbers using do while
        int a =2;
        do{
            System.out.print(a+" ");
            System.out.println();
            a +=2;

        }while (a <21);

//       display odd numbers using for loop
        for (int i=1; i<20; i++){
            if(i%2!=0){
                System.out.print(i+" ");
                System.out.println();
                i++;
            }
        }
    }
}
