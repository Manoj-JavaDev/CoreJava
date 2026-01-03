package corejava.assesment1;

public class AggregationVsCompositionDemo {
    public static void main(String[] args) {

        // Aggregation
        Book b = new Book("Java Programming");
        Library lib = new Library(b);
        lib.showBook();

        // Composition
        House h = new House();
        h.showRoom();
    }
}

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}


class Library {
    Book book;
    Library(Book book) {
        this.book = book;
    }

    void showBook() {
        System.out.println("Library has book: " + book.title);
    }
}

class Room {
    int roomNumber;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}

class House {
    Room room;

    House() {
        room = new Room(1);
    }

    void showRoom() {
        System.out.println("House has room number: " + room.roomNumber);
    }
}



