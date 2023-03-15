package module10;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<User> downloadUsersFromFile(String filePath){
        List<String> fileLines = FilesUtils.getLinesFromFile(filePath);
        List<User> users = new ArrayList<>();

        String line = "";
        String[] lineData;

        for (int i = 1; i < fileLines.size(); i++) {
            line = fileLines.get(i);
            lineData = line.split(" ");
            users.add(new User(lineData[0], Integer.parseInt(lineData[1])));
        }

        return users;
    }

    public static String toJson(List<User> userList){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(userList);
    }


}