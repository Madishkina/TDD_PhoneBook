import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;



class PhoneBookTest {

    Map<String, Integer> expected = new TreeMap<>();
    @BeforeAll
           static void contactAdd() {
        PhoneBook.add("София", 1234567891);
        PhoneBook.add("Петя", 1234567892);
    }
    @Test
    void add() {
        int actualNumber = PhoneBook.add("Петя", 1234567892);
        expected.put("Петя", 1234567892);
        expected.put("София", 1234567891);
        int expectedNumber = expected.size();
        Map<String, Integer> actual = PhoneBook.getPhoneBook();
        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expectedNumber, actualNumber);
    }
    @Test
    void findByNumber() {
        String expected = "София";
        String actual = PhoneBook.findByNumber(1234567891);
        String nonExpected = "Петя";
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(nonExpected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    void findByName() {
        int expected = 1234567892;
        String actual = PhoneBook.findByName("Петя");
        int nonExpected = 1234567891;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(nonExpected, actual);
        Assertions.assertNotNull(actual);
    }
}