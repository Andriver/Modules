package module10;
import java.util.List;

public class TestModule10 {
    public static void main(String[] args) {

        PhoneValidator phoneValidator = new PhoneValidator();
        phoneValidator.validateFile("src/main/java/module10/data/file.txt");

        List<User> users = User.downloadUsersFromFile("src/main/java/module10/data/users.txt");
        FilesUtils.saveTextFile("src/main/java/module10/data/user.json", User.toJson(users));

        System.out.println("-----------------------------------");

        WordsUtils.countWordInFile("src/main/java/module10/data/words.txt");

    }
}