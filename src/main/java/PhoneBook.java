import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    static Map<String, Integer> phoneBook = new TreeMap<>();
    public static Map<String, Integer> getPhoneBook() {
        return phoneBook;
    }
    public static int add(String name, int phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.putIfAbsent(name, phoneNumber);
        }
        return phoneBook.size();
    }

    public static String findByName(String name) {
        return null;
    }

    static String findByNumber(int phoneNumber){
        Set<Map.Entry<String, Integer>> entrySet = phoneBook.entrySet();
        String name = null;
        for (Map.Entry<String, Integer> nameNumberPair : entrySet) {
            if (phoneNumber == nameNumberPair.getValue()) {
                name = nameNumberPair.getKey();
            }
        }
        return name;
    }
}
