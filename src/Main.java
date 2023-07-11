// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Домашнее задание №2");
        System.out.println("Переменные. Урок 1");
        //Задание 1
        task1();
        System.out.println(".....");
        //Задание 2
        task2();
        System.out.println(".....");
        //Задание 3
        task3();
        System.out.println(".....");
        //Задание 4
        task4();
        System.out.println(".....");
        //Задание 5
        task5();
        System.out.println(".....");
        //Задание 6
        task6();
        System.out.println(".....");
        //Задание 7
        task7();
        System.out.println(".....");
        //Задание 8
        task8();
        System.out.println("_________");
        System.out.println("Домашка закончилась. Всем спасибо, все свободны.");
    }

    private static void task8() {
        System.out.println("Задание 8");
        //Инициализация
        var workTime = 640;
        int pipl;
        var piplPlus = 96;
        int totalPipl;
        var timePipl = 8;
        int timePpelPlus;
        //Решение
        pipl = workTime / timePipl;
        System.out.println("Всего работников в компании — "+pipl+" человек.");
        totalPipl = pipl + piplPlus;
        timePpelPlus = workTime / totalPipl;
        System.out.println("Если в компании работает "+totalPipl+" человек, то всего "+timePpelPlus+" часов работы может быть поделено между сотрудниками");

    }

    private static void task7() {
        System.out.println("Задание 7");
        //Инициализация
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        //Решение и Вывод
        System.out.println("И так...");
        System.out.println("Вес каждого боксера: " + boxerWeight1 + "кг, и " + boxerWeight2 + "кг.");
        var totalWeight = boxerWeight2-boxerWeight1;
        System.out.println("Разница в весе боксеров " + totalWeight + "кг. (вычитание)");
        totalWeight = (boxerWeight1 + boxerWeight2) % boxerWeight1;
        System.out.println("Разница в весе боксеров " + totalWeight + "кг. (остаток от деления)");
        totalWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе боксеров " + totalWeight + "кг. (остаток от деления)");
    }

    private static void task6() {
        System.out.println("Задание 6");
        //Инициализация
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        //Решение и Вывод
        System.out.println("И так...");
        System.out.println("Вес каждого боксера: " + boxerWeight1 + "кг, и " + boxerWeight2 + "кг.");
        var totalWeight = boxerWeight1+boxerWeight2;
        System.out.println("Общий вес боксеров " + totalWeight + "кг.");
    }

    private static void task5() {
        System.out.println("Задание 5");
        //Инициализация
        var frog = 3.5;
        //Решение и Вывод
        System.out.println("И так...");
        System.out.println("Frog = " + frog);
        frog *= 10;
        System.out.println("Умножаем в 10 раз.");
        System.out.println("Frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Делим на 3.5.");
        System.out.println("Frog = " + frog);
    }

    private static void task4() {
        System.out.println("Задание 4");
        //Инициализация
        var frend = 19;
        //Решение и Вывод
        System.out.println("И так...");
        System.out.println("Frend = " + frend);
        frend += 2;
        System.out.println("Прибавим 2.");
        System.out.println("Frend = " + frend);
        frend = frend / 7;
        System.out.println("Делим на 7.");
        System.out.println("Frend = " + frend);

    }

    private static void task3() {
        System.out.println("Задание 3");
        //Инициализация
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        //Решение
        dog = dog - 3.5;
        cat -= 1.6;
        paper -= 7639;
        //Вывод
        System.out.println("Убавляем кому что надо.");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task2() {
        System.out.println("Задание 2");
        //Инициализация
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        //Решение
        dog = dog + 4;
        cat += 4;
        paper += 4;
        //Вывод
        System.out.println("Прибавляем всем по 4");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task1() {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Обьявленны переменные:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

}