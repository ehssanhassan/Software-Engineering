package Ehsan.factoryDesignPattern;


    public class BookFactory {
        public static Book createBook(String type) {
            if (type.equalsIgnoreCase("novel")) {
                return new Novel();
            } else if (type.equalsIgnoreCase("textbook")) {
                return new Textbook();
            } else if (type.equalsIgnoreCase("cookbook")) {
                return new Cookbook();
            } else {
                return null;
            }
        }
    }

