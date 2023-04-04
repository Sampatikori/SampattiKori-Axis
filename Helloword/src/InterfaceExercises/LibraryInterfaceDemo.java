package InterfaceExercises;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        LibraryUser l= new KidUsers(10,"Kids");
        l.registerAccount();
        l.requestBook();

        l = new KidUsers(18,"Fiction");
        l.registerAccount();
        l.requestBook();


        l=new AdultUsers(5,"Kids");
        l.registerAccount();
        l.requestBook();

        l=new AdultUsers(23,"Fiction");
        l.registerAccount();
        l.requestBook();


    }
}
