package module10;
import java.util.List;

public class TestModule10 {
    public static void main(String[] args) {

        PhoneValidator phoneValidator = new PhoneValidator();
        phoneValidator.validateFile("data//file.txt");

        List<User> users = User.downloadUsersFromFile("data//users.txt");
        FilesUtils.saveTextFile("data//user.json", User.toJson(users));

        System.out.println("-----------------------------------");

        WordsUtils.countWordInFile("data//words.txt");

    }
}