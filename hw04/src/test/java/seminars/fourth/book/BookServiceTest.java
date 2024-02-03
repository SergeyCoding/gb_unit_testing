package seminars.fourth.book;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class BookServiceTest {

    @Test
    void findBookById() {
        var mockBookService = Mockito.mock(BookRepository.class);
        Mockito.when(mockBookService.findById("5")).thenReturn(new Book("5"));

        var bs = new BookService(mockBookService);
        Book bookById = bs.findBookById("5");

        assertThat(bookById.getId()).isEqualTo("5");
    }

    @org.junit.jupiter.api.Test
    void findAllBooks() {
        var mockBookService = Mockito.mock(BookRepository.class);

        var mockBooks = new ArrayList<Book>();

        for (int i = 0; i < 5; i++) {
            mockBooks.add(new Book(Integer.toString(i)));
        }
        Mockito.when(mockBookService.findAll()).thenReturn(mockBooks);

        var bs = new BookService(mockBookService);

        var books = bs.findAllBooks();

        assertThat(books.size()).isEqualTo(5);
        assertThat(books.stream().map(Book::getId).toArray()).containsExactly("0", "1", "2", "3", "4");
    }
}
