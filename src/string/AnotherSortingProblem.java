package string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AnotherSortingProblem {
    static class Book{
        String title;
        int number;

        public Book(String str, int number){
            this.title = str;
            this.number = number;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfBooks = sc.nextInt();
        int bookNameLength = sc.nextInt();
        Book[] books = new Book[numberOfBooks];
        for(int i = 0; i < numberOfBooks; i++){
            Book pair = new Book(sc.next(), i+1);
            books[i] = pair;
        }

        Arrays.sort(books, new Comparator<Book>(){
            public int compare(Book b1, Book b2){
                for(int i = 0; i < b1.title.length(); i++){
                    if( b1.title.charAt(i) != b2.title.charAt(i)){
                        if(i%2 == 0){
                            return Character.compare(b1.title.charAt(i), b2.title.charAt(i));
                        }else{
                            return Character.compare(b2.title.charAt(i), b1.title.charAt(i));
                        }
                    }
                }
                return 0;
            }
        });
        for(Book book:books){
            System.out.print(book.number+" ");
        }
    }
}
