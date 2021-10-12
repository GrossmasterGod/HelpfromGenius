import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
//       Book book = new Book("Kek","Shrek","Mems",2020,100,300);
//        System.out.println(book.toString());
//        String[] names = {"Trainspotting","Marabou Stork Nightmares","The Sea-Wolf","White Fang"
//                ,"Crime and Punishment","The Idiot","Fathers and Sons","Gulliver's Travels","Master and Margarita","Heart of a Dog"};
//        String[] authors = {"Irvine Welsh","Irvine Welsh","Jack London","Jack London"
//                ,"Fyodor Dostoevsky","Fyodor Dostoevsky","Ivan Turgenev","Jonathan Swift","Mikhail Bulgakov","Mikhail Bulgakov"};
//        String[] editions = {"Harvill Secker","Harvill Secker","Macmillan","Macmillan"
//                ,"Russian Messenger","Russian Messenger","Russian Messenger","Benjamin Mot","YMCA Press","Harcourt Brace"};
//        Integer[] years = {1993,1995,1904,1906,1866,1869,1862,1726,1967,1925};
//        Integer[] pages = {390,368,296,316,417,390,226,454,358,198};
//        Integer[] prices = {75,50,23,54,17,26,76,127,84,92};
//        ArrayList<Book> bookList = new ArrayList<Book>();
//            for(int i = 0;i < 10;i++){
//                Book b = new Book(names[i],authors[i],editions[i],years[i],pages[i],prices[i]);
//                bookList.add(b);
//                System.out.println(bookList.get(i));
//            }
        Data data = new Data();
        System.out.println(data.Booklist().get(0).toString());
    }
}

