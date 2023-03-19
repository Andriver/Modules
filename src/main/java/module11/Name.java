package module11;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Name {
    public  static List<String> namesWithUnpairedIndex(ArrayList<String> list){
        return list.stream()
                .filter(name ->  list.indexOf(name)%2 != 0)
                .map(name -> list.indexOf(name) + ". " + name)
                .collect(Collectors.toList());
    }
}