import java.util.Map;
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

    public static String findByName(String софия) {
        return null;
    }

    String findByNumber(){
        return null;
    }
}
