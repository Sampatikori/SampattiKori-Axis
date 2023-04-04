public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer strb = new StringBuffer("Vaishnavi");
        System.out.println(strb.append(" Janor"));
       System.out.println(strb.insert(4,"k"));
       System.out.println(strb.deleteCharAt(5));
        System.out.println(strb.capacity());
        System.out.println(strb.reverse());
        System.out.println(strb.hashCode());
    }
}
