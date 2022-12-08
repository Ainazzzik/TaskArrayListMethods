import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


//        1. Напишите программу на Java, чтобы создать новый список массивов,
//        добавить несколько городов, вывести их в консоль.
        System.out.println("Ex.1 :");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Bishkek");
        strings.add("Osh");
        strings.add("Karakol");
        System.out.println(strings);
        System.out.println();

//      2. Напишите программу Java для вставки элемента в список массивов в первую позицию.
        System.out.println("Ex.2 :");
        ArrayList<String> names = new ArrayList<>();
        names.add("Ainazik");
        names.add("Aigerim");
        names.add("Davran");
        names.add("Abu-ALi");
        names.add("Ilim");
        names.add("Baiysh");
        names.add("Baytik");
        names.add("Samira");
        names.add("Yntymak");
        names.add("Kutman");
        names.add(0, "Muhammed");
        System.out.println(names);
        System.out.println();
//       3. Напишите программу Java для извлечения элемента (по указанному индексу) из заданного списка массивов.
        System.out.println("Ex.3 :");
        ArrayList<String> foods = new ArrayList<>();

        names.remove(5);

        System.out.println(names);
        System.out.println();

//        4. Напишите программу Java для обновления определенного элемента массива заданным элементом.
        System.out.println("Ex.4 :");
        names.set(0, "Samira");
        System.out.println(names);

        System.out.println();
//        5. Напишите программу на Java для удаления третьего элемента из списка массивов.
        System.out.println("Ex.5 :");
        names.remove(3);
        System.out.println(names);

        System.out.println();

//         6. Напишите программу Java для поиска элемента в списке массивов.
        System.out.println("Ex.6 :");
        System.out.println(names.contains("Baiysh"));
        System.out.println();
//        7. Напишите программу на Java для сортировки заданного списка массивов.
        System.out.println("Ex.7 :");
         Collections.sort(names);
        System.out.println(names);
        System.out.println();

//        8. Напишите программу на Java для копирования одного списка массивов в другой.
        System.out.println("Ex.8 :");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        ArrayList<Integer>integers1 = new ArrayList<>();
        integers1.addAll(integers);
        System.out.println(integers1);
        System.out.println();

//        9. Напишите программу на Java для перемешивания элементов в списке массивов.
        System.out.println("Ex.9 :");
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('#');
        characters.add('$');
        characters.add('@');
        characters.add('%');
        characters.add('*');
        Collections.shuffle(characters);
        System.out.println(characters);
        System.out.println();

//        10. Напишите программу на Java, чтобы поменять местами элементы в списке массивов.
        System.out.println("Ex.10 :");
        ArrayList<String>languages = new ArrayList<>();
        languages.add("Java");
        languages.add("JS");
        languages.add("C++");
        languages.add("Python");
        Collections.reverse(languages);
        System.out.println(languages);
        System.out.println();

//        11. Напишите программу Java для извлечения части массива
        System.out.println("Ex.11 :");
        ArrayList<String> regions = new ArrayList<>();
        regions.add("Yssyk-Kul");
        regions.add("Talas");
        regions.add("Batken");
        regions.add("Naryn");
        regions.add("Osh");
        regions.add("Djalal-Abad");

        System.out.println(regions.subList(0,3));


    }
}