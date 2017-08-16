package ru.geekbrains.java.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 15.08.2017.
 */
public class Task12<T> {

    T[] list;

    public Task12(T[] list) {
        this.list = list;
    }

    public T[] swapArrayElements(){
        int n = list.length;
        if(n == 2){
            T a = list[0];
            T b = list[1];
            list[0] = b;
            list[1] = a;
        } else {
            System.out.println("ArrayLengthError:В массиве " + n +" элемент(-а,-ов).");
        }
        return list;
    }

    public ArrayList<T> changeToArrayList(T[] list){
        ArrayList<T> arrayList = new ArrayList<T>();
        int cnt = list.length;
        for (int i = 0; i < cnt ; i++) {
            arrayList.add(list[i]);
        }
        return arrayList;
    }

}
