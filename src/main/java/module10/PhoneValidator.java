package module10;
import java.util.List;
import java.util.regex.Pattern;

public class PhoneValidator {
    public void validateFile(String filePath){

        List<String> fileLines = FilesUtils.getLinesFromFile(filePath);

        for (String phoneNumber : fileLines) {
            if (validatePhone(phoneNumber)){
                System.out.println(phoneNumber);
            }
        }

    }

    public boolean validatePhone(String phoneNumber){
        return Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4}$")
                .matcher(phoneNumber)
                .find();
    }
}

