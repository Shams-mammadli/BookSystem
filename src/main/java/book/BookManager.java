package book;

public class BookManager implements bookService {

    private book[] books = new book[100];
    private int count = 0;

    @Override
    public void add ( book databook ) {
        if (count < books.length) {
            books[count++] = databook;
            System.out.println("kitab elave olundu");
        } else {
            System.out.println("array doludur");
        }


    }

    @Override
    public void delete ( int id ) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                books[count - 1] = null;
                count--;
                System.out.println("element silindi");
            }

        }


    }

    @Override
    public void update ( int id, String name, String author ) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                books[i].setName(name);
                books[i].setAuthor(author);
                return;
            }
        }
        System.out.println("uygun kitab yoxdur");


    }

    @Override
    public book getbook ( int id ) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                return books[i];


            }
        }
        return null;
    }

    @Override
    public book[] getbooks () {
        return new book[0];
    }


}






