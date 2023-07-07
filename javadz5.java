import java.util.ArrayList;
import java.util.HashMap;

public class javadz5{
    private static int num = 0;
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();
    public static void main(String[] args) {
        javadz5 pb = new javadz5();
        pb.add("Иванов", "8(861)573-43-21");
        pb.add("Петров", "8(800)421-42-43");
        pb.add("Симонов", "8(845)124-22-87");
        pb.add("Печкин", "8(643)433-61-45");
        pb.add("Карпов", "8(643)233-57-12");
        pb.add("Воробьёв", "8(654)423-41-32");
        pb.add("Якин", "8(932)123-64-34");
        pb.add("Носов", "8(965)612-33-65");
        pb.add("Голубцов", "8(445)345-31-34");
        pb.add("Печкин", "8(805)532-13-42");
        for (String x : pb.get("Печкин")) {
            num++;
            System.out.println("Печкин " + num + " телефон: " + x);
        }
    }
    public void add(String surname, String phone) {
        ArrayList<String> strings = phoneMap.get(surname);
        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(surname, strings);
        }
    }
    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

}