package step.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public void demo()
    {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanenko Ivan", "0500123456");
        map.put("Petrenko Petro", "0631234567");
        map.put("Semonenko Semen", "0962345678");
        map.put("Stepanenko Stepan", "0953456789");
        map.put("Ostapenko Ostap", "0994567890");
        System.out.println("Welcome to the phone Book!");
        Scanner userActionScanner = new Scanner(System.in);
        String userAction;
        int res = 0;
        do
        {
            System.out.println();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("Ви маєте можливість виконати наступні дії:\n" +
                    "1 - переглянути всі номери\n" +
                    "2 - пошук за номером телефону\n" +
                    "3 - пошук за Прізвищем/Ім'ям абонента\n" +
                    "4 - додати запис\n" +
                    "0 - вихід\n");
            System.out.println("Будь-ласка зробіть ваш вибір!");
            userAction = userActionScanner.next();
            switch (userAction)
            {
                case "1":
                    for(Map.Entry<String, String> entry : map.entrySet())
                    {
                        System.out.printf(
                                "\t%s \t=> %s,\n ",
                                entry.getKey(),
                                entry.getValue());
                    }
                    break;
                case "2":
                    Scanner userEnterPhoneNumberScanner = new Scanner(System.in);
                    System.out.println("Будь-ласка, введіть номер телефону для пошуку:");
                    String userEnterPhoneNumber = userEnterPhoneNumberScanner.nextLine();
                    for(Map.Entry<String, String> entry : map.entrySet())
                    {
                        if(entry.getValue().contains(userEnterPhoneNumber))
                        {
                            System.out.printf(
                                    "\t%s \t=> %s,\n ",
                                    entry.getKey(),
                                    entry.getValue());
                            res++;
                        }
                    }
                    if(res==0)
                    {
                        System.out.println("Нажаль абонент з таким номером телефону відсутній.");
                    }
                    break;
                case "3":
                    Scanner userEnterAbonentScanner = new Scanner(System.in);
                    System.out.println("Будь-ласка, введіть прізвище або ім'я для пошуку:");
                    String userEnterAbonent = userEnterAbonentScanner.nextLine();
                    System.out.println(userEnterAbonent);
                    for(Map.Entry<String, String> entry : map.entrySet())
                    {
                        if((entry.getKey().startsWith(userEnterAbonent))||(entry.getKey().endsWith(userEnterAbonent))||(entry.getKey().equals(userEnterAbonent)))
                        {
                            System.out.printf(
                                    "\t%s \t=> %s,\n ",
                                    entry.getKey(),
                                    entry.getValue());
                            res++;
                        }
                    }
                    if(res==0)
                    {
                        System.out.println("Нажаль абонент з таким Ім'ям відсутній.");
                    }
                    break;
                case "4":
                    Scanner userAddAbonentScanner = new Scanner(System.in);
                    System.out.println("Будь-ласка введіть Прізвище та Ім'я нового абонента");
                    String userNameAddAbonent = userAddAbonentScanner.nextLine();
                    System.out.println("Будь-ласка введіть номер телефона нового абонента");
                    String userPhoneAddAbonent = userAddAbonentScanner.nextLine();
                    map.put(userNameAddAbonent, userPhoneAddAbonent);
                    System.out.println("Вітаємо! Ви додали нового абонента");
                    break;
                case "0":
                    System.out.println("Дякую, за плідну співпрацю.\nДо побачення!");
                    break;
                default:
                    System.out.println("Будь-ласка зробіть ваш вибір щє раз!");
                    break;
            }
            res = 0;
        }
        while (!userAction.equals("0"));
    }
}
