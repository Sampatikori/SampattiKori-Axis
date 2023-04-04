
public class DisplayElInArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int num=10;
        for(int i=0; i<arr.length; i++) {
            arr[i]=num;
            num=num+10;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        }

    }

