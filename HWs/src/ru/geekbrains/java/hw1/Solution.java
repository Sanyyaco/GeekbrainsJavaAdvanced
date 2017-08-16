package ru.geekbrains.java.hw1;

import ru.geekbrains.java.hw1.Task3.Apple;
import ru.geekbrains.java.hw1.Task3.Box;
import ru.geekbrains.java.hw1.Task3.Orange;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by Administrator on 15.08.2017.
 */
public class Solution {

    //Задача 3
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        System.out.println("Достаем коробки.");
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        System.out.println();

        System.out.println("Берем фрукты и наполняем коробки.");
        Orange oranges = new Orange(4);
        Apple apples = new Apple(4);
        orangeBox.putFruitToBox(oranges);
        appleBox.putFruitToBox(apples);
        System.out.println();

        System.out.println("Сравниваем коробки по весу.");
        orangeBox.compare(appleBox);
        System.out.println();

        System.out.println("Перекладываем фрукты из одной коробки в другую.");
        appleBox.emptyBox(appleBox2);
        System.out.println();

    }

    //Задачи 1 и 2
    public static void main1(String[] args) {

        // Решение 1-й задачи
        Integer[] list = new Integer[]{1,2};
        System.out.println(Arrays.toString(list));
        Task12<Integer> t = new Task12(list);
        System.out.println(Arrays.toString(t.swapArrayElements()));
        System.out.println("-------------------------------");

        // Решение 2-й задачи
        System.out.println(t.changeToArrayList(list).getClass().getName());
        System.out.println("-------------------------------");



    }

}
