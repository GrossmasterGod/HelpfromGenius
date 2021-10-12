import java.util.List;

public class ConsoleView implements View{
    @Override
    public void showGetBooklist(List<Book> bookList) {
        for (int i = 0;i<bookList.size();i++){
            System.out.println(bookList.get(i));
        }
    }

    @Override
    public void showGetBooksByAuthor(List<Book> sortedbyAuthor) {
        for (int i = 0;i<sortedbyAuthor.size();i++){
            System.out.println(sortedbyAuthor.get(i));
        }
    }

    @Override
    public void showGetBooksByEdition(List<Book> sortedByEdition) {
        for (int i = 0;i<sortedByEdition.size();i++){
            System.out.println(sortedByEdition.get(i));
        }
    }

    @Override
    public void showGetBooksByYear(List<Book> sortedByYear) {
        for (int i = 0;i<sortedByYear.size();i++){
            System.out.println(sortedByYear.get(i));
        }
    }

    @Override
    public void showSortBooksByEdition(List<Book> BookList) {
        for (int i = 0;i<BookList.size();i++){
            System.out.println(BookList.get(i));
        }
    }
}
