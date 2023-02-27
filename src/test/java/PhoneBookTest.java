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
        int expected = 1234567891;
        String actual = PhoneBook.findByName("София");
        int nonExpected = 1234567892;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(nonExpected, actual);
        Assertions.assertNotNull(actual);

    }
}