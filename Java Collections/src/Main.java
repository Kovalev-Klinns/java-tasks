//Новогодний подарок. Определить иерархию конфет и прочих сладостей. Создать несколько объектов-конфет.
// Собрать детский подарок с определением его веса. Провести сортировку конфет в подарке на основе одного из параметров.
// Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;



public class Main {
    public static void main(String[] args) {
        System.out.println("Happy new year! You got a sweet present! :)");
        System.out.println("Print \"y\" if you want to open it, or \"n\" if you don't (the program's work will be finished)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!Pattern.matches("[yn]", input)) {
            System.out.print("Wrong input!");
            input = scanner.next();
        }
        if (input.equals("n")) {
            System.out.println(":C");
            System.exit(0);
        }

        ArrayList<Candy> box = new ArrayList<>();
        box.add(new Chocolate(12.4, 44));
        box.add(new Lollipop(11.7, 60));
        box.add(new Lollipop(12.1, 52));
        box.add(new Lollipop(12.8, 62));
        box.add(new Lollipop(13.8, 63));
        box.add(new Chocolate(25.9, 20));
        box.add(new Chocolate(14.9, 33));
        box.add(new Lollipop(11.2, 64));
        box.add(new Chocolate(15.9, 40));
        box.add(new Chocolate(12.5, 35));
        //Сортировка по весу: конфеты с большим весом находятся на дне коробки
        box.sort(new CandyWeightComparator());
        for (Candy e : box) {
            System.out.println(e);
        }
        System.out.println();

        // Подсчет общего веса всех конфет
        double sum = 0;
        for (int i = 0; i < box.size(); i++) {
            sum += box.get(i).getWeight();
        }
        System.out.println("Full weight candy from the box - " + Math.round(sum) + " grams");
        System.out.println();

        // Поиск конфет по содержанию сахара в заданном диапазоне
        System.out.println("Search for candy by sugar content in a given range");
        System.out.println("Indicate the lower limit of the range (integers only!)");
        while (!scanner.hasNextInt()) {
            System.out.println("This is not an integer");
            scanner.nextLine();
        }
        int lowerLimit = scanner.nextInt();

        System.out.println("Indicate the upper limit of the range (integers only!)");
        while (!scanner.hasNextInt()) {
            System.out.println("This is not an integer");
            scanner.nextLine();
        }
        int upperLimit = scanner.nextInt();

        // Вывод конфет с содержанием сахара в указанном диапозоне
        System.out.println("Candy with sugar content from " + lowerLimit + " to " + upperLimit + ":");
        for (Candy e : box) {
            if(e.getSugarContent() >= lowerLimit && e.getSugarContent() <= upperLimit) {
                System.out.println(e);
            }
        }
    }
}
