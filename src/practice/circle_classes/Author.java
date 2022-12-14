package practice.circle_classes;

public class Author {
    private String name;
    private char gender;
    private String email;

    public Author(String name, char gender, String email){
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo() {
        System.out.println("Author Info");
        System.out.println("Full name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("email: " + email);
    }
}
