package practice.circle_classes;

public class TestAuthor {
    public static void main(String[] args) {

        Author author1 = new Author("Alisher Navoiy", 'm', "alishernavoiy@gmail.com");
        System.out.println(author1.getName());
        System.out.println(author1.getGender());
        System.out.println(author1.getEmail());
        author1.printInfo();
    }
}
