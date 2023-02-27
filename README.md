# TDD_PhoneBook
## Задача 1. Разработка через тестирование

## Описание

Так как мы прошли Test Driven Development, попытаемся разработать минимальную программу с помощью этого подхода.

Вам нужно разработать класс телефонной книги, которая позволяет:

* `add` — добавить имя с номером. Метод должен возвращать количество контактов после добавления, при этом гарантируется, что не будут добавляться повторяющиеся имена;
* `findByNumber` — найти имя по номеру без полного перебора;
* `findByName` — найти номер по имени без полного перебора;
* `printAllNames` — вывести все имена в алфавитном порядке без необходимости проводить сортировку.

## Реализация

Класс телефонной книги нужно разрабатывать поэтапно — по одному методу за раз. Следуйте техникам TDD. Таким образом, разработка должна проходить по этапам:

1. Создать пустой мавен-проект.
2. Создать пустой класс `PhoneBook`.
3. Создать пустой класс тестов `PhoneBookTest`.
4. Сделать коммит с сообщением `Initial commit`.
5. Создать пустой метод-заглушку `add` в классе `PhoneBook`, который только возвращает `0`.
6. Создать тест или тесты на метод `add` в классе тестов `PhoneBookTest`.
7. Убедиться, что всё компилируется и тесты не проходят. Сделать коммит с сообщением `Stub and tests for add`.
8. Реализовать метод `add` так, чтобы все тесты проходили.
9. Сделать коммит с сообщением `add implemented`.
10. Создать пустой метод-заглушку `findByNumber` в классе `PhoneBook`, который только возвращает `null`.
11. Создать тест или тесты на метод `findByNumber` в классе тестов `PhoneBookTest`.
12. Убедиться, что всё компилируется и тесты не проходят. Сделать коммит с сообщением `Stub and tests for findByNumber`.
13. Реализовать метод `findByNumber` так, чтобы все тесты проходили.
14. Сделать коммит с сообщением `findByNumber implemented`.
15. ...

После того, как вся функциональность реализована, сделайте пуш в новый репозиторий. Убедитесь, что все тесты проходят и у вас сделаны все требуемые в задании коммиты.

