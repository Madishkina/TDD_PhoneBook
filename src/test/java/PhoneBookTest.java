import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();
    Map<String, Integer> expected = new TreeMap<>();

    @Test
    void add() {
        PhoneBook.add("София", 1234567891);
        PhoneBook.add("Петя", 1234567892);
        int actualNumber = PhoneBook.add("Петя", 1234567892);
        int expectedNumber = expected.size();

        Map<String, Integer> actual = PhoneBook.getPhoneBook();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}