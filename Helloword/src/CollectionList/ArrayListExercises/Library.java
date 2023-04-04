package CollectionList.ArrayListExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public ArrayList getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList bookList) {
        this.bookList = bookList;
    }
    public void addBook(Book bobj){
        bookList.add(bobj);
    }
    public boolean isEmpty(){
        if(bookList.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Book> viewAllBooks(){
        return bookList;
    }
    public ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> bookList = new ArrayList<Book>();
       Iterator itr=bookList.iterator();
       while(itr.hasNext()){
           Book book = (Book) itr.next();
               if(book.getAuthor().equals(author)){
                  bookList.add(book);
               }else {
                   System.out.println("the list is empty");
               }
            }
              return bookList;
    }

    public int countNoOfBook(String bname){
        int count=0;
        for (Book b:bookList){
                if (b.getAuthor().equals(bname)) {
                   count++;
                }
            }
        return count;
    }

}
