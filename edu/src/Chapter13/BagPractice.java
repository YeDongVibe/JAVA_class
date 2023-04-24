package Chapter13;

class Book {
   String name;
}

class Pencil {
   String name;
}
/*
 * class Bag { Book book; Pencil pencil; }
 */

//Generic 클라스 p.614
class Bag<T> {
   T item;

   public Bag(T thing) {
      item = thing;
   }
   public T getThing() {
      return item;
   }
}

public class BagPractice {
   public static void main(String[] args) {
      // Bag b = new Bag<>();
      Bag<Book> b = new Bag<Book>(new Book());
      Bag<Pencil> p = new Bag<Pencil>(new Pencil());
      Book book = b.getThing();                                                                                                                   
   }
}