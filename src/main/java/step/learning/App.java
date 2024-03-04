package step.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //new Intro().demo();
        new PhoneBook().demo();
    }
}
/*
JAVA - платформна  мова транслюючого типу 4го покоління з ООП парадигмою.
    - платформа JRE (JVM),
    - вихідний код file.java
    - виконавчий (проміжний) код file.class
    - головний файл [> java.exe file.class]
    - JDK - іструментарій розробника (компілятор + бібліотеки)
        java.exe file.java --> file.class
    - IDE: Intellij Idea, Netbeans, Eclipse, ...
    - бібліотеки коду - lib.jar (аналог DLL)

Сильна прив'язка до файлової системи
 -  файл з кодом (App.java) повинен називатись так само (реєстрочутливо)
    як і клас, що описаний в ньому.
 -  файли впорядковуються у каталоги (папки) назви яких дорівньоє
    назви пакету (package). Вимагається щонайменьше подвійна  вкладеність
    (пкщгз шв) за принципом "інверсного домену", тобто коди фірми, що має
    сайт (домен) firm.org, будуть у пакетах org - firm - ...

Є традиції іменування:
    - types: CapitalCamelCase
    - names: lowerCamelCase
    - packages: snake_case
    - const: PASCAL_CASE (deprecated)



*/