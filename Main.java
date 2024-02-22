package Ehsan.factoryDesignPattern;
    public class Main {
        public static void main(String[] args) {
            Book novel = BookFactory.createBook("novel");
            Book textbook = BookFactory.createBook("textbook");
            Book cookbook = BookFactory.createBook("cookbook");

            novel.display();
            textbook.display();
            cookbook.display();
        }
    }

