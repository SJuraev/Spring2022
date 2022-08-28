package string_methods;

public class EqualsAndIgnoreCase {

    public static void main(String[] args) {

        String userName = "Chime";
        String password = "HardPa$$";
        if(userName.equalsIgnoreCase("chime")){
            if(password.equals("HardPa$$")){
                System.out.println("Login Success");
            }else {
                System.err.println("Wrong Login or Password");
            }

            //FullName
            //DOB
            //SSN


        }
    }
}
