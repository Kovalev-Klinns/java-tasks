// 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class ThirdTask {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 5, 33, 211};
        for (int i : numbers) {
            System.out.println(i);
            System.out.print(i + "  ");
        }
    }
}
