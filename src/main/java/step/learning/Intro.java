package step.learning;

import java.util.*;
import java.util.stream.Stream;

public class Intro {
    public void demo() {
        System.out.println("Java intro");
        byte b = 10;                // Цілі числа різної розмірності
        short s = 1000;             // ! всі типи знакові, беззнакових - немає
        int i = 10000000;           //
        long l = 1000000000000L;    //
        float f = 0.1f;
        double d = 1.23E-4;
        char c = 'A';
        boolean bb = true;

        int[] arr = new int[10];
        int[][] arr2;   // jagged - "рвані"масиви з можливою різною кількість у підмасивах

        List<String> list1 = new ArrayList<>(); //<> - diamond operator
        List<String> list2 = new LinkedList<>();
        list1.add("Hello");                     // String Pooling компілятор веде перелік вже створених рядків
        list2.add("Hello");                     // і друга поява вже створеного рядка посилається на першу
        if(list1.get(0) == list2.get(0))        // тут об'єкти рівні через стрінг пулінг
        {
            System.out.println("Equals");       //
        }
        else
        {
            System.out.println("No equals");
        }
        list1.add("World");
        list2.add("World !");

        Map<Integer, String> map = new HashMap<>(); // аналог Dictionary, Integer - boxing(int)
        map.put(10, new String("Hello"));
        if(list1.get(0) == map.get(10))     // == це reference equals -- два посилання на один об'єкт
        {                                   // порівняння контенту слід вживати str1.equals(str2)
            System.out.println("Equals");
        }
        else
        {
            System.out.println("No equals");
        }
        if(list1.get(0).equals(map.get(10)))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("No equals");
        }

        for( String str : list1 ) // ~foreach
        {
            System.out.print(str +" "); // без "LN" без переведення рядка
        }
        System.out.println();
        map.put(20, "World!!");
        for(Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.printf(          // F - форматний вивід
                    "%d => %s, ",       // формат з плейсхолдерами (%[type])
                    entry.getKey(),     //
                    entry.getValue());
        }
        Scanner kbScanner = new Scanner(System.in); // сканер вхідного потоку, запити на його читання зупиняють роботу
        System.out.print("\nEnter your name: ");
        String name = kbScanner.next(); // одне слово
        System.out.println("Hello, " + name + "!");
        System.out.print("\nEnter your name2: ");
        System.out.print("\nДля продовження натисніть будь-яку кнопку");
        Scanner console = new Scanner(System.in);
        String name2 = console.nextLine();
        int age = console.nextInt();

        System.out.println("Name: " + name2);
        System.out.println("Age: " + age);
    }
}
/*
Після створення нового проєкту необхідно налаштувати конфігурацію
запуску ( за замовченням запускається поточний файл ).

Типи даних - всі reference за винятком примітивів
(byte, short, int, long, float, double, char, boolean)


*/