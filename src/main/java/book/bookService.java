package book;

public interface bookService {
    void add(book book);
    void delete(int id);
    void update(int id,String name, String author);
    book getbook(int id);


    book[] getbooks ();
}
