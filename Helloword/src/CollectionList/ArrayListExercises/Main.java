package CollectionList.ArrayListExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lb = new Library();
        int c,i;
        String str;
        while(true){
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search book by author");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.println("enter your choice:");
                c=sc.nextInt();

                if(c==1){
                    Book b=new Book();

                    System.out.println("enter the isbnno : ");
                    i=sc.nextInt();
                    b.setIsbnno(i);

                    System.out.println("enter the book name");
                    str=sc.next();
                    b.setBookName(str);

                    System.out.println("enter the author name");
                    str=sc.next();
                    b.setAuthor(str);

                    lb.addBook(b);
                }

                if(c==2){
                    ArrayList<Book> list = lb.viewAllBooks();
                    if(list.isEmpty()) {
                        System.out.println("the list is empty");
                        continue;
                    }
                   Iterator itr=list.iterator();
                    for (Book b1:list) {
                        System.out.println(b1.toString());

                    }
                }

                if(c==3){
                    System.out.println("enter the author name: ");
                    str=sc.next();
                    ArrayList<Book> list=lb.viewBooksByAuthor(str);
                    if(list.isEmpty()) {
                        System.out.println("None of the book published by the author "+str);
                        continue;
                    }
                    Iterator itr=list.iterator();
                    for (Book b1:list) {
                        System.out.println(b1.toString());

                    }

                }
                if(c==4){
                    System.out.println("enter the book name: ");
                    str=sc.next();
                    ArrayList<Book> list=lb.viewBooksByAuthor(str);
                    System.out.println("Count is "+lb.countNoOfBook(str));

                }

                if(c==5){
                    System.exit(0);
                }

        }

    }
}
