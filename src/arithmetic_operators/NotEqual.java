package arithmetic_operators;

public class NotEqual {
    public static void main(String[] args) {
        //use cases for not equal
        //apple != orange
        //email
        //reset password
        // oldPassword != newPassword

        String oldPassword = "h@rdPa$$";
        String newPassword = "VeryHardPa$$word";
        boolean shouldNewPasswordBeApplied = oldPassword != newPassword;
        System.out.println(shouldNewPasswordBeApplied);//true

        //!=
        String person = "Elon Musk";
        boolean isBlackListed = true;
        boolean shouldThisPersonUseMyProduct = person != "John Doe";
        System.out.println(shouldNewPasswordBeApplied);//true

        boolean result = isBlackListed != true;
        System.out.println(result);//false

        String todaysDate = "08.04.2022";
        String newYear = "12.31.2022";
        boolean shouldIWork = todaysDate != newYear;
        System.out.println(shouldIWork);//true

    }
}
